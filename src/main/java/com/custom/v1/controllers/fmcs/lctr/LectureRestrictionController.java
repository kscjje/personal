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
 * @ClassName : LectureRestrictioncontrollers.java
 * @Description : 신청제한정보관리에 관한 controller 클래스를 정의한다.
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
     name = "신청제한정보관리",
     description = "강좌관리 - 강좌관리 - 신청제한정보관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureRestrictionController {

    @Operation(summary="신청제한 정보 조회", description="신청제한 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/restrict/{id}")
    public String selecLectureRestriction(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selecLectureRestriction";
    }

    @Operation(summary="신청제한 정보 등록", description="신청제한 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/restrict")
    public String insertLectureRestriction(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureRestriction";
    }

    @Operation(summary="신청제한 정보 수정", description="신청제한 정보를 수정 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/restrict/{id}")
    public String updateLectureRestriction(
            @PathVariable("instt") final String instt
            ) {
        return "updateLectureRestriction";
    }
}
