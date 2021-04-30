package ru.netology.domain;

public class LikesPost {
    private int count;
    private int userLikes;

    public int getCount () {
        return count;
    }

    public void setCount(){
        this.count = count;
    }

    public int getUserLikes () {
        return userLikes;
    }
    public void setUserLikes () {
        this.userLikes = userLikes;
    }
}
