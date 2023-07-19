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
 * @Description : 사물함임대관리에 관한 controller 클래스를 정의한다.
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
     name = "사물함임대관리",
     description = "사물함관리 - 사물함임대관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lckr")
public class LockerRentalController {

    @Operation(summary="사물함임대관리 정보 목록 조회", description="사물함임대관리 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rental")
    public String selectLockerRentalList(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerRentalList";
    }

    @Operation(summary="사물함임대관리 정보 조회", description="사물함임대관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/rental/{id}")
    public String selectLockerRental(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLockerRental";
    }

    @Operation(summary="사물함임대관리 정보 등록", description="사물함임대관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/rental")
    public String insertLockerRental(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRental";
    }

    @Operation(summary="사물함임대관리 정보 수정", description="사물함임대관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/rental/{id}")
    public String updateLockerRental(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerRental";
    }

    @Operation(summary="사물함임대관리 정보 삭제", description="사물함임대관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/rental/{id}")
    public String deleteLockerRental(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteLockerRental";
    }

    @Operation(summary="사물함임대 변경 정보 등록", description="사물함임대 변경 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/rental-change")
    public String insertLockerRentalChange(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRentalChange";
    }

    @Operation(summary="사물함임대 반납 정보 등록", description="사물함임대 반납 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/rental-return")
    public String insertLockerRentalReturn(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRentalReturn";
    }

    @Operation(summary="사물함임대 강제회수 정보 등록", description="사물함임대 강제회수 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/rental-retrieval")
    public String insertLockerRentalRetrieval(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerRentalRetrieval";
    }

    @Operation(summary="사물함임대 재임대 정보 등록", description="사물함임대 재임대 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/re-rental")
    public String insertLockerReRental(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerReRental";
    }

    @Operation(summary="사물함임대현황 정보 조회", description="사물함임대현황 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/status")
    public String selectLockerRentalStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerRentalStatus";
    }

    @Operation(summary="사물함임대현황 엑셀 다운로드", description="사물함임대현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/status-excel")
    public String selectLockerRentalStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerRentalStatusExcel";
    }

    @Operation(summary="사물함보증금현황 정보 조회", description="사물함보증금현황 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/guaranty")
    public String selectLockerRentalGuaranty(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerRentalGuaranty";
    }

    @Operation(summary="사물함보증금현황 엑셀 다운로드", description="사물함보증금현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/guaranty-excel")
    public String selectLockerRentalGuarantyExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectLockerRentalGuarantyExcel";
    }
}
