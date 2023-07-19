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
 * @ClassName : Lockercontrollers.java
 * @Description : 사물함정보관리에 관한 controller 클래스를 정의한다.
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
     name = "사물함정보관리",
     description = "사물함관리 - 사물함정보관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}")
public class LockerController {

    @Operation(summary="사물함정보 목록 조회", description="사물함정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker")
    public String selectLockerList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerList";
    }

    @Operation(summary="사물함정보 조회", description="사물함정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker/{id}")
    public String selectLocker(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLocker";
    }

    @Operation(summary="사물함정보 등록", description="사물함 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/locker")
    public String insertLocker(
            @PathVariable("instt") final String instt
            ) {
        return "insertLocker";
    }

    @Operation(summary="사물함 정보 수정", description="사물함 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/locker/{id}")
    public String updateLocker(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLocker";
    }

    @Operation(summary="사물함 정보 삭제", description="사물함 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/locker/{id}")
    public String deleteLocker(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLocker";
    }

    @Operation(summary="사물함정보 엑셀 다운로드", description="사물함정보 엑셀파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker-excel")
    public String selectLockerExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerExcel";
    }

    @Operation(summary="사물함 현재 상태 정보 조회", description="사물함 구역별 현재 상태 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker-info")
    public String selectLockerInfoList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerInfoList";
    }
}
