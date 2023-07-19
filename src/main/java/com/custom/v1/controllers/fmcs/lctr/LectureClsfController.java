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
 * @ClassName : LectureClsfcontrollers.java
 * @Description : 강좌검색분류설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-08
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-08    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "강좌검색분류설정",
     description = "강좌관리 - 강좌검색분류설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureClsfController {

    @Operation(summary="강좌검색분류 정보 목록 조회", description="강좌검색분류 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/clsf")
    public String selectInstructorList(
            @PathVariable("instt") final String instt
            ) {
        return "selectInstructorList";
    }

    @Operation(summary="강좌검색분류 정보 조회", description="강좌검색분류 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/clsf/{id}")
    public String selectInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectInstructor";
    }

    @Operation(summary="강좌검색분류 정보 등록", description="강좌검색분류 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/clsf")
    public String insertInstructor(
            @PathVariable("instt") final String instt
            ) {
        return "insertInstructor";
    }

    @Operation(summary="강좌검색분류 정보 수정", description="강좌검색분류 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/clsf/{id}")
    public String updateInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateInstructor";
    }

    @Operation(summary="강좌검색분류 정보 삭제", description="강좌검색분류 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/clsf/{id}")
    public String deleteInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteInstructor";
    }

    @Operation(summary="검색분류 강좌 정보 등록", description="검색분류 강좌 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/cl-lecture")
    public String insertInstructorLecture(
            @PathVariable("instt") final String instt
            ) {
        return "insertInstructor";
    }

    @Operation(summary="검색분류 강좌 정보 삭제", description="검색분류 강좌 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/cl-lecture/{id}")
    public String deleteInstructorLecture(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteInstructor";
    }
}
