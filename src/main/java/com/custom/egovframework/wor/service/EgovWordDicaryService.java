package com.custom.egovframework.wor.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface EgovWordDicaryService {

    List<EgovMap> selectWordDicaryList(WordDicaryVO searchVO);

    int selectWordDicaryListCnt(WordDicaryVO searchVO);

    EgovMap selectWordDicaryDetail(WordDicaryVO wordDicaryVO) throws Exception;

    void insertWordDicary(WordDicaryVO wordDicaryVO) throws Exception;

    void updateWordDicary(WordDicaryVO wordDicaryVO);

    void deleteWordDicary(WordDicaryVO wordDicaryVO);

}
