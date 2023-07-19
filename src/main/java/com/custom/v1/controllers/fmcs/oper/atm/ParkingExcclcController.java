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
 * @ClassName : ParkingExcclccontrollers.java
 * @Description : 주차정산 운영 설정에 관한 controller 클래스를 정의한다.
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
     name = "주차정산 운영 설정관리",
     description = "운영 설정관리 - 자동화시스템 운영 설정 - 주차정산 운영 설정관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class ParkingExcclcController {

    @Operation(summary="주차정산 운영 설정관리 목록 조회", description="주차정산 운영 설정관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/parking-excclc")
    public String selectParkingExcclcList(
            @PathVariable("instt") final String instt
            ) {
        return "selectParkingExcclcList";
    }

    @Operation(summary="주차정산 운영 설정관리 정보 조회", description="주차정산 운영 설정관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/parking-excclc/{id}")
    public String selectParkingExcclc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectParkingExcclc";
    }

    @Operation(summary="주차정산 운영 설정관리 정보 등록", description="주차정산 운영 설정관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/parking-excclc")
    public String insertParkingExcclc(
            @PathVariable("instt") final String instt
            ) {
        return "insertParkingExcclc";
    }

    @Operation(summary="주차정산 운영 설정관리 정보 수정", description="주차정산 운영 설정관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/parking-excclc/{id}")
    public String updateParkingExcclc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateParkingExcclc";
    }

    @Operation(summary="주차정산 운영 설정관리 정보 삭제", description="주차정산 운영 설정관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/parking-excclc/{id}")
    public String deleteParkingExcclc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteParkingExcclc";
    }
}
