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
 * @ClassName : LockerChargecontrollers.java
 * @Description : 사물함 요금설에 관한 controller 클래스를 정의한다.
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
     name = "사물함 요금설정",
     description = "사물함관리 - 사물함정보관리 - 요금설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/lckr")
public class LockerChargeController {

    @Operation(summary="사물함 요금설정 조회", description="사물함 요금설정 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/charge/{id}")
    public String selectLockerCharge(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectLockerCharge";
    }

    @Operation(summary="사물함 요금설정 정보 등록", description="사물함 요금설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/charge")
    public String insertLockerCharge(
            @PathVariable("instt") final String instt
            ) {
        return "insertLockerCharge";
    }

    @Operation(summary="사물함 정보 수정", description="사물함 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/charge/{id}")
    public String updateLockerCharge(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateLockerCharge";
    }

    @Operation(summary="사물함 정보 삭제", description="사물함 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/charge/{id}")
    public String deleteLockerCharge(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteTeam";
    }
}
