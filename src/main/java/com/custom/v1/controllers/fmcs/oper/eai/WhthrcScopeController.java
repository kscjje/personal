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
 * @ClassName : WhthrcScopecontrollers.java
 * @Description : 관내범위 지역설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-31
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-31    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "관내범위 지역설정", description = "운영 설정관리 - 연계시스템 설정 - 비대면 자격확인서비스 연계 설정 - 관내범위 지역설정")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class WhthrcScopeController {

    @Operation(summary="관내범위 지역설정 목록 조회", description="관내범위 지역설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/whthrc-scope-scope")
    public String selectWhthrcScopeList(
            @PathVariable("instt") final String instt
            ) {
        return "selectWhthrcScopeList";
    }

    @Operation(summary="관내범위 지역설정 정보 조회", description="관내범위 지역설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/whthrc-scope/{id}")
    public String selectWhthrcScope(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectWhthrcScope";
    }

    @Operation(summary="관내범위 지역설정 정보 등록", description="관내범위 지역설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/whthrc-scope")
    public String insertWhthrcScope(
            @PathVariable("instt") final String instt
            ) {
        return "insertWhthrcScope";
    }

    @Operation(summary="관내범위 지역설정 정보 수정", description="관내범위 지역설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/whthrc-scope/{id}")
    public String updateWhthrcScope(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateWhthrcScope";
    }

    @Operation(summary="관내범위 지역설정 정보 삭제", description="관내범위 지역설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/whthrc-scope/{id}")
    public String deleteWhthrcScope(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteWhthrcScope";
    }
}
