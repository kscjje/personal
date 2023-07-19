package com.custom.v1.controllers.frnt.info;

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
 * @ClassName : CommunicationInfocontrollers.java
 * @Description : 정보마당에 관한 controller 클래스를 정의한다.
 *
 * @author : 김영철
 * @since  : 2022-11-14
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일          수정자         수정내용
 *  ----------    ----------    ----------------------------------------
 *  2022-11-14    김영철          최초 생성
 *
 * </pre>
 */

@Tag(name = "2. 04. 정보마당",
     description = """
             통합예약시스템 공지사항 등 게시판 정보 출력, 등록 등 관리를 한다. \n
              - 공지사항 조회 \n
              - 포토갤러리 조회 \n
              - 자주하는질문 조회 \n
              - 고객의소리 관리
             """
    )
@RestController
@RequestMapping("/api/v1/frnt/{instt}/info")
public class CommunicationInfoController {

    /****************************************************************************************************
    *
    * 공지사항
    *
    ****************************************************************************************************/

    @Operation(summary="공지사항 목록 조회", description="공지사항 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/notice")
    public String selectNoticeList(
            @PathVariable("instt") final String instt
            ) {
        return "selectNoticeList";
    }

    @Operation(summary="공지사항 정보 조회", description="공지사항 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/notice/{id}")
    public String selectNotice(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectNotice";
    }

    /****************************************************************************************************
    *
    * 포토갤러리
    *
    ****************************************************************************************************/

    @Operation(summary="포토갤러리 목록 조회", description="포토갤러리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/photo")
    public String selectPhotoList(
            @PathVariable("instt") final String instt
            ) {
        return "selectPhotoList";
    }

    @Operation(summary="포토갤러리 정보 조회", description="포토갤러리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/photo/{id}")
    public String selectPhoto(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectPhoto";
    }

    /****************************************************************************************************
    *
    * 자주하는질문
    *
    ****************************************************************************************************/

    @Operation(summary="자주하는질문 목록 조회", description="자주하는질문 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/faq")
    public String selectFaqList(
            @PathVariable("instt") final String instt
            ) {
        return "selectFaqList";
    }

    @Operation(summary="자주하는질문 정보 조회", description="자주하는질문 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/faq/{id}")
    public String selectFaq(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectFaq";
    }

    /****************************************************************************************************
    *
    * 고객의 소리(질의 응답)
    *
    ****************************************************************************************************/

    @Operation(summary="고객의소리 목록 조회", description="고객의소리 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/qna")
    public String selectQnaList(
            @PathVariable("instt") final String instt
            ) {
        return "selectQnaList";
    }

    @Operation(summary="고객의소리 정보 조회", description="고객의소리 정보 한건을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @GetMapping(value = "/qna/{id}")
    public String selectQna(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "selectQna";
    }

    @Operation(summary="고객의소리 정보 등록", description="고객의소리 정보를 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PostMapping(value = "/qna")
    public String insertQna(
            @PathVariable("instt") final String instt
            ) {
        return "insertQna";
    }

    @Operation(summary="고객의소리 정보 수정", description="고객의소리 정보를 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @PutMapping(value = "/qna/{id}")
    public String updateQna(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "updateQna";
    }

    @Operation(summary="고객의소리 정보 삭제", description="고객의소리 정보를 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "400", description = "실패"),
            @ApiResponse(responseCode = "404", description = "실패2")
    })
    @DeleteMapping(value = "/qna/{id}")
    public String deleteQna(
            @PathVariable("instt") final String instt,
            @PathVariable("id") final String id
            ) {
        return "deleteQna";
    }
}
