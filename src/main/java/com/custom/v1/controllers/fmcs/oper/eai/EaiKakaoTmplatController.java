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
 * @ClassName : EaiKakaoTmplatcontrollers.java
 * @Description : 카카오 템플릿 관리에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-10-20
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-10-20    김영철          최초 생성
 *
 * </pre>
 */

@Tag(
     name = "카카오 템플릿 관리",
     description = """
             시스템관리 : 제품 서비스 설정 - 연계시스템 설정 - 알림 템플릿 관리 - 카카오 템플릿 관리 \n
             FMCS 서비스 : 운영 설정관리 - 연계시스템 설정 - 알림 템플릿 관리 - 카카오 템플릿 관리
             """
    )
@RestController
@RequestMapping("/api/v1/fmcs/{instt}/oper/eaikko")
public class EaiKakaoTmplatController {

    @Operation(summary="카카오 템플릿 목록 조회", description="카카오 템플릿 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/kkotmp")
    public String selectEaiKakaoTmplatList(
            @PathVariable("instt") final String instt
            ) {
        return "selectEaiKakaoTmplatList";
    }

    @Operation(summary="카카오 템플릿 정보 조회", description="카카오 템플릿 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/kkotmp/{id}")
    public String selectEaiKakaoTmplat(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectEaiKakaoTmplat";
    }

    @Operation(summary="카카오 템플릿 정보 등록", description="카카오 템플릿 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/kkotmp")
    public String insertEaiKakaoTmplat(
            @PathVariable("instt") final String instt
            ) {
        return "insertEaiKakaoTmplat";
    }

    @Operation(summary="카카오 템플릿 정보 수정", description="카카오 템플릿 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/kkotmp/{id}")
    public String updateEaiKakaoTmplat(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateEaiKakaoTmplat";
    }

    @Operation(summary="카카오 템플릿 정보 삭제", description="카카오 템플릿 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/kkotmp/{id}")
    public String deleteEaiKakaoTmplat(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteEaiKakaoTmplat";
    }

    @Operation(summary="카카오 템플릿 검수 요청", description="카카오에 템플릿에 대한 검수를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/acptnc/{id}")
    public String requstEaiKakaoAcptnc(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoAcptnc";
    }

    @Operation(summary="카카오 템플릿 검수 요청 취소", description="카카오에 검수 요청한 템플릿에 대한 취소를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/acptnc/{id}")
    public String requstEaiKakaoAcptncCancl(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoAcptncCancl";
    }

    @Operation(summary="카카오 템플릿 사용 중지 요청", description="카카오에 사용 중인 템플릿에 대한 사용 중지를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/usestop/{id}")
    public String requstEaiKakaoUseStop(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoUseStop";
    }

    @Operation(summary="카카오 템플릿 사용 중지 해제 요청", description="카카오에 사용 중지된 템플릿에 대한 사용 중지 해제를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/usestop/{id}")
    public String requstEaiKakaoUseStopRelis(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoUseStopRelis";
    }

    @Operation(summary="카카오 템플릿 승인 취소 요청", description="카카오에 승인된 템플릿에 대한 취소를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/cnfc/{id}")
    public String requstEaiKakaoConfmCancl(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoConfmCancl";
    }

    @Operation(summary="카카오 템플릿 휴면 해제 요청", description="카카오에 휴면 상태의 템플릿에 대한 휴면 해제를 요청한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/drmncy/{id}")
    public String requstEaiKakaoDrmncyRelis(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "requstEaiKakaoDrmncyRelis";
    }
}
