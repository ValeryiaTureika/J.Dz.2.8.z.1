package ru.netology.manager;

import ru.netology.domain.Comment;
import ru.netology.domain.Post;
import ru.netology.domain.Like;
import ru.netology.domain.Repost;
import ru.netology.domain.UserActionRecord;
import ru.netology.domain.ViewingRecord;
import ru.netology.domain.Geo;
import ru.netology.domain.PostSource;

public class Manager {

    private Comment[] comments;
    private Geo[] geo;
    private Like[] likes;
    private Post[] posts;
    private Repost[] reposts;
    private UserActionRecord[] actions;
    private ViewingRecord[] viewingRecords;

    public Comment[] getGeneratingComment() {
        // TODO: add logic
        return null;
    }

    public Geo[] getGeo() {
        // TODO: add logic
        return null;
    }

    public Like[] getLikeGeneration() {
        // TODO: add logic
        return null;
    }

    public Post[] getPostGeneration() {
        // TODO: add logic
        return null;
    }

    public Repost[] getGenerationRepost() {
        // TODO: add logic
        return null;
    }

    public UserActionRecord[] getPersonalSettings() {
        // TODO: add logic
        return null;
    }

    public ViewingRecord[] getView() {
        // TODO: add logic
        return null;
    }
}
