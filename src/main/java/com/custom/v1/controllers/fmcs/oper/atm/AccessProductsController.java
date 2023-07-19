package com.custom.v1.controllers.fmcs.oper.atm;

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
 * @ClassName : AccessProductscontrollers.java
 * @Description : 출입가능상품정보에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-31
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-31    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "출입문운영설정 - 출입가능상품정보",
     description = "운영 설정관리 - 자동화시스템 운영 설정 - 출입문운영설정관리 - 출입가능상품정보"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class AccessProductsController {

    @Operation(summary="출입가능상품정보 목록 조회", description="출입가능상품정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/accsprds")
    public String selectAccessProductsList(
            @PathVariable("instt") final String instt
            ) {
        return "selectAccessProductsList";
    }

    @Operation(summary="출입가능상품정보 조회", description="출입가능상품정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/accsprd/{id}")
    public String selectAccessProducts(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectAccessProducts";
    }

    @Operation(summary="출입가능상품정보 등록", description="출입가능상품정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/accsprd")
    public String insertAccessProducts(
            @PathVariable("instt") final String instt
            ) {
        return "insertAccessProducts";
    }

    @Operation(summary="출입가능상품정보 수정", description="출입가능상품정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/accsprd/{id}")
    public String updateAccessProducts(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateAccessProducts";
    }

    @Operation(summary="출입가능상품정보 삭제", description="출입가능상품정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/accsprd/{id}")
    public String deleteAccessProducts(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteAccessProducts";
    }
}
