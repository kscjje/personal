package com.custom.v1.controllers.fmcs.lckr;

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
 * @ClassName : LockerRentalcontrollers.java
 * @Description : 사물함신청대기자관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-08
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-08    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "사물함신청대기자관리",
     description = "사물함관리 - 사물함신청대기자관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lckr")
public class LockerWaitingController {

    @Operation(summary="사물함위치대기자명단 조회", description="사물함위치대기자명단 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/waiting")
    public String selectLockerWaitingList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerWaitingList";
    }

    @Operation(summary="사물함위치별대기인원정보 조회", description="사물함위치별대기인원정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/lc-waiting")
    public String selectLockerWaitingLocationList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerWaitingLocationList";
    }

    @Operation(summary="사물함신청대기자 정보 조회", description="사물함신청대기자 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/waiting/{id}")
    public String selectLockerWaiting(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLockerWaiting";
    }

    @Operation(summary="사물함신청대기자 정보 등록", description="사물함신청대기자 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/waiting")
    public String insertLockerWaiting(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerWaiting";
    }

    @Operation(summary="사물함신청대기자 정보 수정", description="사물함신청대기자 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/waiting/{id}")
    public String updateLockerWaiting(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerWaiting";
    }

    @Operation(summary="사물함신청대기자 정보 삭제", description="사물함신청대기자 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/waiting/{id}")
    public String deleteLockerWaiting(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLockerWaiting";
    }

    @Operation(summary="사물함신청대기자 배정처리 정보 등록", description="사물함신청대기자 배정처리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/wtng/asign")
    public String insertLockerWaitingAsign(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerWaiting";
    }

    @Operation(summary="사물함신청대기자 배정취소 정보 등록", description="사물함신청대기자 배정취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/wtng/asign-cancel")
    public String insertLockerWaitingAsignCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerWaitingAsignCancel";
    }

    @Operation(summary="사물함신청대기자 신청취소 정보 등록", description="사물함신청대기자 신청취소 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/waiting-cancel")
    public String insertLockerWaitingCancel(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerWaitingCancel";
    }
}
