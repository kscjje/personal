package com.custom.v1.controllers.frnt.mypg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : MypageRefundmentcontrollers.java
 * @Description : 환불현황에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-15
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-15    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 05. 마이페이지 - 06) 환불현황",
     description = """
             환불 요청현황 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/mypg")
public class MypageRefundmentController {

    @Operation(summary="환불신청 목록 조회", description="환불신청 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/refundment-list/{id}")
    public String selectMypageRefundmentList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageRefundmentList";
    }

    @Operation(summary="환불신청 정보 조회", description="환불신청 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/refundment/{id}")
    public String selectMypageRefundment(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageRefundment";
    }

    @Operation(summary="환불신청 정보 수정", description="환불신청 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/refundment/{id}")
    public String updateMypageRefundment(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageRefundment";
    }

    @Operation(summary="환불신청 취소", description="환불신청을 취소 요청 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/refnd-cancel/{id}")
    public String updateMypageRefundmentCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageRefundmentCancel";
    }
}
