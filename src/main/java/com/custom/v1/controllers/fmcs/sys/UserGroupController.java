package com.custom.v1.controllers.fmcs.sys;

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
 * @ClassName : UserGroupcontrollers.java
 * @Description : 사용자그룹관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-02
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-02    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "사용자그룹관리",
     description = "시스템관리 - 사용자관리 - 사용자그룹관리"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/sys/user")
public class UserGroupController {

    @Operation(summary="사용자그룹관리 목록 조회", description="사용자그룹관리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/group")
    public String selectUserGroupList(
            @PathVariable("instt") final String instt
            ) {
        return "selectUserGroupList";
    }

    @Operation(summary="사용자그룹관리 정보 조회", description="사용자그룹관리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/group/{id}")
    public String selectUserGroup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectUserGroup";
    }

    @Operation(summary="사용자그룹관리 정보 등록", description="사용자그룹관리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/group")
    public String insertUserGroup(
            @PathVariable("instt") final String instt
            ) {
        return "insertUserGroup";
    }

    @Operation(summary="사용자그룹관리 정보 수정", description="사용자그룹관리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/group/{id}")
    public String updateUserGroup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateUserGroup";
    }

    @Operation(summary="사용자그룹관리 정보 삭제", description="사용자그룹관리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/group/{id}")
    public String deleteUserGroup(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteUserGroup";
    }
}
