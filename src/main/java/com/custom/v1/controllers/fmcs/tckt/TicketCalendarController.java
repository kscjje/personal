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
 * @ClassName : TicketCalendarcontrollers.java
 * @Description : 일일입장권 월력 관리에 관한 controller 클래스를 정의한다.
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
     name = "일일입장권 월력 관리",
     description = "매표관리 - 일일입장 프로그램관리 - 일일입장권 월력 관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/tckt")
public class TicketCalendarController {

    @Operation(summary="일일입장권 월력 정보 목록 조회", description="일일입장권 월력 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar")
    public String selectTicketCalendarList(
            @PathVariable("instt") final String instt
            ) {
        return "selectTicketCalendarList";
    }

    @Operation(summary="일일입장권 월력 정보 조회", description="일일입장권 월력 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar/{id}")
    public String selectTicketCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectTicketCalendar";
    }

    @Operation(summary="일일입장권 월력 정보 등록", description="일일입장권 월력 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar")
    public String insertTicketCalendar(
            @PathVariable("instt") final String instt
            ) {
        return "insertTicketCalendar";
    }

    @Operation(summary="일일입장권 월력 정보 수정", description="일일입장권 월력 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/calendar/{id}")
    public String updateTicketCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateTicketCalendar";
    }

    @Operation(summary="일일입장권 월력 정보 삭제", description="일일입장권 월력 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/calendar/{id}")
    public String deleteTicketCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteTicketCalendar";
    }

    @Operation(summary="일일입장권 월력 정보 일괄 등록", description="일일입장권 월력 정보를 일괄 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar-btch")
    public String insertTicketCalendarBatch() {
        return "insertCalendar";
    }

    @Operation(summary="일일입장권 월력 정보 복사", description="일일입장권 월력 정보를 복사하여 등록한다. ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar-copy")
    public String copyTicketCalendar(
            @PathVariable("instt") final String instt
            ) {
        return "copyTicketCalendar";
    }
}
