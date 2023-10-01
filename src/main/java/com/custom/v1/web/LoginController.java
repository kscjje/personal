package com.custom.v1.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custom.v1.member.service.MemberService;
import com.custom.v1.member.service.MemberVO;

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
public class LoginController {
	
//	@Autowired
//	MemberJwtProperties jwtProperties;

	@Autowired
	private MemberService memberService;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping(value = "test")
	public String login(Model model) {
		MemberVO memberVO = new MemberVO();
	
		List<?> a = memberService.selectMemberList(memberVO);
		//젠킨스테스트    
		model.addAttribute("top", a);
		return "test";
	}
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String goHome(HttpServletRequest request
			,Model model) {
		MemberVO memberVO = new MemberVO();
		List<?> a = memberService.selectMemberList(memberVO);
		
		model.addAttribute("top", a);
		
		return "content/home";
	}
}