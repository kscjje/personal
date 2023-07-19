package com.custom.v1.controllers.frnt.mypg;

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
 * @ClassName : MypageInterestcontrollers.java
 * @Description : 나의관심정보에 관한 controller 클래스를 정의한다.
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

@Tag(name = "2. 05. 마이페이지 - 01) 나의관심정보",
     description = """
             나의관심 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/mypg")
public class MypageInterestController {

    @Operation(summary="관심정보 목록 조회", description="관심정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/interest-list/{id}")
    public String selectMypageInterestList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageInterestList";
    }

    @Operation(summary="관심정보 정보 조회", description="관심정보 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/interest/{id}")
    public String selectMypageInterest(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageInterest";
    }

    @Operation(summary="관심정보 정보 등록", description="관심정보 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/interest")
    public String insertMypageInterest(
            @PathVariable("instt") final String instt
            ) {
        return "insertMypageInterest";
    }

    @Operation(summary="관심정보 정보 수정", description="관심정보 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/interest/{id}")
    public String updateMypageInterest(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageInterest";
    }

    @Operation(summary="관심정보 정보 삭제", description="관심정보 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/interest/{id}")
    public String deleteMypageInterest(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMypageInterest";
    }
}
