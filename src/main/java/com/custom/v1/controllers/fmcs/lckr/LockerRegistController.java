package com.custom.v1.controllers.fmcs.lckr;

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
 * @ClassName : LockerRegistcontrollers.java
 * @Description : 사물함임대현황에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-11
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-11    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "사물함임대현황 - 사물함 신청",
     description = "회원관리 - 회원정보관리 - 사물함임대현황 - 사물함 신청"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lckr")
public class LockerRegistController {

    @Operation(summary="사물함 신청 정보 조회", description="특정 회원이 신청한 사물함 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/regist/{id}")
    public String selectLockerRegist(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLockerRegist";
    }

    @Operation(summary="사물함 신청 정보 등록", description="사물함 신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/regist")
    public String insertLockerRegist(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRegist";
    }

    @Operation(summary="사물함 재신청 정보 등록", description="사물함 재신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/re-regist")
    public String insertLockerReRegist(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerReRegist";
    }

    @Operation(summary="사물함 신청 취소 정보 등록", description="사물함 신청 취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/regist-cancel")
    public String insertLockerRegistCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRegist";
    }

    @Operation(summary="사물함 반납 신청", description="사물함 반납을 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/return/{id}")
    public String updateLockerReturn(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerReturn";
    }

    @Operation(summary="사물함 반납 신청", description="사물함 반납을 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/return-cancel/{id}")
    public String updateLockerReturnCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerReturnCancel";
    }

    @Operation(summary="사물함 변경 신청", description="사물함 변경을 신청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/change/{id}")
    public String updateLockerChange(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerChange";
    }

    @Operation(summary="사물함 보증금 등록", description="신청 보증금 납부 내용을 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/guaranty/{id}")
    public String insertLockerRegistGuaranty(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "insertLockerRegistGuaranty";
    }

    @Operation(summary="사물함 보증금 반납 등록", description="신청 보증금 반납 내용을 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/guaranty-return/{id}")
    public String insertLockerRegistGuarantyReturn(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "insertLockerRegistGuarantyReturn";
    }
}
