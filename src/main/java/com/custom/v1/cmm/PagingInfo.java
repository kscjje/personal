package com.custom.v1.cmm;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pagingInfo")
public class PagingInfo extends PaginationInfo {

    /** 페이징 처리 여부 */
    @Value("${Globals.page.paging}")
    private boolean paging;

    /** 페이지갯수 */
    @Value("${Globals.page.pageUnit}")
    private int pageUnit;

    /** 페이지사이즈 */
    @Value("${Globals.page.pageSize}")
    private int pageSize;

    public boolean isPaging() {
        return paging;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }

    public int getPageUnit() {
        return pageUnit;
    }

    public void setPageUnit(int pageUnit) {
        this.pageUnit = pageUnit;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PagingInfo [paging=" + paging + ", pageUnit=" + pageUnit + ", pageSize=" + pageSize + "], \n"
                + "PaginationInfo [ recordCountPerPage=" + getRecordCountPerPage() + ", currentPageNo=" + getCurrentPageNo()
                + ", totalRecordCount=" + getTotalRecordCount() + ", firstPageNo=" + getFirstPageNo()
                + "]";
    }

}
