package com.ovo.exam.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Paging {

    private int rowsCount;// 符合条件的条目总数
    private int rows = 4;// 每页显示的条目数
    private int pagesCount;// 总页数
    private int page;// 当前页码
    private int rowStart;// 某页开始条数
    private int rowEnd;// 某页结束条数
    private Search search;

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPagesCount() {
        if (getRowsCount() % getRows() == 0) {
            pagesCount = getRowsCount() / getRows();
        } else {
            pagesCount = getRowsCount() / getRows() + 1;
        }
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRowStart() {
        rowStart = (getPage() - 1) * getRows();
        return rowStart;
    }

    public void setRowStart(int rowStart) {
        this.rowStart = rowStart;
    }

    public int getRowEnd() {
        rowEnd = getPage() * getRows();
        return rowEnd;
    }

    public void setRowEnd(int rowEnd) {
        this.rowEnd = rowEnd;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Paging [rowsCount=" + rowsCount + ", rows=" + rows + ", pagesCount=" + pagesCount + ", page=" + page
                + ", rowStart=" + rowStart + ", rowEnd=" + rowEnd + ", search=" + search + "]";
    }

}
