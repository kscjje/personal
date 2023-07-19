package com.custom.egovframework.wor.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import com.custom.egovframework.wor.service.WordDicaryVO;

@Repository("EgovWordDicaryDAO")
public class EgovWordDicaryDAO extends EgovAbstractMapper {

    private String nameSpace = "WordDicary.";

    public List<EgovMap> selectWordDicaryList(WordDicaryVO searchVO) {
        return selectList(nameSpace + "selectWordDicaryList", searchVO);
    }

    public int selectWordDicaryListCnt(WordDicaryVO searchVO) {
        return (Integer)selectOne(nameSpace + "selectWordDicaryListCnt", searchVO);
    }

    public EgovMap selectWordDicaryDetail(WordDicaryVO wordDicaryVO) {
        return (EgovMap)selectOne(nameSpace + "selectWordDicaryDetail", wordDicaryVO);
    }

    public void insertWordDicary(WordDicaryVO wordDicaryVO) {
        insert(nameSpace + "insertWordDicary", wordDicaryVO);
    }

    public void updateWordDicary(WordDicaryVO wordDicaryVO) {
        update(nameSpace + "updateWordDicary", wordDicaryVO);
    }

    public void deleteWordDicary(WordDicaryVO wordDicaryVO) {
        delete(nameSpace + "deleteWordDicary", wordDicaryVO);
    }

}
