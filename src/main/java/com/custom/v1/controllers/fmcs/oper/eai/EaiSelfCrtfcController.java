package com.custom.v1.controllers.fmcs.oper.eai;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : EaiSelfCrtfccontrollers.java
 * @Description : 본인인증 서비스 연계 설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-21
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-21    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "본인인증 서비스 연계 설정",
     description = """
             시스템관리 : 제품 서비스 설정 - 연계시스템 설정 - 본인인증 서비스 연계 설정 \n
             FMCS 서비스 : 운영 설정관리 - 연계시스템 설정 - 본인인증 서비스 연계 설정
             """
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class EaiSelfCrtfcController {

    @Operation(summary="본인인증 서비스 정보 조회", description="본인인증 서비스 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/eaicrtfc/{id}")
    public String selectEaiQualfCnfirm(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectEaiQualfCnfirm";
    }

    @Operation(summary="본인인증 서비스 정보 등록", description="본인인증 서비스 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/eaicrtfc")
    public String insertEaiQualfCnfirm(
            @PathVariable("instt") final String instt
            ) {
        return "insertEaiQualfCnfirm";
    }

    @Operation(summary="본인인증 서비스 정보 수정", description="본인인증 서비스 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/eaicrtfc/{id}")
    public String updateEaiQualfCnfirm(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateEaiQualfCnfirm";
    }

    @Operation(summary="본인인증 서비스 정보 삭제", description="본인인증 서비스 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/eaicrtfc/{id}")
    public String deleteEaiQualfCnfirm(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteEaiQualfCnfirm";
    }
}
