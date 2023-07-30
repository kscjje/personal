package com.custom.v1.member.service;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name= "MEMBER")
public class MemberVO {

	
	/**************************************************
	*
	* 회원 ( MEMBER ) 테이블 컬럼 정보
	*
	*************************************************/

	//회원번호
	private String memNo;
	
	//회원명
	private String memNm;
	
	//성별
	private String gender;
	
	//회원ID
	private String userId;
	
	//회원PW
	private String pwd;
	
	//가입일자
	private String joinDate;
	
	//핸드폰번호
	private String hp;
	
	// 회원최종로그인접속일시
	private String loginLastdate;
	
	//마지막비밀번호변경일자
	private String lastPwdUpdatedate;
	
	// 탈퇴일시
	private String outDate;
	
	//등록일시
	private String regdate;

	//등록자
	private String reguser;
	
	//수정일시
	private String moddate;
	
	//수정자
	private String moduser;
	
}
