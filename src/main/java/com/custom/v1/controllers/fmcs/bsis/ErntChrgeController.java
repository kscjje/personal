package com.custom.v1.controllers.fmcs.bsis;

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
 * @ClassName : ErntChrgecontrollers.java
 * @Description : 대관료관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-28
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-28    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "대관료관리", description = "기초관리 - 이용상품요금관리 - 대관료")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/bsis")
public class ErntChrgeController {

    @Operation(summary="대관료 목록 조회", description="대관료 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ernts")
    public String selectErntChrgeList() {
        return "selectErntChrgeList";
    }

    @Operation(summary="대관료 정보 조회", description="대관료 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ernt/{id}")
    public String selectErntChrge(
            @PathVariable("id") final String id
            ) {
        return "selectErntChrge";
    }

    @Operation(summary="대관료 정보 등록", description="대관료 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ernt")
    public String insertErntChrge() {
        return "insertErntChrge";
    }

    @Operation(summary="대관료 정보 수정", description="대관료 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ernt/{id}")
    public String updateErntChrge(
            @PathVariable("id") final String id
            ) {
        return "updateErntChrge";
    }

    @Operation(summary="대관료 정보 삭제", description="대관료 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/ernt/{id}")
    public String deleteErntChrge(
            @PathVariable("id") final String id
            ) {
        return "deleteErntChrge";
    }

    @Operation(summary="대관료 정렬 순서 수정", description="대관료 정렬 순서 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ernt/{id}/odrd")
    public String updateErntChrgeOrder(
            @PathVariable("id") final String id
            ) {
        return "updateErntChrgeOrder";
    }

    @Operation(summary="대관료 엑셀 다운로드", description="대관료를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ernts/excel")
    public String selectErntChrgeExcel() {
        return "selectErntChrgeExcel";
    }
}
