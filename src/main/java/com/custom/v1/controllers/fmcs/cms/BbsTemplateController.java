package com.custom.v1.controllers.fmcs.cms;

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
 * @ClassName : BbsTemplatecontrollers.java
 * @Description : 게시판템플릿관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-02
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-02    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "게시판템플릿관리",
     description = "컨텐츠관리 - 게시판템플릿관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/cms/bbs")
public class BbsTemplateController {

    @Operation(summary="게시판템플릿관리 목록 조회", description="게시판템플릿관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/tmplat")
    public String selectBbsTemplateList(
            @PathVariable("instt") final String instt
            ) {
        return "selectBbsTemplateList";
    }

    @Operation(summary="게시판템플릿관리 정보 조회", description="게시판템플릿관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/tmplat/{id}")
    public String selectBbsTemplate(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectBbsTemplate";
    }

    @Operation(summary="게시판템플릿관리 정보 등록", description="게시판템플릿관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/tmplat")
    public String insertBbsTemplate(
            @PathVariable("instt") final String instt
            ) {
        return "insertBbsTemplate";
    }

    @Operation(summary="게시판템플릿관리 정보 수정", description="게시판템플릿관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/tmplat/{id}")
    public String updateBbsTemplate(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateBbsTemplate";
    }

    @Operation(summary="게시판템플릿관리 정보 삭제", description="게시판템플릿관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/tmplat/{id}")
    public String deleteBbsTemplate(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteBbsTemplate";
    }
}
