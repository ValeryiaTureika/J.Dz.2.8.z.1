package ru.netology.domain;

public class Like {
    private int numberLikedRecord;
    private boolean currentUserLike;
    private int canCurrentUserLike;
    private int canPublish;

    public boolean isCurrentUserLike() {
        return currentUserLike;
    }

    public void setCurrentUserLike(boolean on) {
        this.currentUserLike = on;
    }

    public int getNumberLikedRecord() {
        return numberLikedRecord;
    }

    public void setNumberLikedRecord(int numberLikedRecord) {
        this.numberLikedRecord = numberLikedRecord;
    }

    public int getCanCurrentUserLike() {
        return canCurrentUserLike;
    }

    public void setCanCurrentUserLike(int canCurrentUserLike) {
        this.canCurrentUserLike = canCurrentUserLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
