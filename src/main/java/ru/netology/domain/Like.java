package ru.netology.domain;

public class Like {
    private int numberLikedRecord;
    private boolean currentUserLike;
    private int canCurrentUserLike;
    private boolean canPublish;

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

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean on) {
        this.canPublish = on;
    }
}
