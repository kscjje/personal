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
 * @ClassName : EaiSetlecontrollers.java
 * @Description : 결제서비스 운영 설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-20
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-20    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "결제시스템 연계 설정",
     description = """
             시스템관리 : 제품 서비스 설정 - 연계시스템 설정 - 결제서비스 운영 설정 \n
             FMCS 서비스 : 운영설정관리 - 연계시스템설정 - 결제서비스 운영 설정
             """
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class EaiSetleController {

    @Operation(summary="결제서비스 목록 조회", description="결제서비스 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/eaistls")
    public String selectEaiSetleSvcList(
            @PathVariable("instt") final String instt
            ) {
        return "selectEaiSetleSvcList";
    }

    @Operation(summary="결제서비스 정보 조회", description="결제서비스 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/eaistl/{id}")
    public String selectEaiSetleSvc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectEaiSetleSvc";
    }

    @Operation(summary="결제서비스 정보 등록", description="결제서비스 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/eaistl")
    public String insertEaiSetleSvc(
            @PathVariable("instt") final String instt
            ) {
        return "insertEaiSetleSvc";
    }

    @Operation(summary="결제서비스 정보 수정", description="결제서비스 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/eaistl/{id}")
    public String updateEaiSetleSvc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateEaiSetleSvc";
    }

    @Operation(summary="결제서비스 정보 삭제", description="결제서비스 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/eaistl/{id}")
    public String deleteEaiSetleSvc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteEaiSetleSvc";
    }
}
