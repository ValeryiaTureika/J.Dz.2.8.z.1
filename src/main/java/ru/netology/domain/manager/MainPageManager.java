package ru.netology.domain.manager;

import ru.netology.domain.Comment;
import ru.netology.domain.CommunityRecord;
import ru.netology.domain.Like;
import ru.netology.domain.Repost;
import ru.netology.domain.UserActionRecord;
import ru.netology.domain.ViewingRecord;
import ru.netology.domain.Geo;
import ru.netology.domain.PostSource;

public class MainPageManager {

    private CommentManager commentManager;

    /**
     * Main Page generation
     */
    public Integer generatingComment() {
        Comment[] comments = commentManager.getGeneratingComment();
        // TODO: add logic
        for (Comment comment : comments) {
            Integer number = comment.getNumberComment();
        }
        return null;
    }

    private CommunityRecordManager communityRecordManager;

    /**
     * Main Page generation
     */
    public String generate() {
        CommunityRecord[] communityRecords = communityRecordManager.getPostGeneration();
        // TODO: add logic
        for (CommunityRecord communityRecord : communityRecords) {
            String text = communityRecord.getText();
        }
        return null;
    }

    private LikeManager likeManager;

    /**
     * Main Page generation
     */
    public Integer likeGeneration() {
        Like[] likes = likeManager.getLikeGeneration();
        // TODO: add logic
        for (Like like : likes) {
            Integer likeText = like.getNumberLikedRecord();
        }
        return null;
    }

    private RepostManager repostManager;

    /**
     * Main Page generation
     */
    public Integer repostGeneration() {
        Repost[] reposts = repostManager.getGenerationRepost();
        // TODO: add logic
        for (Repost repost : reposts) {
            Integer repostText = repost.getNumberRepostRecord();
        }
        return null;
    }

    private UserActionRecordManager userActionRecordManager;

    /**
     * Main Page generation
     */
    public Boolean personalSettings() {
        UserActionRecord[] userActionRecords = userActionRecordManager.getPersonalSettings();
        // TODO: add logic
        for (UserActionRecord userActionRecord : userActionRecords) {
            Boolean settings = userActionRecord.isCurrentUserNotInterestingRecord();
        }
        return null;
    }

    private ViewingRecordManager viewingRecordManager;

    /**
     * Main Page generation
     */
    public Integer viewRecord() {
        ViewingRecord[] viewingRecords = viewingRecordManager.getView();
        // TODO: add logic
        for (ViewingRecord viewingRecord : viewingRecords) {
            Integer number = viewingRecord.getNumberViewingRecord();
        }
        return null;
    }

    private GeoManager geoManager;

    /**
     * Main Page generation
     */
    public String geo() {
        Geo[] geos = geoManager.getGeo();
        // TODO: add logic
        for (Geo geo : geos) {
            String geoGeneration = geo.getType();
        }
        return null;
    }
}

