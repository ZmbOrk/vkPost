package ru.netology.domain;

import java.util.Date;

public class CommentsOnPost {
    private int idComment;
    private int idOwner;
    private String nameOwner;
    private String iconOwnerUrl;
    private Date dateComment;
    private String textComment;
    private int countComment;

    public int getIdComment() {
        return idComment;
    }
    public void setIdComment () {
        this.idComment = idComment;
    }
    public int getIdOwner() {
        return idOwner;
    }
    public void setIdOwner (){
        this.idOwner = idOwner;
    }
    public String getNameOwner() {
        return nameOwner;
    }
    public void setNameOwner () {
        this.nameOwner = nameOwner;
    }
    public String getIconOwnerUrl() {
        return iconOwnerUrl;
    }
    public void setIconOwnerUrl(String iconOwnerUrl) {
        this.iconOwnerUrl = iconOwnerUrl;
    }
    public Date getDateComment() {
        return dateComment;
    }
    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }
    public String getTextComment() {
        return textComment;
    }
    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
    public int getCountComment() {
        return countComment;
    }
    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }
}
