#!/bin/sh
SERVICE_NAME=rest-api-server

echo "Killing SERVICE_NAME:      $SERVICE_NAME"
echo "Killing SERVICE ID:      `ps -ef|grep -w D$SERVICE_NAME|grep -v grep|awk '{print $2}'`"

kill -9 `ps -ef|grep -w D$SERVICE_NAME|grep -v grep|awk '{print $2}'`