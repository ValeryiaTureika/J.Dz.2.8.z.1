package ru.netology.domain;

public class Comment {
    private boolean leaveCommentRecord;
    private boolean leaveCommunityCommentRecord;
    private int idAuthorCommentRecord;
    private int idTextCommentRecord;
    private int dataCommentRecord;
    private boolean filterInterestingFirstCommentField;
    private int numberComment;
    private boolean canOpenComment;
    private boolean canCloseComment;

    public boolean isLeaveCommentRecord() {
        return leaveCommentRecord;
    }

    public void setLeaveCommentRecord(boolean on) {
        this.leaveCommentRecord = on;
    }

    public boolean isLeaveCommunityCommentRecord() {
        return leaveCommunityCommentRecord;
    }

    public void setLeaveCommunityCommentRecord(boolean on) {
        this.leaveCommunityCommentRecord = on;
    }

    public int getIdAuthorCommentRecord() {
        return idAuthorCommentRecord;
    }

    public void setIdAuthorCommentRecord(int idAuthorCommentRecord) {
        this.idAuthorCommentRecord = idAuthorCommentRecord;
    }

    public int getIdTextCommentRecord() {
        return idTextCommentRecord;
    }

    public void setIdTextCommentRecord(int idTextCommentRecord) {
        this.idTextCommentRecord = idTextCommentRecord;
    }

    public int getDataCommentRecord() {
        return dataCommentRecord;
    }

    public void setDataCommentRecord(int dataCommentRecord) {
        this.dataCommentRecord = dataCommentRecord;
    }

    public boolean isFilterInterestingFirstCommentField() {
        return filterInterestingFirstCommentField;
    }

    public void setFilterInterestingFirstCommentField(boolean on) {
        this.filterInterestingFirstCommentField = on;
    }

    public int getNumberComment() {
        return numberComment;
    }

    public void setNumberComment(int numberComment) {
        this.numberComment = numberComment;
    }
}
