package com.custom.egovframework.config;

import javax.sql.DataSource;

import org.egovframe.rte.fdl.idgnr.impl.strategy.EgovIdGnrStrategyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.custom.egovframework.cmm.EgovIdGnrBuilder;
import com.custom.egovframework.cmm.TableIdGnrServiceImpl;

/**
 * @ClassName : EgovConfigAppIdGen.java
 * @Description : IdGeneration 설정
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
@Configuration
public class EgovConfigAppIdGen {
    @Autowired
    @Qualifier("dataSource")
    DataSource dataSource;

    // 용어사전
    @Bean(destroyMethod = "destroy")
    public TableIdGnrServiceImpl egovWordDicaryIdGnrService() {
        return new EgovIdGnrBuilder()
            .setDataSource(dataSource)
            .setEgovIdGnrStrategyImpl(new EgovIdGnrStrategyImpl())
            .setBlockSize(10)
            .setTable("egovdb.COMTECOPSEQ")
            .setTableName("WORD_ID")
            .setPreFix("WORDDICARY_")
            .setCipers(9)
            .setFillChar('0')
            .build();
    }

    // 용어사전
    @Bean(destroyMethod = "destroy")
    public TableIdGnrServiceImpl egovAdministrationWordIdGnrService() {
        return new EgovIdGnrBuilder()
            .setDataSource(dataSource)
            .setEgovIdGnrStrategyImpl(new EgovIdGnrStrategyImpl())
            .setBlockSize(10)
            .setTable("egovdb.COMTECOPSEQ")
            .setTableName("ADMINIST_WORD_ID")
            .setPreFix("ADMINIST_")
            .setCipers(11)
            .setFillChar('0')
            .build();
    }

}
