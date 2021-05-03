package ru.netology.domain;

import java.util.Date;

public class CommentsOnPost {

    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private Date dateComment;
    private int likesComment;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public int getLikesComment() {
        return likesComment;
    }

    public void setLikesComment(int likesComment) {
        this.likesComment = likesComment;
    }
}
