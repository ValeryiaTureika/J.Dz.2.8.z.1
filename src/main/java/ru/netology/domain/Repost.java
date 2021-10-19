package ru.netology.domain;

public class Repost {
    private int numberRepostRecord;
    private boolean currentUserRepost;

    public boolean isCurrentUserRepost() {
        return currentUserRepost;
    }

    public void setCurrentUserRepost(boolean on) {
        this.currentUserRepost = on;
    }

    public int getNumberRepostRecord() {
        return numberRepostRecord;
    }

    public void setNumberRepostRecord(int numberRepostRecord) {
        this.numberRepostRecord = numberRepostRecord;
    }
}
