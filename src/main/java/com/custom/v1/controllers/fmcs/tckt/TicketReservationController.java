package com.custom.v1.controllers.fmcs.tckt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : TicketReservationcontrollers.java
 * @Description : 입장권매표예약정보관리에 관한 controller 클래스를 정의한다.
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
     name = "입장권매표예약정보관리",
     description = "매표관리 - 입장권매표예약정보관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/tckt")
public class TicketReservationController {

    @Operation(summary="입장권티켓예약신청 정보 등록", description="입장권티켓예약신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve")
    public String insertTicketReservationn(
            @PathVariable("instt") final String instt
            ) {
        return "insertTicketReservationn";
    }

    @Operation(summary="예약취소/환불 정보 등록", description="예약취소/환불 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve/cancel")
    public String insertTicketReservationnCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertTicketReservationnCancel";
    }

    @Operation(summary="예약티켓발권 출력 이력 등록", description="예약티켓발권처리 출력 이력을 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve/printing")
    public String insertTicketReservationnPrinting(
            @PathVariable("instt") final String instt
            ) {
        return "insertTicketReservationnPrinting";
    }
}
