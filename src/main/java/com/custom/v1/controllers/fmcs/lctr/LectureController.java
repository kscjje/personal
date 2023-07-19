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
 * @ClassName : Lecturecontrollers.java
 * @Description : 강좌관리에 관한 controller 클래스를 정의한다.
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
     name = "강좌관리",
     description = "강좌관리 - 강좌관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}")
public class LectureController {

    @Operation(summary="강좌 정보 목록 조회", description="강좌 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lecture")
    public String selectLectureList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureList";
    }

    @Operation(summary="강좌 정보 조회", description="강좌 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lecture/{id}")
    public String selectLecture(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLecture";
    }

    @Operation(summary="강좌 정보 등록", description="강좌 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/lecture")
    public String insertLecture(
            @PathVariable("instt") final String instt
            ) {
        return "insertLecture";
    }

    @Operation(summary="강좌 정보 수정", description="강좌 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/lecture/{id}")
    public String updateLecture(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLecture";
    }

    @Operation(summary="강좌 정보 부분 수정", description="강좌 정보 일부 내용을 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/lecture-modify/{modify}")
    public String modifyLecture(
            @PathVariable("instt") final String instt,
            @PathVariable("modify") final String mod
            ) {
        return "modifyLecture";
    }

    @Operation(summary="강좌 정보 삭제", description="강좌 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/lecture/{id}")
    public String deleteLecture(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLecture";
    }

    @Operation(summary="강좌 정보 복사", description="강좌 정보를 복사하여 등록한다. ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/lecture-copy")
    public String copyLecture(
            @PathVariable("instt") final String instt
            ) {
        return "copyLecture";
    }

    @Operation(summary="강좌별 요금 정보 조회", description="강좌별 요금 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lecture-fee")
    public String selectLectureFeeList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLectureFeeList";
    }
}
