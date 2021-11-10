package com.albin.demowebsite.model;

public class Detail {

    public int detailId;
    public String detailName;

    public Detail(int detailId, String detailName) {
        this.detailId = detailId;
        this.detailName = detailName;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }


}
