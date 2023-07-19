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
 * @ClassName : Noticecontrollers.java
 * @Description : 공지관리에 관한 controller 클래스를 정의한다.
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
     name = "공지관리",
     description = "컨텐츠관리 - 공지관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/cms")
public class NoticeController {

    @Operation(summary="공지관리 목록 조회", description="공지관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/notice")
    public String selectNoticeList(
            @PathVariable("instt") final String instt
            ) {
        return "selectNoticeList";
    }

    @Operation(summary="공지관리 정보 조회", description="공지관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/notice/{id}")
    public String selectNotice(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectNotice";
    }

    @Operation(summary="공지관리 정보 등록", description="공지관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/notice")
    public String insertNotice(
            @PathVariable("instt") final String instt
            ) {
        return "insertNotice";
    }

    @Operation(summary="공지관리 정보 수정", description="공지관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/notice/{id}")
    public String updateNotice(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateNotice";
    }

    @Operation(summary="공지관리 정보 삭제", description="공지관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/notice/{id}")
    public String deleteNotice(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteNotice";
    }
}
