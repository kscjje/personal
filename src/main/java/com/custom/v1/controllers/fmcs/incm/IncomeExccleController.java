package com.custom.v1.controllers.fmcs.incm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : IncomeExcclecontrollers.java
 * @Description : 수입정산현황에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-03
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-03    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "수입정산현황",
     description = "수입정산관리 - 수입정산현황"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/incm")
public class IncomeExccleController {

    @Operation(summary="신용거래현황", description="PG거래내역현황 - 신용거래현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/credt")
    public String selectIncomeCreditList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeCreditList";
    }

    @Operation(summary="현금승인현황", description="PG거래내역현황 - 현금승인현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/cash")
    public String selectIncomeCashList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeCashList";
    }

    @Operation(summary="환불수입현황", description="환불수입현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/refundment")
    public String selectIncomeRefundmentList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeRefundmentList";
    }

    @Operation(summary="수납자별입금현황", description="수납자별입금현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/receiver")
    public String selectIncomeReceiverList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeReceiverList";
    }

    @Operation(summary="수입금전표현황", description="수입금전표현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/chit")
    public String selectIncomeChittList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeChittList";
    }

    @Operation(summary="수입금정산일지(1)", description="수입금정산일지(1) 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/earnings1")
    public String selectIncomeEarnings1List(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeEarnings1List";
    }

    @Operation(summary="수입금정산일지(2)", description="수입금정산일지(2) 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/earnings2")
    public String selectIncomeEarnings2List(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeEarnings2List";
    }

    @Operation(summary="수입금정산세부현황", description="수입금정산세부현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/earnings-detail")
    public String selectIncomeEarningsDetailList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeEarningsDetailList";
    }

    @Operation(summary="할인사유별수입금현황", description="할인사유별수입금현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount")
    public String selectIncomeDiscountList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIncomeDiscountList";
    }
}
