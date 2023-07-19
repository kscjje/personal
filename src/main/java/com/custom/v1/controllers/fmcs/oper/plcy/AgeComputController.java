package com.custom.v1.controllers.fmcs.oper.plcy;

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
 * @ClassName : AgeComputcontrollers.java
 * @Description : 연령산출기준설정에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-01
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-01    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "연령산출기준설정",
     description = "운영 설정관리 - 업무운영정책기준설정 - 연령산출기준설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class AgeComputController {

    @Operation(summary="연령산출기준설정 목록 조회", description="연령산출기준설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/age-comput")
    public String selectAgeComputList(
            @PathVariable("instt") final String instt
            ) {
        return "selectAgeComputList";
    }

    @Operation(summary="연령산출기준설정 정보 조회", description="연령산출기준설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/age-comput/{id}")
    public String selectAgeComput(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectAgeComput";
    }

    @Operation(summary="연령산출기준설정 정보 등록", description="연령산출기준설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/age-comput")
    public String insertAgeComput(
            @PathVariable("instt") final String instt
            ) {
        return "insertAgeComput";
    }

    @Operation(summary="연령산출기준설정 정보 수정", description="연령산출기준설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/age-comput/{id}")
    public String updateAgeComput(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateAgeComput";
    }

    @Operation(summary="연령산출기준설정 정보 삭제", description="연령산출기준설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/age-comput/{id}")
    public String deleteAgeComput(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteAgeComput";
    }
}
