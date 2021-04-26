package ru.netology.domain;

import java.util.Date;

public class Newpost {
    private String textPost; // текст в посте
    private String AttachmentPost; // вложение (видео, документ, картинка и т.д.)
    private String linkPost; // ссылка

    public String getTextPost() {
        return textPost;
    }

    public String getLinkPost() {
        return linkPost;
    }

    public String GetAttachemntPost() {
        return AttachmentPost;
    }



}

