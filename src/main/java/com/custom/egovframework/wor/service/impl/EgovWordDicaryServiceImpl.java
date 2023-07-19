package com.custom.egovframework.wor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import com.custom.egovframework.wor.service.EgovWordDicaryService;
import com.custom.egovframework.wor.service.WordDicaryVO;

@Service("EgovWordDicaryService")
public class EgovWordDicaryServiceImpl implements EgovWordDicaryService {

    @Resource(name = "EgovWordDicaryDAO")
    private EgovWordDicaryDAO egovWordDicaryDao;

    /** ID Generation */
    @Resource(name = "egovWordDicaryIdGnrService")
    private EgovIdGnrService idgenService;

    @Override
    public List<EgovMap> selectWordDicaryList(WordDicaryVO searchVO) {
        return egovWordDicaryDao.selectWordDicaryList(searchVO);
    }

    @Override
    public int selectWordDicaryListCnt(WordDicaryVO searchVO) {
        return egovWordDicaryDao.selectWordDicaryListCnt(searchVO);
    }

    @Override
    public EgovMap selectWordDicaryDetail(WordDicaryVO wordDicaryVO) throws Exception {
        EgovMap resultVO = egovWordDicaryDao.selectWordDicaryDetail(wordDicaryVO);
//        if (resultVO == null)
//            throw processException("info.nodata.msg");
        return resultVO;
    }

    @Override
    public void insertWordDicary(WordDicaryVO wordDicaryVO) throws Exception {

        String wordId = idgenService.getNextStringId();
        wordDicaryVO.setWordId(wordId);

        egovWordDicaryDao.insertWordDicary(wordDicaryVO);
    }

    @Override
    public void updateWordDicary(WordDicaryVO wordDicaryVO) {
        egovWordDicaryDao.updateWordDicary(wordDicaryVO);
    }

    @Override
    public void deleteWordDicary(WordDicaryVO wordDicaryVO) {
        egovWordDicaryDao.deleteWordDicary(wordDicaryVO);
    }

}
