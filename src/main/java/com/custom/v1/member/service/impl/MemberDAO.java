package com.custom.v1.member.service.impl;

import java.util.List;
import java.util.Map;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import com.custom.v1.member.service.MemberVO;

@Repository
public class MemberDAO extends EgovAbstractMapper {
    private static String nameSpace = "Member.";

    public List<?> selectMemberList(MemberVO searchVO) {
        return selectList(nameSpace + "selectMemberList", searchVO);
    }

    public Map<?, ?> selectMemberDetail(MemberVO searchVO) {
        return selectOne(nameSpace + "selectFmcsMemberDetail", searchVO);
    }
    
    public int insertMember(MemberVO memberVO) {
        return insert(nameSpace + "insertMember", memberVO);
    }
    
    public int deleteMember(MemberVO memberVO) {
        return delete(nameSpace + "deleteMember", memberVO);
    }

    public int updateMember(MemberVO memberVO) {
        return update(nameSpace + "updateMember", memberVO);
    }

}