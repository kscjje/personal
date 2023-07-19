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
 * @ClassName : CmgControlcontrollers.java
 * @Description : 출입문운영설정관리에 관한 controller 클래스를 정의한다.
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
     name = "출입문운영설정관리",
     description = "운영 설정관리 - 자동화시스템 운영 설정 - 출입문운영설정관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper")
public class CmgControlController {

    @Operation(summary="출입문운영설정관리 목록 조회", description="출입문운영설정관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/cmgctrls")
    public String selectCmgControlList(
            @PathVariable("instt") final String instt
            ) {
        return "selectCmgControlList";
    }

    @Operation(summary="출입문운영설정관리 정보 조회", description="출입문운영설정관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/cmgctrl/{id}")
    public String selectCmgControl(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectCmgControl";
    }

    @Operation(summary="출입문운영설정관리 정보 등록", description="출입문운영설정관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/cmgctrl")
    public String insertCmgControl(
            @PathVariable("instt") final String instt
            ) {
        return "insertCmgControl";
    }

    @Operation(summary="출입문운영설정관리 정보 수정", description="출입문운영설정관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/cmgctrl/{id}")
    public String updateCmgControl(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateCmgControl";
    }

    @Operation(summary="출입문운영설정관리 정보 삭제", description="출입문운영설정관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/cmgctrl/{id}")
    public String deleteCmgControl(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteCmgControl";
    }
}