package ru.netology.domain;

public class SourcePost {
    private int id;
    private String link;
    private String name;
    private String type;
    private boolean canLike;

    public int getId () {
        return id;
    }
    public void setId () {
        this.id = id;
    }
    public  String getLink () {
        return link;
    }
    public void setLink () {
        this.link = link;
    }
    public String getName () {
        return name;
    }
    public void setName () {
        this.name = name;
    }
    public  String getType () {
        return type;
    }
    public void setType() {
        this.type = type;
    }
    public void getCanLike () {
        this.canLike = canLike;
    }
}
