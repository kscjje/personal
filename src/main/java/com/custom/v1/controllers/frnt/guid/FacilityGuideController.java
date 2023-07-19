package com.custom.v1.controllers.frnt.guid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : FacilityGuidecontrollers.java
 * @Description : 시설안내에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-14
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-14    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 03. 시설 안내",
     description = """
             통합예약시스템 시설별 안내 컨텐츠를 출력 한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/guid")
public class FacilityGuideController {

    @Operation(summary="시설 소개 정보 조회", description="시설 소개 정보 컨텐츠를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/facility/{id}")
    public String selectFacilityGuide(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectFacilityGuide";
    }

    @Operation(summary="강사 소개 정보 조회", description="강사 소개 정보 컨텐츠를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/instructor/{id}")
    public String selectInstructorGuide(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectInstructorGuide";
    }

    @Operation(summary="위치 및 교통 정보 조회", description="위치 및 교통 정보 컨텐츠를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/location/{id}")
    public String selectLocationGuide(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLocationGuide";
    }
}
