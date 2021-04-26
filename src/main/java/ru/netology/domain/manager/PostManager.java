package ru.netology.domain.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPostsToArray() {
        //связанный метод, возвращает массив объектов записей на стене
        return null;
    }

    public Post[] search(int IdOwner, String domain, String query, int ownersOnly, int count, int offset) {
        //метод поиска
        return null;
    }

    public void delete(int idPost, int idOwner) {
        //метод удаления
    }
}
