package com.custom.v1.controllers.fmcs.oper.plcy;

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
 * @ClassName : ErntSetupcontrollers.java
 * @Description : 대관운영설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-01
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-01    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "대관운영설정",
     description = "운영 설정관리 - 업무운영정책기준설정 - 대관운영설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class ErntSetupController {

    @Operation(summary="대관운영설정 목록 조회", description="대관운영설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ernt-setup")
    public String selectErntSetupList(
            @PathVariable("instt") final String instt
            ) {
        return "selectErntSetupList";
    }

    @Operation(summary="대관운영설정 정보 조회", description="대관운영설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ernt-setup/{id}")
    public String selectErntSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectErntSetup";
    }

    @Operation(summary="대관운영설정 정보 등록", description="대관운영설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ernt-setup")
    public String insertErntSetup(
            @PathVariable("instt") final String instt
            ) {
        return "insertErntSetup";
    }

    @Operation(summary="대관운영설정 정보 수정", description="대관운영설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ernt-setup/{id}")
    public String updateErntSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateErntSetup";
    }

    @Operation(summary="대관운영설정 정보 삭제", description="대관운영설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/ernt-setup/{id}")
    public String deleteErntSetup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteErntSetup";
    }
}
