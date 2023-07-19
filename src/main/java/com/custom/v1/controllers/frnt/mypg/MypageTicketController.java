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
 * @ClassName : MypageTicketcontrollers.java
 * @Description : 일일매표현황에 관한 controller 클래스를 정의한다.
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

@Tag(name = "2. 05. 마이페이지 - 03) 일일매표현황",
     description = """
             회원이 예약(구매)한 일일 입장권 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/mypg")
public class MypageTicketController {

    @Operation(summary="일일매표 목록 조회", description="일일매표 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ticket-list/{id}")
    public String selectMypageTicketList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageTicketList";
    }

    @Operation(summary="일일매표 정보 조회", description="일일매표 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ticket/{id}")
    public String selectMypageTicket(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectMypageTicket";
    }

    @Operation(summary="일일매표 정보 등록", description="일일매표 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ticket")
    public String insertMypageTicket(
            @PathVariable("instt") final String instt
            ) {
        return "insertMypageTicket";
    }

    @Operation(summary="일일매표 정보 수정", description="일일매표 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ticket/{id}")
    public String updateMypageTicket(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageTicket";
    }

    @Operation(summary="일일매표 취소", description="일일매표 취소한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ticket-cancel/{id}")
    public String updateMypageTicketCancel(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateMypageTicketCancel";
    }
}
