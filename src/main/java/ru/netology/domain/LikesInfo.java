package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;
    private boolean canLike;
    private boolean canPublish;

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public int getCount() {
        return count;
    }
}
