package ru.netology.domain;

public class Like {
    private int numberLikedRecord;
    public boolean currentUserLike;

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
}
