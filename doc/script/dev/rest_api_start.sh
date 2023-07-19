#!/bin/bash

## 실행 변수 설정
JAVA_HOME="/opt/jdk17"

APP_HOME="/data/webapps/rest_api"
BACK_HOME=/data/webapps/backup

RUN_APP=rest-api-server.jar
SERVICE_NAME=rest-api-server

LOG_DIR="/data/webapps/logs/rest_api"
APP_OUT="$LOG_DIR/$SERVICE_NAME.out"
GC_LOG_OUT="$LOG_DIR/gc.log"
SPRING_PROFILE=dev

prefix=`date +%Y%m%d%H%M`


## 실행중인 프로세스가 있으면 실행 중지
echo "Killing SERVICE_NAME:      $SERVICE_NAME"
echo "Killing SERVICE ID:      `ps -ef|grep -w D$SERVICE_NAME|grep -v grep|awk '{print $2}'`"

kill -9 `ps -ef|grep -w D$SERVICE_NAME|grep -v grep|awk '{print $2}'`


## 로그 파일 백업

mv $APP_OUT $LOG_DIR/backup/$SERVICE_NAME.out_$prefix
#mv $GC_LOG_OUT $LOG_DIR/backup/gc.log_$prefix
find $LOG_DIR -maxdepth 1 -name 'gc.log*' -exec mv {} {}_$prefix \;
find $LOG_DIR -maxdepth 1 -name 'gc.log*' -exec mv {} $LOG_DIR/backup \;

## 이전 소스 파일 백업 - 실행 디렉토리 이전 디렉토리에 배포 대상 소스가 있으면 백업 진행
if [ -f $APP_HOME/../$RUN_APP ]; then
  mv $APP_HOME/$RUN_APP $BACK_HOME/$RUN_APP.$prefix
  mv $APP_HOME/../$RUN_APP $APP_HOME/$RUN_APP
fi

## 실행 파일이 존재하면 Application 실행
if [ -f $APP_HOME/$RUN_APP ]; then
    JAVAOPTS="-Xms512m -Xmx1024m"
    JAVAGCOPTS="-verbose:gc -verbose:gc -Xlog:gc=debug:$GC_LOG_OUT:time,uptime,level,tags:filecount=10,filesize=10g -XX:+PrintGCDetails"

    nohup $JAVA_HOME/bin/java -D$SERVICE_NAME -Dspring.profiles.active=$SPRING_PROFILE $JAVAOPTS $JAVAGCOPTS -DLOG_TEMP="$LOG_DIR" -jar $APP_HOME/$RUN_APP >> $APP_OUT 2>&1 &
#    $JAVA_HOME/bin/java -D$SERVICE_NAME -Dspring.profiles.active=$SPRING_PROFILE $JAVAOPTS $JAVAGCOPTS -DLOG_TEMP="$LOG_DIR" -jar $APP_HOME/$RUN_APP
fi

echo "Using SERVICE_NAME:      $SERVICE_NAME"
echo "Using JAVA_HOME:      $JAVA_HOME"
echo "Using APP_HOME:      $APP_HOME"
echo "Using BACK_HOME:      $BACK_HOME"
echo "Using RUN_APP:      $RUN_APP"
echo "Using APP_OUT:      $APP_OUT"
echo "Using RUN Command: nohup $JAVA_HOME/bin/java -D$SERVICE_NAME -Dspring.profiles.active=$SPRING_PROFILE $JAVAOPTS $JAVAGCOPTS -DLOG_TEMP="$LOG_DIR" -jar $APP_HOME/$RUN_APP >> $APP_OUT 2>&1 &"
