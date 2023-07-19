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
 * @ClassName : MypageRentalcontrollers.java
 * @Description : 대관신청현황에 관한 controller 클래스를 정의한다.
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

@Tag(name = "2. 05. 마이페이지 - 04) 대관신청현황",
     description = """
             회원이 신청한 대관신청현황 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/mypg")
public class MypageRentalController {

    @Operation(summary="대관신청 목록 조회", description="대관신청 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rental-list/{id}")
    public String selectMypageRentalList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageRentalList";
    }

    @Operation(summary="대관신청 정보 조회", description="대관신청 정보를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rental/{id}")
    public String selectMypageRental(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageRental";
    }

    @Operation(summary="대관신청 정보 등록", description="대관신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/rental")
    public String insertMypageRental(
            @PathVariable("instt") final String instt
            ) {
        return "insertMypageRental";
    }

    @Operation(summary="대관신청 정보 수정", description="대관신청 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rental/{id}")
    public String updateMypageRental(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageRental";
    }

    @Operation(summary="대관신청 취소", description="대관신청을 취소한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rental-cancel/{id}")
    public String updateMypageRentalCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageRentalCancel";
    }
}
