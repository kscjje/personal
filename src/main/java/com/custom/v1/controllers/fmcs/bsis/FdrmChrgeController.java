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
 * @ClassName : FdrmChrgecontrollers.java
 * @Description : 정기상품 요금관리에 관한 controller 클래스를 정의한다.
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

@Tag(name = "정기상품 요금관리", description = "기초관리 - 이용상품요금관리 - 정기상품")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/bsis")
public class FdrmChrgeController {

    @Operation(summary="정기상품 요금 목록 조회", description="정기상품 요금 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/fdrms")
    public String selectFdrmChrgeList() {
        return "selectFdrmChrgeList";
    }

    @Operation(summary="정기상품 요금 정보 조회", description="정기상품 요금 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/fdrm/{id}")
    public String selectFdrmChrge(
            @PathVariable("id") final String id
            ) {
        return "selectFdrmChrge";
    }

    @Operation(summary="정기상품 요금 정보 등록", description="정기상품 요금 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/fdrm")
    public String insertFdrmChrge() {
        return "insertFdrmChrge";
    }

    @Operation(summary="정기상품 요금 정보 수정", description="정기상품 요금 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/fdrm/{id}")
    public String updateFdrmChrge(
            @PathVariable("id") final String id
            ) {
        return "updateFdrmChrge";
    }

    @Operation(summary="정기상품 요금 정보 삭제", description="정기상품 요금 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/fdrm/{id}")
    public String deleteFdrmChrge(
            @PathVariable("id") final String id
            ) {
        return "deleteFdrmChrge";
    }

    @Operation(summary="정기상품 요금 정렬 순서 수정", description="정기상품 요금 정렬 순서 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/fdrm/{id}/odrd")
    public String updateFdrmChrgeOrder(
            @PathVariable("id") final String id
            ) {
        return "updateFdrmChrgeOrder";
    }

    @Operation(summary="정기상품 요금 엑셀 다운로드", description="정기상품 요금를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/fdrms/excel")
    public String selectFdrmChrgeExcel() {
        return "selectFdrmChrgeExcel";
    }
}
