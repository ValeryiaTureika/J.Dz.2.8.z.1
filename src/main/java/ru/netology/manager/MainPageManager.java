package ru.netology.manager;

import ru.netology.domain.Comment;
import ru.netology.domain.Post;
import ru.netology.domain.Like;
import ru.netology.domain.Repost;
import ru.netology.domain.UserActionRecord;
import ru.netology.domain.ViewingRecord;
import ru.netology.domain.Geo;

public class MainPageManager {

    private Manager manager;

    /**
     * Main Page generation
     */

    public Integer generatingComment() {
        Comment[] comments = manager.getGeneratingComment();
        // TODO: add logic
        for (Comment comment : comments) {
            Integer number = comment.getNumberComment();
        }
        return 0;
    }

    public String postGenerate() {
        Post[] posts = manager.getPostGeneration();
        // TODO: add logic
        for (Post post : posts) {
            String text = post.getText();
        }
        return null;
    }

    public Integer likeGeneration() {
        Like[] likes = manager.getLikeGeneration();
        // TODO: add logic
        for (Like like : likes) {
            Integer likeText = like.getNumberLikedRecord();
        }
        return 0;
    }

    public Integer repostGeneration() {
        Repost[] reposts = manager.getGenerationRepost();
        // TODO: add logic
        for (Repost repost : reposts) {
            Integer repostText = repost.getNumberRepostRecord();
        }
        return 0;
    }

    public Boolean personalSettings() {
        UserActionRecord[] userActionRecords = manager.getPersonalSettings();
        // TODO: add logic
        for (UserActionRecord userActionRecord : userActionRecords) {
            Boolean settings = userActionRecord.isCurrentUserNotInterestingRecord();
        }
        return false;
    }

    public Integer viewRecord() {
        ViewingRecord[] viewingRecords = manager.getView();
        // TODO: add logic
        for (ViewingRecord viewingRecord : viewingRecords) {
            Integer number = viewingRecord.getNumberViewingRecord();
        }
        return 0;
    }

    public String geo() {
        Geo[] geos = manager.getGeo();
        // TODO: add logic
        for (Geo geo : geos) {
            String geoGeneration = geo.getType();
        }
        return null;
    }
}

