package com.custom.v1.controllers.fmcs.tckt;

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
 * @ClassName : OperationSetupcontrollers.java
 * @Description : 매표운영설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-04
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-04    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "매표운영설정",
     description = "매표관리 - 입장권매표관리 - 매표운영설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/tckt")
public class OperationSetupController {

    @Operation(summary="매표운영설정 정보 목록 조회", description="매표운영설정 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/operation")
    public String selectOperationSetupList(
            @PathVariable("instt") final String instt
            ) {
        return "selectOperationSetupList";
    }

    @Operation(summary="매표운영설정 정보 조회", description="매표운영설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/operation/{id}")
    public String selectOperationSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectOperationSetup";
    }

    @Operation(summary="매표운영설정 정보 등록", description="매표운영설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/operation")
    public String insertOperationSetup(
            @PathVariable("instt") final String instt
            ) {
        return "insertOperationSetup";
    }

    @Operation(summary="매표운영설정 정보 수정", description="매표운영설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/operation/{id}")
    public String updateOperationSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateOperationSetup";
    }

    @Operation(summary="매표운영설정 정보 삭제", description="매표운영설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/operation/{id}")
    public String deleteOperationSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteOperationSetup";
    }
}