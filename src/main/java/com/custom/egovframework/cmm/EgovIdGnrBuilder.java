package com.custom.egovframework.cmm;

import javax.sql.DataSource;

import org.egovframe.rte.fdl.idgnr.impl.strategy.EgovIdGnrStrategyImpl;

/**
 * @ClassName : EgovIdGnrBuilder.java
 * @Description : IdGen 정보 builder
 *
 * @author : 윤주호
 * @since  : 2021. 7. 20
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일              수정자               수정내용
 *  -------------  ------------   ---------------------
 *   2021. 7. 20    윤주호               최초 생성
 * </pre>
 *
 */
public class EgovIdGnrBuilder {

    // TODO : 기본값 설정, 예외처리 필요

    private DataSource dataSource;
    private EgovIdGnrStrategyImpl egovIdGnrStrategyImpl;

    private String preFix;
    private int cipers;
    private char fillChar;

    private int blockSize;
    private String table;
    private String tableName;

    public EgovIdGnrBuilder setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public EgovIdGnrBuilder setEgovIdGnrStrategyImpl(EgovIdGnrStrategyImpl egovIdGnrStrategyImpl) {
        this.egovIdGnrStrategyImpl = egovIdGnrStrategyImpl;
        return this;
    }

    public EgovIdGnrBuilder setPreFix(String preFix) {
        this.preFix = preFix;
        return this;
    }
    public EgovIdGnrBuilder setCipers(int cipers) {
        this.cipers = cipers;
        return this;
    }
    public EgovIdGnrBuilder setFillChar(char fillChar) {
        this.fillChar = fillChar;
        return this;
    }
    public EgovIdGnrBuilder setBlockSize(int blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public EgovIdGnrBuilder setTable(String table) {
        this.table = table;
        return this;
    }
    public EgovIdGnrBuilder setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public TableIdGnrServiceImpl build() {

        TableIdGnrServiceImpl tableIdGnrServiceImpl = new TableIdGnrServiceImpl();
        tableIdGnrServiceImpl.setDataSource(dataSource);
        if(egovIdGnrStrategyImpl != null) {
            egovIdGnrStrategyImpl = new EgovIdGnrStrategyImpl();
            egovIdGnrStrategyImpl.setPrefix(preFix);
            egovIdGnrStrategyImpl.setCipers(cipers);
            egovIdGnrStrategyImpl.setFillChar(fillChar);

            tableIdGnrServiceImpl.setStrategy(egovIdGnrStrategyImpl);
        }
        tableIdGnrServiceImpl.setBlockSize(blockSize);
        tableIdGnrServiceImpl.setTable(table);
        tableIdGnrServiceImpl.setTableName(tableName);

        return tableIdGnrServiceImpl;
    }

}
