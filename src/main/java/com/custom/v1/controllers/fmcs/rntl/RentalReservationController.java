package com.custom.v1.controllers.fmcs.rntl;

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
 * @ClassName : Reservationcontrollers.java
 * @Description : 대관예약관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-07
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-07    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "대관예약관리",
     description = "대관관리 - 대관예약관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/rntl")
public class RentalReservationController {

    @Operation(summary="대관예약관리 목록 조회", description="대관예약관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/reserve")
    public String selectRentalReservationList(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationList";
    }

    @Operation(summary="대관예약관리 정보 조회", description="대관예약관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/reserve/{id}")
    public String selectRentalReservation(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectRentalReservation";
    }

    @Operation(summary="대관예약관리 정보 등록", description="대관예약관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve")
    public String insertRentalReservation(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservation";
    }

    @Operation(summary="장기예약신청 정보 등록", description="장기예약신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/long-reserve")
    public String insertLongRentalReservation(
            @PathVariable("instt") final String instt
            ) {
        return "insertLongRentalReservation";
    }

    @Operation(summary="대관예약관리 정보 수정", description="대관예약관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/reserve/{id}")
    public String updateRentalReservation(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateRentalReservation";
    }

    @Operation(summary="예약승인 정보 등록", description="예약승인 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve-consent")
    public String insertRentalReservationConsent(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservationConsent";
    }

    @Operation(summary="예약취소 정보 등록", description="예약취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve-cancel")
    public String insertRentalReservationCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservationCancel";
    }

    @Operation(summary="허가서출력 이력 등록", description="허가서출력 이력을 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/resve/rpmsn-printing")
    public String insertRentalReservationRpmsnPrinting(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservationRpmsnPrinting";
    }

    @Operation(summary="부속시설이용내역 정보 등록", description="부속시설이용내역 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/resve/subsidiary")
    public String insertRentalReservationSubsidiary(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservationSubsidiary";
    }

    @Operation(summary="부속시설이용취소 정보 등록", description="부속시설이용취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/resve/sbrs-cancel")
    public String insertRentalReservationSubsidiaryCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservationSubsidiaryCancel";
    }

    @Operation(summary="대관예약현황 목록 조회", description="대관예약현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/status")
    public String selectRentalReservationStatsList(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationStatsList";
    }

    @Operation(summary="대관예약현황 엑셀 다운로드", description="대관예약현황 목록을 엑셀로 다운로드받는다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/status-excel")
    public String selectRentalReservationStatsExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationStatsExcel";
    }

    @Operation(summary="대관수입통계 목록 조회", description="대관수입통계 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/income-stats")
    public String selectRentalReservationIncomeStatsList(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationIncomeStatsList";
    }

    @Operation(summary="대관수입통계 엑셀 다운로드", description="대관수입통계 목록을 엑셀로 다운로드받는다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/income-stats-excel")
    public String selectRentalReservationIncomeStatsExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationIncomeStatsExcel";
    }

    @Operation(summary="예약환불요청 목록 조회", description="예약환불요청 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/refnd")
    public String selectRentalReservationRefundmentList(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationRefundmentList";
    }

    @Operation(summary="예약환불요청 엑셀 다운로드", description="예약환불요청 목록을 엑셀로 다운로드받는다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve/refnd-excel")
    public String selectRentalReservationRefundmentExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectRentalReservationRefundmentExcel";
    }
}
