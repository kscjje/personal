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
 * @ClassName : EaiTicketSetleContoller.java
 * @Description : 일일입장권 결제설정에 관한 controller 클래스를 정의한다.
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

@Tag(name = "일일입장권 결제설정", description = "운영설정관리 - 연계시스템설정 - 일일입장권 결제설정")
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class EaiTicketSetleContoller {

    @Operation(summary="일일입장권 결제설정 목록 조회", description="일일입장권 결제설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/tckstls")
    public String selectEaiTicketSetleList(
            @PathVariable("instt") final String instt
            ) {
        return "selectEaiTicketSetleList";
    }

    @Operation(summary="일일입장권 결제설정 정보 조회", description="일일입장권 결제설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/tckstl/{id}")
    public String selectEaiTicketSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectEaiTicketSetle";
    }

    @Operation(summary="일일입장권 결제설정 정보 등록", description="일일입장권 결제설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/tckstl")
    public String insertEaiTicketSetle(
            @PathVariable("instt") final String instt
            ) {
        return "insertEaiTicketSetle";
    }

    @Operation(summary="일일입장권 결제설정 정보 수정", description="일일입장권 결제설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/tckstl/{id}")
    public String updateEaiTicketSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateEaiTicketSetle";
    }

    @Operation(summary="일일입장권 결제설정 정보 삭제", description="일일입장권 결제설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/tckstl/{id}")
    public String deleteEaiTicketSetle(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteEaiTicketSetle";
    }
}
