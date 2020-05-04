package com.myapplicationdev.android.tw_listview;

public class Modules {

    private String year;
    private String code;
    private String img;

    public Modules(String year, String code, String img) {
        this.year = year;
        this.code = code;
        this.img = img;
    }

    public String getYear() {
        return year;
    }

    public String getCode() {
        return code;
    }

    public String getImg() {
        return img;
    }

}
