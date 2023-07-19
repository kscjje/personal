package com.custom.v1.controllers.frnt.rsv;

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
 * @ClassName : FrontLectureRegistcontrollers.java
 * @Description : 수강신청에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-15
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-15    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 02.통합예약 - 01) 수강신청",
     description = """
             시설별 수강신청 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/lctr")
public class FrontLectureRegistController {

    @Operation(summary="수강신청 목록 조회", description="수강신청 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/regist-list/{id}")
    public String selectLectureRegistList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureRegistList";
    }

    @Operation(summary="수강신청 정보 조회", description="수강신청 정보 한건을 조회한다.")
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

    @Operation(summary="수강신청 정보 등록", description="수강신청 정보를 등록한다.")
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

    @Operation(summary="수강신청 정보 수정", description="수강신청 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/regist/{id}")
    public String updateLectureRegist(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLectureRegist";
    }

    @Operation(summary="수강신청 정보 삭제", description="수강신청 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/regist/{id}")
    public String deleteLectureRegist(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLectureRegist";
    }
}
