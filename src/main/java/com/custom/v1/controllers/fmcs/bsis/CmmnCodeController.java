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
 * @ClassName : CmmnCodecontrollers.java
 * @Description : 공통 코드에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-17
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-17    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "공통코드 관리", description = "기초관리 - 공통코드 관리")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/bsis")
public class CmmnCodeController {

    @Operation(summary="공통코드 목록 조회", description="공통코드 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/codes")
    public String selectCmmnCodeList() {
        return "selectCmmnCodeList";
    }

    @Operation(summary="공통코드 정보 조회", description="공통코드 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/code/{id}")
    public String selectCmmnCode(
            @PathVariable("id") final String id
            ) {
        return "selectCmmnCode";
    }

    @Operation(summary="공통코드 정보 등록", description="공통코드 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/code")
    public String insertCmmnCode() {
        return "insertCmmnCode";
    }

    @Operation(summary="공통코드 정보 수정", description="공통코드 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/code/{id}")
    public String updateCmmnCode(
            @PathVariable("id") final String id
            ) {
        return "updateCmmnCode";
    }

    @Operation(summary="공통코드 정보 삭제", description="공통코드 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/code/{id}")
    public String deleteCmmnCode(
            @PathVariable("id") final String id
            ) {
        return "deleteCmmnCode";
    }

    @Operation(summary="공통코드 정렬 순서 수정", description="공통코드 정렬 순서 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/code/{id}/odrd")
    public String updateCmmnCodeOrder(
            @PathVariable("id") final String id
            ) {
        return "updateCmmnCodeOrder";
    }

    @Operation(summary="공통코드 엑셀 다운로드", description="공통코드를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/codes/excel")
    public String selectCmmnCodeExcel() {
        return "selectCmmnCodeExcel";
    }
}
