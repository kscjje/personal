package com.custom.v1.controllers.fmcs.sys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @ClassName : LogManagecontrollers.java
 * @Description : 운영정보LOG관리에 관한 controller 클래스를 정의한다.
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
     name = "운영정보LOG관리",
     description = "시스템관리 - 운영정보LOG관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/sys/log")
public class LogManageController {

    @Operation(summary="오류로그 조회", description="오류로그 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/error")
    public String selectLogErrorList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLogErrorList";
    }

    @Operation(summary="개인정보변경이력LOG", description="개인정보변경이력 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/indvdlinfo-change")
    public String selectIndvdlinfoChangeList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIndvdlinfoChangeList";
    }

    @Operation(summary="개인정보접속이력LOG", description="개인정보접속이력LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/indvdlinfo-access")
    public String selectIndvdlinfoAccessList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectIndvdlinfoAccessList";
    }

    @Operation(summary="권한변경이력LOG", description="권한변경이력LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/author-change")
    public String selectAuthorChangeList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectAuthorChangeList";
    }

    @Operation(summary="웹회원접속이력LOG", description="웹회원접속이력LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/user-access")
    public String selectUserAccessList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectUserAccessList";
    }

    @Operation(summary="관리자접속LOG", description="관리자접속LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/manager-access")
    public String selectManagerAccessList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectManagerAccessList";
    }

    @Operation(summary="강좌변경이력LOG", description="강좌변경이력LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lecture-change")
    public String selectLectureChangeList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLectureChangeList";
    }

    @Operation(summary="예약결제대기LOG", description="예약결제대기LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/resve-setle")
    public String selectResveSetleList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectResveSetleList";
    }

    @Operation(summary="알림발송LOG", description="알림발송LOG 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/notification")
    public String selectNotificationList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectNotificationList";
    }
}
