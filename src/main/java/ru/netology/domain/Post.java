package ru.netology.domain;

public class Post {
    private int idPost; //id публикации
    private int idOwner; //id автора записи (от чьего имени опубликована запись)
    private int createdBy;// id администратора, который опубликовал запись (для сообществ)
    private String nameOwner; //имя автора/сообщества
    private String iconOwnerUrl; //аватар автора/сообщества
    private String textPost; //текст публикации, включая заголовок
    private int replyOwnerId; //id владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // id идентификатор записи, в ответ на которую была оставлена текущая
    private String imagePostUrl; //изображение, gif, видео используемые в публикации
    private String linkPage; //ссылка для перехода
    private String postType; //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private int signerId; //id автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int postponedId; //id отложенной записи
    private String copyright;//источник материала

    private boolean friendsOnly; //если запись была создана с опцией «Только для друзей»
    private boolean canComment; //разрешены ли комментарии
    private boolean canDelete; //разрешено удаление
    private boolean canEdit; //разрешено редактирование
    private boolean canComplain; //разрешено "Пожаловаться" на содержание
    private boolean canBookmarkPost; //разрешено добавление в закладки
    private boolean isFavorite; //объект добавлен в закладки у текущего пользователя
    private boolean canPostPin; //разрешено закрепление публикации
    private boolean isPostPin; // закрепелена запись
    private boolean canPostUnpin; //разрешено открепление публикации
    private boolean markedAsAds; //информация о том, содержит ли запись отметку "реклама"

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getIconOwnerUrl() {
        return iconOwnerUrl;
    }

    public void setIconOwnerUrl(String iconOwnerUrl) {
        this.iconOwnerUrl = iconOwnerUrl;
    }


    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getImagePostUrl() {
        return imagePostUrl;
    }

    public void setImagePostUrl(String imagePostUrl) {
        this.imagePostUrl = imagePostUrl;
    }

    public String getLinkPage() {
        return linkPage;
    }

    public void setLinkPage(String linkPage) {
        this.linkPage = linkPage;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanComplain() {
        return canComplain;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public boolean isCanBookmarkPost() {
        return canBookmarkPost;
    }

    public void setCanBookmarkPost(boolean canBookmarkPost) {
        this.canBookmarkPost = canBookmarkPost;
    }

    public boolean isCanPostPin() {
        return canPostPin;
    }

    public void setCanPostPin(boolean canPostPin) {
        this.canPostPin = canPostPin;
    }

    public boolean isCanPostUnpin() {
        return canPostUnpin;
    }

    public void setCanPostUnpin(boolean canPostUnpin) {
        this.canPostUnpin = canPostUnpin;
    }


    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isPostPin() {
        return isPostPin;
    }

    public void setPostPin(boolean postPin) {
        isPostPin = postPin;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

}
