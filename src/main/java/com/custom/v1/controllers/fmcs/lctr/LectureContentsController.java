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
 * @ClassName : LectureContentscontrollers.java
 * @Description : 강좌컨텐츠정보에 관한 controller 클래스를 정의한다.
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
     name = "강좌컨텐츠정보",
     description = "강좌관리 - 강좌관리 - 강좌컨텐츠정보"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class LectureContentsController {

    @Operation(summary="강좌컨텐츠정보 정보 조회", description="강좌컨텐츠정보 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/contents/{id}")
    public String selecLectureContents(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selecLectureContents";
    }

    @Operation(summary="강좌컨텐츠정보 정보 등록", description="강좌컨텐츠정보 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/contents")
    public String insertLectureContents(
            @PathVariable("instt") final String instt
            ) {
        return "insertLectureContents";
    }

    @Operation(summary="강좌컨텐츠정보 정보 수정", description="강좌컨텐츠정보 정보를 수정 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/contents/{id}")
    public String updateLectureContents(
            @PathVariable("instt") final String instt
            ) {
        return "updateLectureContents";
    }
}
