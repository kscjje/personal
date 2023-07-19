package com.custom.v1.controllers.fmcs.lctr;

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
 * @ClassName : LectureStatisticscontrollers.java
 * @Description : 강좌휴관일 관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-09
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-09    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "강좌휴관일 관리",
     description = "강좌관리 - 강좌휴관일 관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureCalendarController {

    @Operation(summary="강좌휴관일 정보 조회", description="강좌휴관일 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar")
    public String selectLectureCalendarList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureCalendarList";
    }

    @Operation(summary="강좌휴관일 정보 조회", description="강좌휴관일 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/calendar/{id}")
    public String selectLectureCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureCalendar";
    }

    @Operation(summary="강좌휴관일 정보 등록", description="강좌휴관일 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar")
    public String insertLectureCalendar(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureCalendar";
    }

    @Operation(summary="강좌휴관일 정보 수정", description="강좌휴관일 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/calendar/{id}")
    public String updateLectureCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureCalendar";
    }

    @Operation(summary="강좌휴관일 정보 삭제", description="강좌휴관일 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/calendar/{id}")
    public String deleteLectureCalendar(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLectureCalendar";
    }

    @Operation(summary="강좌휴관일 정보 일괄 등록", description="강좌휴관일 정보를 일괄 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar-btch")
    public String insertLectureCalendarBatch() {
        return "insertLectureCalendarBatch";
    }

    @Operation(summary="강좌휴관일 정보 복사", description="강좌휴관일 정보를 복사하여 등록한다. ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/calendar-copy")
    public String copyLectureCalendar(
            @PathVariable("instt") final String instt
            ) {
        return "copyLectureCalendar";
    }
}
