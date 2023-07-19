package com.custom.v1.controllers.fmcs.lctr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : LectureStatisticscontrollers.java
 * @Description : 강좌현황 및 통계에 관한 controller 클래스를 정의한다.
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
     name = "강좌현황 및 통계",
     description = "강좌관리 - 강좌현황 및 통계"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr/stts")
public class LectureStatisticsController {

    @Operation(summary="강좌접수대기자현황 조회", description="강좌접수대기자현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/waiting")
    public String selectWaitingStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectWaitingStatus";
    }

    @Operation(summary="강좌접수대기자현황 엑셀 다운로드", description="강좌접수대기자현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/waiting-excel")
    public String selectWaitingStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectWaitingStatusExcel";
    }

    @Operation(summary="강좌접수인원현황 조회", description="강좌접수인원현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rcepter")
    public String selectReceptionistStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectReceptionistStatus";
    }

    @Operation(summary="강좌접수인원현황 엑셀 다운로드", description="강좌접수인원현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rcepter-excel")
    public String selectReceptionistStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectReceptionistStatusExcel";
    }

    @Operation(summary="수강회원현황 조회", description="수강회원현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-stus")
    public String selectMemberStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberStatus";
    }

    @Operation(summary="수강회원현황 엑셀 다운로드", description="수강회원현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-stus-excel")
    public String selectMemberStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberStatusExcel";
    }

    @Operation(summary="강좌출석현황 조회", description="강좌출석현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/attendance")
    public String selectAttendanceStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectAttendanceStatus";
    }

    @Operation(summary="강좌출석현황 엑셀 다운로드", description="강좌출석현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/attendance-excel")
    public String selectAttendanceStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectAttendanceStatusExcel";
    }

    @Operation(summary="수강회원통계현황 조회", description="수강회원통계현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-stts")
    public String selectMemberStatistics(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberStatistics";
    }

    @Operation(summary="수강회원통계현황 엑셀 다운로드", description="수강회원통계현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-stts-excel")
    public String selectMemberStatisticsExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberStatisticsExcel";
    }

    @Operation(summary="회원별 강좌변경현황 조회", description="회원별 강좌변경현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lctr-change")
    public String selectLectureChangeStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureChangeStatus";
    }

    @Operation(summary="회원별 강좌변경현황 엑셀 다운로드", description="회원별 강좌변경현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lctr-change-excel")
    public String selectLectureChangeStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureChangeStatusExcel";
    }

    @Operation(summary="회원별 강좌연기현황 조회", description="회원별 강좌연기현황 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lctr-pstpone")
    public String selectLecturePstponeStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectLecturePstponeStatus";
    }

    @Operation(summary="회원별 강좌연기현황 엑셀 다운로드", description="회원별 강좌연기현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lctr-pstpone-excel")
    public String selectLecturePstponeStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLecturePstponeStatusExcel";
    }
}