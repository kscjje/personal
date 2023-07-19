package com.custom.v1.controllers.fmcs.mber;

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
 * @ClassName : Membercontrollers.java
 * @Description : 회원정보관리에 관한 controller 클래스를 정의한다.
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
     name = "회원정보관리",
     description = "회원관리 - 회원정보관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}")
public class MemberController {

    @Operation(summary="회원 정보 목록 조회", description="회원 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member")
    public String selectMemberList(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberList";
    }

    @Operation(summary="회원 정보 조회", description="회원 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member/{id}")
    public String selectMember(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMember";
    }

    @Operation(summary="회원 정보 등록", description="회원 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/member")
    public String insertMember(
            @PathVariable("instt") final String instt
            ) {
        return "insertMember";
    }

    @Operation(summary="회원 정보 수정", description="회원 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member/{id}")
    public String updateMember(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMember";
    }

    @Operation(summary="회원 정보 부분 수정", description="회원 정보 일부 내용을 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member-modify/{modify}")
    public String modifyMember(
            @PathVariable("instt") final String instt,
            @PathVariable("modify") final String mod
            ) {
        return "modifyMember";
    }

    @Operation(summary="회원 정보 삭제", description="회원 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/member/{id}")
    public String deleteMember(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMember";
    }

    @Operation(summary="회원 사진 정보 갱신", description="회원 사진 정보를 등록 또는 수정 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member-photo/{id}")
    public String updateMemberPhoto(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMemberPhoto";
    }

    @Operation(summary="회원 사진 정보 삭제", description="회원 사진 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/member-photo/{id}")
    public String deleteMemberPhoto(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteMemberPhoto";
    }

    @Operation(summary="회원 탈퇴", description="회원을 탈퇴 처리한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member-withdrawal/{id}")
    public String updateMemberWithdrawal(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMemberWithdrawal";
    }

    @Operation(summary="회원 정보 검색", description="다양한 조건으로 회원 정보를 검색한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-search")
    public String selectMemberSearch(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberSearch";
    }

    @Operation(summary="회원 정보 엑셀 다운로드", description="회원 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member-excel")
    public String selectMemberExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectMemberExcel";
    }

    @Operation(summary="회원 정보 통합", description="중복 회원 정보를 하나의 회원 정보로 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member-merge/{id}")
    public String updateMemberMerge(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMemberMerge";
    }
}
