package com.custom.v1.controllers.fmcs.rntl;

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
 * @ClassName : Reservationcontrollers.java
 * @Description : 할인적용설정정보에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-07
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-07    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "할인적용설정정보",
     description = "대관관리 - 대관예약장소관리 - 할인적용설정정보"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/rntl")
public class FacilityDiscountController {

    @Operation(summary="할인적용정보 목록 조회", description="할인적용정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount")
    public String selectFacilityDiscountList(
            @PathVariable("instt") final String instt
            ) {
        return "selectFacilityDiscountList";
    }

    @Operation(summary="할인적용정보 조회", description="할인적용정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount/{id}")
    public String selectFacilityDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectFacilityDiscount";
    }

    @Operation(summary="할인적용정보 등록", description="할인적용정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/discount")
    public String insertFacilityDiscount(
            @PathVariable("instt") final String instt
            ) {
        return "insertFacilityDiscount";
    }

    @Operation(summary="할인적용정보 수정", description="할인적용정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/discount/{id}")
    public String updateFacilityDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateFacilityDiscount";
    }

    @Operation(summary="할인적용정보 삭제", description="할인적용정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/discount/{id}")
    public String deleteFacilityDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteFacilityDiscount";
    }
}
