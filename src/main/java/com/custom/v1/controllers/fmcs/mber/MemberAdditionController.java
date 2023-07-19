package com.custom.v1.controllers.fmcs.mber;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : MemberAdditioncontrollers.java
 * @Description : 회원 추가 정보관리에 관한 controller 클래스를 정의한다.
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
     name = "회원 추가 정보관리",
     description = "회원관리 - 회원 추가 정보관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/mber")
public class MemberAdditionController {

    /****************************************************************************************************
     *
     * 회원 감면대상 설정
     *
     ****************************************************************************************************/
    @Operation(summary="회원 감면 대상자 목록 조회", description="회원 감면 대상자 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount")
    public String selectMemberDiscountList(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberDiscountList";
    }

    @Operation(summary="회원 감면 정보 조회", description="회원 한명에 대한 감면 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount/{id}")
    public String selectMemberDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMemberDiscount";
    }

    @Operation(summary="회원 감면 정보 등록", description="회원 감면 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/discount/{id}")
    public String insertMemberDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "insertMemberDiscount";
    }

    @Operation(summary="회원 감면 정보 삭제", description="회원 감면 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/discount/{id}")
    public String deleteMemberDiscount(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMemberDiscount";
    }

    @Operation(summary="회원 감면 대상자 엑셀 다운로드", description="회원 감면 대상자 목록을 엑셀 파일로 다운로드한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/discount-excel")
    public String selectMemberDiscountExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberDiscountExcel";
    }

    /****************************************************************************************************
    *
    * 회원 추가 정보 관리
    *
    ****************************************************************************************************/
    @Operation(summary="회원 추가 정보 조회", description="회원 추가 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/add-info")
    public String selectMemberAddInfoList(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberAddInfoList";
    }

    @Operation(summary="회원 추가 정보 등록", description="회원 추가 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/add-info")
    public String insertMemberAddInfo(
            @PathVariable("instt") final String instt
            ) {
        return "insertMemberAddInfo";
    }

    @Operation(summary="회원 추가 정보 삭제", description="회원 추가 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/add-info/{id}")
    public String deleteMemberAddInfo(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMemberAddInfo";
    }

    /****************************************************************************************************
    *
    * 회원 비고 관리
    *
    ****************************************************************************************************/
    @Operation(summary="회원 비고 정보 조회", description="회원 비고 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/remark/{id}")
    public String selectMemberRemarkList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMemberRemarkList";
    }

    @Operation(summary="회원 비고 정보 등록", description="회원 비고 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/remark/{id}")
    public String insertMemberRemark(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "insertMemberRemark";
    }

    @Operation(summary="회원 비고 정보 삭제", description="회원 비고 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/remark/{id}")
    public String deleteMemberRemark(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMemberRemark";
    }

    /****************************************************************************************************
    *
    * SNS로그인연결정보
    *
    ****************************************************************************************************/
    @Operation(summary="회원 SNS 연결 정보 조회", description="회원 SNS 연결 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/sns-info/{id}")
    public String selectMemberSnsInfoList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMemberSnsInfoList";
    }

    /****************************************************************************************************
    *
    * 가족 관리
    *
    ****************************************************************************************************/
    @Operation(summary="가족 회원 정보 조회", description="가족 회원 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/family/{id}")
    public String selectMemberFamilykList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMemberFamilykList";
    }

    @Operation(summary="가족 회원 정보 등록", description="가족 회원 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/family/{id}")
    public String insertMemberFamilyk(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "insertMemberFamilyk";
    }

    @Operation(summary="가족 회원 정보 삭제", description="가족 회원 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/family/{id}")
    public String deleteMemberFamilyk(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMemberFamilyk";
    }
}
