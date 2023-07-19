package com.custom.v1.cmm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : MngrLogincontrollers.java
 * @Description : 사용자 인증/인가 처리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-24
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-24    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "사용자 로그인", description = "FMCS 사이트에 대한 사용자 인증/인가 처리 기능 정의")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/user")
public class UserLoginController {

    @Operation(
            summary="사용자 로그인"
            , description="""
                사용자 정보를 Basic Auth 방식으로 전송한 인증요청에 대한 검증(인가) 처리를 한다. \n
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
    @PostMapping(value = "/login")
    public String userLogin() {
        return "userLogin";
    }

    @Operation(
            summary="사용자 로그아웃"
            , description="""
                로그인 상태인 사용자에 대한 인가 정보 삭제 및 로그아웃 처리를 한다. \n
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/logout")
    public String userLogout() {
        return "userLogout";
    }

    @Operation(
            summary="사용자 ID 찾기"
            , description="""
                사용자 찾기 서비스 \n
                사용자 성명, 생년월일, 전화번호를 이용하여 사용자의 ID 일부를 보여준다.
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/search-id")
    public String searchID() {
        return "searchID";
    }

    @Operation(
            summary="사용자 비밀번호 초기화"
            , description="""
                사용자가 비밀번호 분실로 인해 비밀번호를 초기화하는 서비스 \n
                사용자 ID, 성명, 생년월일, 전화번호를 이용하여 사용자 인증 및 비밀번호 초기화를 진행 \n
                 - 임시 비밀번호를 생성하고, 등록된 E-Mail 또는 핸드폰번호(알림)으로 임시비밀번호를 전달
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/pw-initl")
    public String passwordInitl() {
        return "passwordInitl";
    }

    @Operation(
            summary="사용자 Access Token 재발행"
            , description="""
                사용자의 Access Token을 재발행 \n
                사용자 Refresh Token을 이용하여 사용자 인증/인가 및 Access Token 발행 전달 \n
                """
            )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/access-token")
    public String getAccessToken() {
        return "getAccessToken";
    }
}
