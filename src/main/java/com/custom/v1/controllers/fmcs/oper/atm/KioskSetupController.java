package com.custom.v1.controllers.fmcs.oper.atm;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : KioskSetupcontrollers.java
 * @Description : 무인키오스 운영환경설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-31
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-31    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "무인키오스크운영설정관리 - 무인키오스 운영환경설정",
     description = "운영 설정관리 - 자동화시스템 운영 설정 - 무인키오스 운영환경설정 - 무인키오스 운영환경설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper/kiosk")
public class KioskSetupController {

    @Operation(summary="무인키오스 운영환경설정 목록 조회", description="무인키오스 운영환경설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/operation-setup")
    public String selectKioskSetupList(
            @PathVariable("instt") final String instt
            ) {
        return "selectKioskSetupList";
    }

    @Operation(summary="무인키오스 운영환경설정 정보 조회", description="무인키오스 운영환경설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/operation-setup/{id}")
    public String selectKioskSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectKioskSetup";
    }

    @Operation(summary="무인키오스 운영환경설정 정보 등록", description="무인키오스 운영환경설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/operation-setup")
    public String insertKioskSetup(
            @PathVariable("instt") final String instt
            ) {
        return "insertKioskSetup";
    }

    @Operation(summary="무인키오스 운영환경설정 정보 수정", description="무인키오스 운영환경설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/operation-setup/{id}")
    public String updateKioskSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateKioskSetup";
    }

    @Operation(summary="무인키오스 운영환경설정 정보 삭제", description="무인키오스 운영환경설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/operation-setup/{id}")
    public String deleteKioskSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteKioskSetup";
    }
}
