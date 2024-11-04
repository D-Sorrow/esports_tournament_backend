package com.esports_tournament.app.domain.utils;

import java.util.List;

public class ResponsePage<T> {
    private int size;
    private int page;
    private String sort;
    private List<T> collention;

    public ResponsePage(List<T> collention, int page, int size, String sort) {
        this.collention = collention;
        this.page = page;
        this.size = size;
        this.sort = sort;
    }

    public List<T> getCollention() {
        return collention;
    }

    public void setCollention(List<T> collention) {
        this.collention = collention;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
