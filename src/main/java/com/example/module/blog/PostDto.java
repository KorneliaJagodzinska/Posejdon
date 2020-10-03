package com.example.module.blog;

public class PostDto {
    private String iiid;
    private String title;
    private String text;

    public PostDto(String iiid, String title, String text) {
        this.iiid = iiid;
        this.title = title;
        this.text = text;
    }

    public PostDto(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getIiid() {
        return iiid;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
