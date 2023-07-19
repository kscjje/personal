package com.custom.v1.controllers.fmcs.lctr;

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
 * @ClassName : Instructorcontrollers.java
 * @Description : 강사관리에 관한 controller 클래스를 정의한다.
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
     name = "강사관리",
     description = "강좌관리 - 강사관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lctr")
public class InstructorController {

    @Operation(summary="강사 정보 목록 조회", description="강사 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/instrctr")
    public String selectInstructorList(
            @PathVariable("instt") final String instt
            ) {
        return "selectInstructorList";
    }

    @Operation(summary="강사 정보 조회", description="강사 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/instrctr/{id}")
    public String selectInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectInstructor";
    }

    @Operation(summary="강사 정보 등록", description="강사 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/instrctr")
    public String insertInstructor(
            @PathVariable("instt") final String instt
            ) {
        return "insertInstructor";
    }

    @Operation(summary="강사 정보 수정", description="강사 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/instrctr/{id}")
    public String updateInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateInstructor";
    }

    @Operation(summary="강사 정보 삭제", description="강사 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/instrctr/{id}")
    public String deleteInstructor(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteInstructor";
    }

    @Operation(summary="강사 소속 정보 등록", description="강사 소속 시설 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/instr/facility")
    public String insertInstructorFacility(
            @PathVariable("instt") final String instt
            ) {
        return "insertInstructorFacility";
    }

    @Operation(summary="강사 소속 정보 수정", description="강사 소속 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/instr/facility/{id}")
    public String updateInstructorFacility(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateInstructorFacility";
    }

    @Operation(summary="강사 소속 정보 삭제", description="강사 소속 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/instr/facility/{id}")
    public String deleteInstructorFacility(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteInstructorFacility";
    }

    @Operation(summary="강사료기준 정보 등록", description="강사의 소속 시설 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/instr/fee")
    public String insertInstructorFee(
            @PathVariable("instt") final String instt
            ) {
        return "insertInstructorFee";
    }

    @Operation(summary="강사료기준 정보 수정", description="강사료기준 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/instr/fee/{id}")
    public String updateInstructorFee(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateInstructorFee";
    }

    @Operation(summary="강사료기준 정보 삭제", description="강사료기준 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/instr/fee/{id}")
    public String deleteInstructorFee(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteInstructorFee";
    }

    @Operation(summary="강사료 현황 정보 조회", description="강사료 현황 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/instr/fee-status")
    public String selectInstructorFeeStatus(
            @PathVariable("instt") final String instt
            ) {
        return "selectInstructorList";
    }

    @Operation(summary="강사료 현황 엑셀 다운로드", description="강사료 현황 정보를 엑셀 파일로 다운로드 한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/instr/fee-status-excel")
    public String selectInstructorFeeStatusExcel(
            @PathVariable("instt") final String instt
            ) {
        return "selectInstructorFeeStatusExcel";
    }
}
