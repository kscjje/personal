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
 * @ClassName : TimetableGroupcontrollers.java
 * @Description : 이용회차그룹관리에 관한 controller 클래스를 정의한다.
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
     name = "이용회차그룹관리",
     description = "매표관리 - 일일입장 프로그램관리 - 이용회차그룹관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/tckt")
public class TicketTimetableGroupController {

    @Operation(summary="이용회차그룹관리 목록 조회", description="이용회차그룹관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/time-group")
    public String selectTimetableGrouptList(
            @PathVariable("instt") final String instt
            ) {
        return "selectTimetableGrouptList";
    }

    @Operation(summary="이용회차그룹관리 정보 조회", description="이용회차그룹관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/time-group/{id}")
    public String selectTimetableGroupt(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectTimetableGroupt";
    }

    @Operation(summary="이용회차그룹관리 정보 등록", description="이용회차그룹관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/time-group")
    public String insertTimetableGroupt(
            @PathVariable("instt") final String instt
            ) {
        return "insertTimetableGroupt";
    }

    @Operation(summary="이용회차그룹관리 정보 수정", description="이용회차그룹관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/time-group/{id}")
    public String updateTimetableGroupt(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateTimetableGroupt";
    }

    @Operation(summary="이용회차그룹관리 정보 삭제", description="이용회차그룹관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/time-group/{id}")
    public String deleteTimetableGroupt(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteTimetableGroupt";
    }
}
