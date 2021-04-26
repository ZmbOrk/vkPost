package ru.netology.domain;

import java.util.Date;

public class InfoPost {
    private int idInfo; //информация о размещающем (от лица человека или сообщества)
    private String namePublisher; // имя публикующего
    private String datePost; // дата пота

    public String getNamePublisher () {
        return namePublisher;
    }

    public String getDatePost () {
        return datePost;
    }

    public int getIdInfo () {
        return idInfo;
    }
}
