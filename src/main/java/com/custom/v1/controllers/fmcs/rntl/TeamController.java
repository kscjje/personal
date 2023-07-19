package com.custom.v1.controllers.fmcs.rntl;

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
 * @ClassName : Teamcontrollers.java
 * @Description : 대관예약팀관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-07
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-07    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "대관예약팀관리",
     description = "대관관리 - 대관예약팀관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/rntl")
public class TeamController {

    @Operation(summary="대관예약팀관리 정보 목록 조회", description="대관예약팀관리 정보 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/team")
    public String selectTeamList(
            @PathVariable("instt") final String instt
            ) {
        return "selectTeamList";
    }

    @Operation(summary="대관예약팀관리 정보 조회", description="대관예약팀관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/team/{id}")
    public String selectTeam(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectTeam";
    }

    @Operation(summary="대관예약팀관리 정보 등록", description="대관예약팀관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/team")
    public String insertTeam(
            @PathVariable("instt") final String instt
            ) {
        return "insertTeam";
    }

    @Operation(summary="대관예약팀관리 정보 수정", description="대관예약팀관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/team/{id}")
    public String updateTeam(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateTeam";
    }

    @Operation(summary="대관예약팀관리 정보 삭제", description="대관예약팀관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/team/{id}")
    public String deleteTeam(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteTeam";
    }
}
