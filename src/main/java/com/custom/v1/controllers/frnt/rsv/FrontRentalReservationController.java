package com.custom.v1.controllers.frnt.rsv;

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
 * @ClassName : FrontRentalReservationcontrollers.java
 * @Description : 대관신청에 관한 controller 클래스를 정의한다.
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

@Tag(name = "2. 02.통합예약 - 03) 대관신청",
     description = """
             시설별 대관신청 정보를 관리한다.
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/rntl")
public class FrontRentalReservationController {

    @Operation(summary="대관신청 목록 조회", description="대관신청 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/reserve-list/{id}")
    public String selectRentalReservationList(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectRentalReservationList";
    }

    @Operation(summary="대관신청 정보 조회", description="대관신청 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/reserve/{id}")
    public String selectRentalReservation(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectRentalReservation";
    }

    @Operation(summary="대관신청 정보 등록", description="대관신청 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/reserve")
    public String insertRentalReservation(
            @PathVariable("instt") final String instt
            ) {
        return "insertRentalReservation";
    }

    @Operation(summary="대관신청 정보 수정", description="대관신청 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/reserve/{id}")
    public String updateRentalReservation(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateRentalReservation";
    }

    @Operation(summary="대관신청 정보 삭제", description="대관신청 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/reserve/{id}")
    public String deleteRentalReservation(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteRentalReservation";
    }
}
