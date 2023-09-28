package com.custom.swagger;

import java.util.Map;
import java.util.TreeMap;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


/**
 * @ClassName : swaggerConfig.java
 * @Description : SpringDoc Swagger 3.0 설정을 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-24
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-24    김영철          최초 생성
 *
 * </pre>
 */

//@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customRESTApi(@Value("${springdoc.version}") String springdocVersion) {

        Info info = new Info().title("REST API 정의")
                .description("REST API 명세서 입니다.")
                .version(springdocVersion);



        Components components = new Components();

        return new OpenAPI()
//                .servers(servers)
                .components(components)
                .info(info);
    }

    @Bean
    public GlobalOpenApiCustomizer sortSchemasAlphabetically() {
        return openApi -> {
            @SuppressWarnings("rawtypes")
            Map<String, Schema> schemas = openApi.getComponents().getSchemas();
            if (schemas != null ) openApi.getComponents().schemas(new TreeMap<>(schemas));
        };
    }

    /****************************************************************************************************
     * 전체 REST API 정의서
     ****************************************************************************************************/
    @Bean
    public GroupedOpenApi customAllGroup() {
        return GroupedOpenApi.builder()
                .group("0. 서비스 - 전체 서비스")
                .pathsToMatch("/api/v1/**")
//                .addOpenApiCustomiser(sortSchemasAlphabetically())
                .build();
    }

    /****************************************************************************************************
     * 1. Custom 운영관리 시스템 REST API 정의서
     ****************************************************************************************************/
    @Bean
    public GroupedOpenApi fmcsAllGroup() {
        String groupName = "1. 운영관리 시스템 - 00. 전체";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
//                .addOpenApiCustomiser(sortSchemasAlphabetically())
                .build();
    }

    @Bean
    public GroupedOpenApi groupCmmn() {
        String groupName = "1. 운영관리 시스템 - 01. 공통";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.cmmn"
                , "com.custom.v1.controllers.fmcs.main"
                , "com.custom.v1.controllers.fmcs.bsis"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
//                .addOpenApiCustomiser(sortSchemasAlphabetically())
                .build();
    }

    @Bean
    public GroupedOpenApi groupMember() {
        String groupName = "1. 운영관리 시스템 - 02. 회원 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.mber"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/svc/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupLecture() {
        String groupName = "1. 운영관리 시스템 - 03. 강좌 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.lctr"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/prd/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupLocker() {
        String groupName = "1. 운영관리 시스템 - 04. 사물함 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.lckr"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/sys/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupErnt() {
        String groupName = "1. 운영관리 시스템 - 05. 대관 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.rntl"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/sys/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupCmg() {
        String groupName = "1. 운영관리 시스템 - 06. 입장 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.cmg"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/sys/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupTicket() {
        String groupName = "1. 운영관리 시스템 - 07. 매표 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.tckt"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/sys/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupIncome() {
        String groupName = "1. 운영관리 시스템 - 08. 수입 정산 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.incm"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/incme/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupStatistics() {
        String groupName = "1. 운영관리 시스템 - 09. 분석 통계";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.stats"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/instt/{instt}/sts/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupOperation() {
        String groupName = "1. 운영관리 시스템 - 10. 운영 설정 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.oper"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/instt/{instt}/oper/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupSystem() {
        String groupName = "1. 운영관리 시스템 - 11. 시스템 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.sys"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/instt/{instt}/sys/**")
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi groupContents() {
        String groupName = "1. 운영관리 시스템 - 12. 컨텐츠 관리";
        String packageList[] = {
                "com.custom.v1.controllers.fmcs.cms"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                //.pathsToMatch("/api/v1/instt/{instt}/cms/**")
                .packagesToScan(packageList)
                .build();
    }

    /****************************************************************************************************
     * 2. Custom 통합예약 시스템 시스템 REST API 정의서
     ****************************************************************************************************/
    @Bean
    public GroupedOpenApi frontAllGroup() {
        String groupName = "2. 통합예약 시스템 - 00. 전체";
        String packageList[] = {
                "com.custom.v1.controllers.frnt"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi frontCommonGroup() {
        String groupName = "2. 통합예약 시스템 - 01. 공통";
        String packageList[] = {
                "com.custom.v1.controllers.frnt.cmmn",
                "com.custom.v1.controllers.frnt.mber"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi frontReservationGroup() {
        String groupName = "2. 통합예약 시스템 - 02. 통합예약";
        String packageList[] = {
                "com.custom.v1.controllers.frnt.rsv"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi frontGuideGroup() {
        String groupName = "2. 통합예약 시스템 - 03. 시설 안내";
        String packageList[] = {
                "com.custom.v1.controllers.frnt.guid"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi frontCommunicationGroup() {
        String groupName = "2. 통합예약 시스템 - 04. 정보마당";
        String packageList[] = {
                "com.custom.v1.controllers.frnt.info"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi frontMyPageGroup() {
        String groupName = "2. 통합예약 시스템 - 05. 마이페이지";
        String packageList[] = {
                "com.custom.v1.controllers.frnt.mypg"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    /****************************************************************************************************
     * 3. Custom 설정관리 시스템 REST API 정의서
     ****************************************************************************************************/
    @Bean
    public GroupedOpenApi setupAllGroup() {
        String groupName = "3. 설정관리 시스템 - 00. 전체";
        String packageList[] = {
                "com.custom.v1.controllers.setup"
            };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi setupCommon() {
        String groupName = "3. 설정관리 시스템 - 01. 공통기능";
        String packageList[] = {
            "com.custom.v1.controllers.setup.cmmn"
          , "com.custom.v1.controllers.setup.main"
        };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi setupPrduct() {
        String groupName = "3. 설정관리 시스템 - 02. 서비스 계약 설정";
        String packageList[] = {
            "com.custom.v1.controllers.setup.svc"
        };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

    @Bean
    public GroupedOpenApi setupSystem() {
        String groupName = "3. 설정관리 시스템 - 03. 시스템 관리";
        String packageList[] = {
            "com.custom.v1.controllers.setup.sys"
        };

        return GroupedOpenApi.builder()
                .group(groupName)
                .packagesToScan(packageList)
                .build();
    }

/**
    @Bean
    public SpringDocConfiguration springDocConfiguration(){
        // spring-doc.api-doc.enabled=false 설정으로 인해 자동생성되지 않음
        return new SpringDocConfiguration();
    }

    @Bean
    public SpringDocConfigProperties springDocConfigProperties() {
        // spring-doc.api-doc.enabled=false 설정으로 인해 자동생성되지 않음
        return new SpringDocConfigProperties();
    }

    @Bean
    public ObjectMapperProvider objectMapperProvider(SpringDocConfigProperties springDocConfigProperties){
        return new ObjectMapperProvider(springDocConfigProperties);
    }
*/
}
