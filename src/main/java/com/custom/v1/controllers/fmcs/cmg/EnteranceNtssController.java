package com.custom.v1.controllers.fmcs.cmg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : EnteranceNtsscontrollers.java
 * @Description : 입장관리에 관한 controller 클래스를 정의한다.
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
     name = "입장관리",
     description = "입장관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/cmg")
public class EnteranceNtssController {

    @Operation(summary="입장객현황 목록 조회", description="입장객현황 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/enterance")
    public String selectOperationSetupList(
            @PathVariable("instt") final String instt
            ) {
        return "selectOperationSetupList";
    }

    @Operation(summary="입장발권 정보 등록", description="입장발권 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ntss")
    public String insertEnteranceNtss(
            @PathVariable("instt") final String instt
            ) {
        return "insertEnteranceNtss";
    }

    @Operation(summary="입장취소 정보 등록", description="입장취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ntss/cancel")
    public String insertEnteranceNtssCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertEnteranceNtssCancel";
    }
}
