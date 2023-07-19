package com.custom.v1.controllers.fmcs.lctr;

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
 * @ClassName : LectureDrawingLotscontrollers.java
 * @Description : 강좌추첨관리에 관한 controller 클래스를 정의한다.
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
     name = "강좌추첨관리",
     description = "강좌관리 - 강좌추첨관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureDrawingLotsController {

    @Operation(summary="추첨강좌 목록 조회", description="추첨설정 강좌 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/drawing")
    public String selectLectureDrawingLotsList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureDrawingLotsList";
    }

    @Operation(summary="추첨강좌 접수 회원 조회", description="추첨 강좌 접수 회원 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/drawing-member")
    public String selectLectureDrawingLotsMemberList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureDrawingLotsMemberList";
    }

    @Operation(summary="추첨강좌 목록 조회", description="추첨설정 강좌 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/drawing-excel")
    public String selectLectureDrawingLotsExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureDrawingLotsExcel";
    }

    @Operation(summary="추첨강좌 접수 회원 조회", description="추첨 강좌 접수 회원 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/drawing-member-excel")
    public String selectLectureDrawingLotsMemberExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureDrawingLotsMemberExcel";
    }

    @Operation(summary="강좌별 추첨 등록", description="강좌별 추첨을 진행한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/drawing")
    public String insertLectureDrawingLots(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureDrawingLots";
    }

    @Operation(summary="강좌 일괄 추첨 등록", description="강좌 일괄 추첨을 진행한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/drawing-all")
    public String insertLectureDrawingLotsALl(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureDrawingLotsALl";
    }
}
