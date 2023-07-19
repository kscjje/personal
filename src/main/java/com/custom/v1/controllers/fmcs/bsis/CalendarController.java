package com.custom.v1.controllers.fmcs.bsis;

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
 * @ClassName : Calendarcontrollers.java
 * @Description : 월력관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-28
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-28    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "월력관리", description = "기초관리 - 월력관리")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/bsis")
public class CalendarController {

    @Operation(summary="월력 목록 조회", description="월력 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar")
    public String selectCalendarList() {
        return "selectCalendarList";
    }

    @Operation(summary="월력 정보 조회", description="월력 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/cldr/{id}")
    public String selectCalendar(
            @PathVariable("id") final String id
            ) {
        return "selectCalendar";
    }

    @Operation(summary="월력 정보 등록", description="월력 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/cldr")
    public String insertCalendar() {
        return "insertCalendar";
    }

    @Operation(summary="월력 정보 수정", description="월력 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/cldr/{id}")
    public String updateCalendar(
            @PathVariable("id") final String id
            ) {
        return "updateCalendar";
    }

    @Operation(summary="월력 정보 삭제", description="월력 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/cldr/{id}")
    public String deleteCalendar(
            @PathVariable("id") final String id
            ) {
        return "deleteCalendar";
    }

    @Operation(summary="월력 엑셀 다운로드", description="월력을(를) 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar-excel")
    public String selectCalendarExcel() {
        return "selectCalendarExcel";
    }

    @Operation(summary="월력 정보 일괄 등록", description="월간, 년간 일정을 요일별 선택하여 일괄등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar-btch")
    public String insertCalendarBatch() {
        return "insertCalendar";
    }
}
