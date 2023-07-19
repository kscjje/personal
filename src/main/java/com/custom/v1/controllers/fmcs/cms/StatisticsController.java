package com.custom.v1.controllers.fmcs.cms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : Statisticscontrollers.java
 * @Description : 접속통계에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-02
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-02    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "접속통계",
     description = "컨텐츠관리 - 접속통계"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/cms/stts")
public class StatisticsController {

    @Operation(summary="메뉴별접속통계 목록 조회", description="메뉴별접속통계 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/menu")
    public String selectStatsMenuList(
            @PathVariable("instt") final String instt
            ) {
        return "selectStatsMenuList";
    }

    @Operation(summary="웹서비스PAGE접속현황 목록 조회", description="웹서비스PAGE접속현황 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/page")
    public String selectStatsPageList(
            @PathVariable("instt") final String instt
            ) {
        return "selectStatsPageList";
    }
}
