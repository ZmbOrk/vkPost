package ru.netology.domain;

public class StatisticPost {

    private int countView; // количество просмотревших пост
    private int countLikePost; // количество лайкнувших пост
    private int countGetPost; // количество поделившихся постом

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    public int getCountLikePost () {
        return countLikePost;
    }

    public void setCountLikePost () {
        this.countLikePost = countLikePost;
    }
    public int getCountGetPost () {
        return countGetPost;
    }

    public void setCountGetPost() {
        this.countGetPost = countGetPost;
    }

}
