package com.custom.v1.controllers.fmcs.lctr;

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
 * @ClassName : LectureRegistcontrollers.java
 * @Description : 강좌등록현황에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-11
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-11    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "강좌등록현황 - 강좌 등록(신청)",
     description = "회원관리 - 회원정보관리 - 강좌등록현황 - 강좌 등록(신청)"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureRegistController {

    @Operation(summary="회원별 강좌 신청현황 조회", description="회원들의 강좌 신청 현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/regist")
    public String selectLectureRegistList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureRegistList";
    }

    @Operation(summary="강좌 신청 정보 조회", description="특정 회원이 신청한 강좌 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/regist/{id}")
    public String selectLectureRegist(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureRegist";
    }

    @Operation(summary="강좌 신청 정보 등록", description="강좌 신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/regist")
    public String insertLectureRegist(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureRegist";
    }

    @Operation(summary="강좌 재신청 정보 등록", description="강좌 재신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/re-regist")
    public String insertLectureReRegist(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureReRegist";
    }

    @Operation(summary="강좌 신청 취소 정보 등록", description="강좌 신청 취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/regist-cancel")
    public String insertLectureRegistCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureRegist";
    }

    @Operation(summary="강좌 수강 기간 연기 신청", description="강좌 수강 기간 연기 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rgst/pstpone/{id}")
    public String updateLectureRegistPstpone(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegistPstpone";
    }

    @Operation(summary="강좌 변경 신청", description="신청 강좌 정보 변경을 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rgst/change/{id}")
    public String updateLectureRegistChange(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegistChange";
    }

    @Operation(summary="강좌 변경 신청 취소", description="신청 강좌 정보 변경 신청을 취소 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rgst/change-cancel/{id}")
    public String updateLectureRegistChangeCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegistChangeCancel";
    }

    @Operation(summary="강좌 기간 변경 신청", description="신청 강좌의 기간을 변경 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rgst/change-period/{id}")
    public String updateLectureRegistChangePeriod(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegistChangePeriod";
    }

    @Operation(summary="이용상품 타회원 변경 신청", description="이용상품을 타회원 이용으로 변경 신청 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rgst/change-member/{id}")
    public String updateLectureRegistChangeMember(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegistChangeMember";
    }

    @Operation(summary="강좌 온라인 신청 정보 조회", description="특정 회원이 온라인 신청한 강좌 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rgst/online/{id}")
    public String selectLectureRegistOnline(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureRegistOnline";
    }

    @Operation(summary="강좌 연기 내역 조회", description="강좌 연기 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rgst/pstpone/{id}")
    public String selectLectureRegistPstpone(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureRegistPstpone";
    }

    @Operation(summary="강좌 연기 내역 조회", description="강좌 연기 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rgst/pstpone-excel/{id}")
    public String selectLectureRegistPstponeExcel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureRegistPstponeExcel";
    }
}
