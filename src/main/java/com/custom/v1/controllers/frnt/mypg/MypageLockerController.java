package com.custom.v1.controllers.frnt.mypg;

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
 * @ClassName : MypageLockercontrollers.java
 * @Description : 사물함내역에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-15
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-15    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 05. 마이페이지 - 05) 사물함내역",
     description = """
             사물함 신청내역 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/mypg")
public class MypageLockerController {

    @Operation(summary="사물함내역 목록 조회", description="사물함내역 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker-list/{id}")
    public String selectMypageLockerList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageLockerList";
    }

    @Operation(summary="사물함내역 정보 조회", description="사물함내역 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/locker/{id}")
    public String selectMypageLocker(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageLocker";
    }

    @Operation(summary="사물함 대기 신청 등록", description="사물함 대기자 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/locker")
    public String insertMypageLocker(
            @PathVariable("instt") final String instt
            ) {
        return "insertMypageLocker";
    }

    @Operation(summary="사물함 대기자 신청 수정", description="사물함 대기자 신청 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/locker/{id}")
    public String updateMypageLocker(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageLocker";
    }

    @Operation(summary="사물함 대기 신청 취소", description="사물함 대기 신청을 취소한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/locker-cancel/{id}")
    public String updateMypageLockerCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageLockerCancel";
    }
}
