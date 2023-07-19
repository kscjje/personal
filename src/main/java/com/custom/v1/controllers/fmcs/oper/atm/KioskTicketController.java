package com.custom.v1.controllers.fmcs.oper.atm;

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
 * @ClassName : KioskTicketcontrollers.java
 * @Description : 입장권 판매상품 운영설정에 관한 controller 클래스를 정의한다.
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

@Tag(
     name = "무인키오스크운영설정관리 - 입장권 판매상품 운영설정",
     description = "운영 설정관리 - 자동화시스템 운영 설정 - 입장권 판매상품 운영설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper/kiosk")
public class KioskTicketController {

    @Operation(summary="입장권 판매상품 운영설정 목록 조회", description="입장권 판매상품 운영설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ticket-setup")
    public String selectKioskTicketList(
            @PathVariable("instt") final String instt
            ) {
        return "selectKioskTicketList";
    }

    @Operation(summary="입장권 판매상품 운영설정 정보 조회", description="입장권 판매상품 운영설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/ticket-setup/{id}")
    public String selectKioskTicket(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectKioskTicket";
    }

    @Operation(summary="입장권 판매상품 운영설정 정보 등록", description="입장권 판매상품 운영설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/ticket-setup")
    public String insertKioskTicket(
            @PathVariable("instt") final String instt
            ) {
        return "insertKioskTicket";
    }

    @Operation(summary="입장권 판매상품 운영설정 정보 수정", description="입장권 판매상품 운영설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/ticket-setup/{id}")
    public String updateKioskTicket(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateKioskTicket";
    }

    @Operation(summary="입장권 판매상품 운영설정 정보 삭제", description="입장권 판매상품 운영설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/ticket-setup/{id}")
    public String deleteKioskTicket(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteKioskTicket";
    }
}
