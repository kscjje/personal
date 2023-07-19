package com.custom.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName : CustomRestapiServerApplication.java
 * @Description : Spring Boot Application 최초 실행 클래스
 *
 * @author : 김영철
 * @since  : 2022-11-09
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-09    김영철          최초 생성
 *
 * </pre>
 */

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
@SpringBootApplication
//@Import(EgovBootInitialization.class)
@ComponentScan(basePackages="com.custom")
public class CustomRestapiServerApplication {

    /**
     * Spring Boot Application 실행 Method
     * @exception Exception
     */
    public static void main(String[] args) {
        System.out.println("##### CustomRestapiServerApplication Start #####");

        SpringApplication springApplication = new SpringApplication(CustomRestapiServerApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        //springApplication.setLogStartupInfo(false);
        springApplication.run(args);

        System.out.println("##### CustomRestapiServerApplication End #####");
    }

}
