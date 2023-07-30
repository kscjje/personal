package com.custom.v1.member.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.custom.v1.member.service.MemberService;
import com.custom.v1.member.service.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDAO memberDAO;

    @Override
    public List<?> selectMemberList(MemberVO searchVO) {
        return memberDAO.selectMemberList(searchVO);
    }

	@Override
	public Map<?, ?> selectMemberDetail(MemberVO searchVO) {
		return memberDAO.selectMemberDetail(searchVO);
	}

	@Override
	public int deleteMember(MemberVO memberVO) {
		return memberDAO.deleteMember(memberVO); 
	}

	@Override
	public int insertMember(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.insertMember(memberVO); 
	}

	@Override
	public int updateMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return memberDAO.updateMember(memberVO); 
	}

}