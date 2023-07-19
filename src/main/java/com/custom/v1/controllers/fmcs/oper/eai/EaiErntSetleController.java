package com.custom.v1.controllers.fmcs.oper.eai;

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
 * @ClassName : EaiErntSetlecontrollers.java
 * @Description : 대관서비스 결제설정에 관한 controller 클래스를 정의한다.
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

@Tag(name = "대관서비스 결제설정", description = "운영설정관리 - 연계시스템설정 - 대관서비스 결제설정")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class EaiErntSetleController {

    @Operation(summary="대관서비스 결제설정 목록 조회", description="대관서비스 결제설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/erntstls")
    public String selectEaiErntSetleList(
            @PathVariable("instt") final String instt
            ) {
        return "selectEaiErntSetleList";
    }

    @Operation(summary="대관서비스 결제설정 정보 조회", description="대관서비스 결제설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/erntstl/{id}")
    public String selectEaiErntSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectEaiErntSetle";
    }

    @Operation(summary="대관서비스 결제설정 정보 등록", description="대관서비스 결제설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/erntstl")
    public String insertEaiErntSetle(
            @PathVariable("instt") final String instt
            ) {
        return "insertEaiErntSetle";
    }

    @Operation(summary="대관서비스 결제설정 정보 수정", description="대관서비스 결제설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/erntstl/{id}")
    public String updateEaiErntSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateEaiErntSetle";
    }

    @Operation(summary="대관서비스 결제설정 정보 삭제", description="대관서비스 결제설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/erntstl/{id}")
    public String deleteEaiErntSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteEaiErntSetle";
    }
}
