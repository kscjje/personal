package com.custom.v1.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.custom.egovframework.cmm.ComDefaultVO;
import com.custom.v1.member.service.MemberService;
import com.custom.v1.member.service.MemberVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


/**
 * @ClassName : MngrLogincontrollers.java
 * @Description : 회원 인증/인가 처리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-24
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일                  수정자                 수정내용
 *  ----------        ----------        ----------------------------------------
 *  2022-10-24        김영철                  최초 생성
 *
 * </pre>
 */

@Tag(name = "회원 로그인", description = "통합예약 시스템에 대한 사용자 인증/인가 처리 기능 정의")
@Controller
@RequestMapping("/v1/member")
public class LoginController {
	
//	@Autowired
//	MemberJwtProperties jwtProperties;

	@Autowired
	private MemberService memberService;
	
	@Value("${server.port}")
	private String port;

	
//	@Operation(
//			summary="회원 로그인"
//		, description="""
//			회원 정보를 Basic Auth 방식으로 전송한 인증요청에 대한 검증(인가) 처리를 한다. \n
//			- HTTP Header Authorization에 ID/PW 또는 Device Key를 전송 \n
//			- Base64Encoded("ID:PW") or Base64Encoded("Device Key:") \n
//			- 데이터 검증을 위한 Parameter로 ID/PW 또는 Device Key를 전송""")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "성공"),
                        @ApiResponse(responseCode = "400", description = "실패"),
                        @ApiResponse(responseCode = "404", description = "실패2")
        })
        @GetMapping(value = "/login")
        public String login() {
//			MemberVO memberVO = new MemberVO();
		
//			List<?> a = memberService.selectMemberList(memberVO);
			
			return "member/login";
        }
}