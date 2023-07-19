package com.custom.v1.controllers.frnt.mber;

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
 * @ClassName : MemberSignUpcontrollers.java
 * @Description : 회원정보관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-16
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-16    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 01. 공통 - 01) 회원정보 관리",
     description = """
             통합예약시스템 회원 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}")
public class FrontMemberController {

    @Operation(summary="회원 정보 조회", description="회원 정보을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/member/{id}")
    public String selectFrontMember(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectFrontMember";
    }

    @Operation(summary="회원 가입 정보 등록", description="회원 가입 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/meber")
    public String insertFrontMember(
            @PathVariable("instt") final String instt
            ) {
        return "insertFrontMember";
    }

    @Operation(summary="회원 정보 수정", description="회원 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/member/{id}")
    public String updateFrontMeber(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateFrontMeber";
    }

    @Operation(summary="아이디 중복 확인", description="요청 아이디가 사용 중인지 확인한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/mber/id-dplct")
    public String selectFrontMemberIdDplct(
            @PathVariable("instt") final String instt
            ) {
        return "selectFrontMemberIdDplct";
    }

    @Operation(
            summary="회원 로그인"
            , description="""
                회원 정보를 Basic Auth 방식으로 전송한 인증요청에 대한 검증(인가) 처리를 한다. \n
                - HTTP Header Authorization에 ID/PW 또는 Device Key를 전송 \n
                - Base64Encoded("ID:PW") or Base64Encoded("Device Key:") \n
                - 데이터 검증을 위한 Parameter로 ID/PW 또는 Device Key를 전송
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/mber/login")
    public String userLogin(
            @PathVariable("instt") final String instt
            ) {
        return "userLogin";
    }

    @Operation(
            summary="회원 로그아웃"
            , description="""
                로그인 상태인 회원에 대한 인가 정보 삭제 및 로그아웃 처리를 한다. \n
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/mber/logout")
    public String userLogout(
            @PathVariable("instt") final String instt
            ) {
        return "userLogout";
    }

    @Operation(summary="비밀번호 수정", description="회원의 비밀번호를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/mber/pw-change/{id}")
    public String updateFrontMemberPwChange(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateFrontMemberPwChange";
    }

    @Operation(summary="회원탈퇴", description="회원탈퇴 처리를 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/mber/withdrawal/{id}")
    public String updateFrontMemberWithdrawal(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateFrontMemberWithdrawal";
    }

    @Operation(summary="모바일 회원카드 정보 조회", description="모바일 회원카드 정보을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/mber/card/{id}")
    public String selectFrontMemberCard(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectFrontMemberCard";
    }

    @Operation(
            summary="회원 아이디 찾기"
            , description="""
                회원 찾기 서비스 \n
                회원 성명, 생년월일, 전화번호를 이용하여 회원의 ID 일부를 보여준다.
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/mber/find-id")
    public String findFrontMemberID(
            @PathVariable("instt") final String instt
            ) {
        return "findFrontMemberID";
    }

    @Operation(
            summary="회원 비밀번호 찾기"
            , description="""
                회원이 비밀번호 분실로 인해 비밀번호를 찾기 서비스 \n
                회원 ID, 성명, 생년월일, 전화번호를 이용하여 회원 인증 및 비밀번호 조회 진행 \n
                 - 비밀번호 일부를 사용자에게 보여 준다.
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/mber/find-pw/{id}")
    public String findFrontMemberPassword(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "findFrontMemberPassword";
    }

    @Operation(
            summary="회원 비밀번호 초기화"
            , description="""
                회원이 비밀번호 분실로 인해 비밀번호를 초기화하는 서비스 \n
                회원 ID, 성명, 생년월일, 전화번호를 이용하여 회원 인증 및 비밀번호 초기화를 진행 \n
                 - 임시 비밀번호를 생성하고, 등록된 E-Mail 또는 핸드폰번호(알림)으로 임시비밀번호를 전달
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/mber/pw-initl/{id}")
    public String initFrontMeberPassword(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "initFrontMeberPassword";
    }

    @Operation(summary="휴면회원 해제", description="휴면회원 휴면 해제 처리를 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/mber/dormancy-cancel/{id}")
    public String updateFrontMemberDormancyCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateFrontMemberDormancyCancel";
    }

    @Operation(
            summary="회원 Access Token 재발행"
            , description="""
                회원의 Access Token을 재발행 \n
                회원 Refresh Token을 이용하여 회원 인증/인가 및 Access Token 발행 전달 \n
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/mber/access-token")
    public String reIssueAccessToken() {
        return "reIssueAccessToken";
    }

    @Operation(
            summary="회원 Access Token 검증"
            , description="""
                회원의 Access Token을 검증 \n
                유효한 Access Token 인지 확인한다.
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/mber/access-token")
    public String verificationAccessToken() {
        return "verificationAccessToken";
    }
}
