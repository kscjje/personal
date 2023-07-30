package com.custom.v1.member.service;

import java.util.List;
import java.util.Map;

public interface MemberService {
	public List<?> selectMemberList(MemberVO searchVO);

	public Map<?, ?> selectMemberDetail(MemberVO searchVO);

	public int deleteMember(MemberVO memberVO);

	public int insertMember(MemberVO memberVO) throws Exception;

	public int updateMember(MemberVO memberVO);

}
