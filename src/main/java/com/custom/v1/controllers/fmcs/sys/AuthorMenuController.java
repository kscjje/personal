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
 * @ClassName : AuthorMenucontrollers.java
 * @Description : 권한메뉴설정에 관한 controller 클래스를 정의한다.
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
     name = "권한메뉴설정",
     description = "시스템관리 - 권한그룹관리 - 권한메뉴설정"
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/sys/auth")
public class AuthorMenuController {

    @Operation(summary="권한메뉴설정 목록 조회", description="권한메뉴설정 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/menu")
    public String selectAuthorMenuList(
            @PathVariable("instt") final String instt
            ) {
        return "selectAuthorMenuList";
    }

    @Operation(summary="권한메뉴설정 정보 조회", description="권한메뉴설정 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/menu/{id}")
    public String selectAuthorMenu(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectAuthorMenu";
    }

    @Operation(summary="권한메뉴설정 정보 등록", description="권한메뉴설정 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/menu")
    public String insertAuthorMenu(
            @PathVariable("instt") final String instt
            ) {
        return "insertAuthorMenu";
    }

    @Operation(summary="권한메뉴설정 정보 수정", description="권한메뉴설정 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/menu/{id}")
    public String updateAuthorMenu(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateAuthorMenu";
    }

    @Operation(summary="권한메뉴설정 정보 삭제", description="권한메뉴설정 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/menu/{id}")
    public String deleteAuthorMenu(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteAuthorMenu";
    }
}
