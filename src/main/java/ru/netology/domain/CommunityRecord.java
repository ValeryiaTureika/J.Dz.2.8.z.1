package ru.netology.domain;

public class CommunityRecord {
    private String text;
    private int idRecord;
    private int idSocialNetwork;
    private int idAuthorRecord;
    private int idAdministrator;
    private int dataRecord;
    private int idRecordBasedNewRecord;
    private int idAuthorRecordBasedNewRecord;
    private int friendsOnlyRecord;
    private String typeMediaFileRecord;
    private int idSigner;
    private int copyHistory;
    private int isPinned;
    private int markedAsAds;
    private int idPostponed;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(int idRecord) {
        this.idRecord = idRecord;
    }

    public int getIdSocialNetwork() {
        return idSocialNetwork;
    }

    public void setIdSocialNetwork(int idSocialNetwork) {
        this.idSocialNetwork = idSocialNetwork;
    }

    public int getDataRecord() {
        return dataRecord;
    }

    public void setDataRecord(int dataRecord) {
        this.dataRecord = dataRecord;
    }

    public int getIdRecordBasedNewRecord() {
        return idRecordBasedNewRecord;
    }

    public void setIdRecordBasedNewRecord(int idRecordBasedNewRecord) {
        this.idRecordBasedNewRecord = idRecordBasedNewRecord;
    }

    public int getIdAuthorRecordBasedNewRecord() {
        return idAuthorRecordBasedNewRecord;
    }

    public void setIdAuthorRecordBasedNewRecord(int idAuthorRecordBasedNewRecord) {
        this.idAuthorRecordBasedNewRecord = idAuthorRecordBasedNewRecord;
    }

    public int getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(int idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public int getIdAuthorRecord() {
        return idAuthorRecord;
    }

    public void setIdAuthorRecord(int idAuthorRecord) {
        this.idAuthorRecord = idAuthorRecord;
    }

    public int getFriendsOnlyRecord() {
        return friendsOnlyRecord;
    }

    public void setFriendsOnlyRecord(int friendsOnlyRecord) {
        this.friendsOnlyRecord = friendsOnlyRecord;
    }

    public String getTypeMediaFileRecord() {
        return typeMediaFileRecord;
    }

    public void setTypeMediaFileRecord(String typeMediaFileRecord) {
        this.typeMediaFileRecord = typeMediaFileRecord;
    }

    public int getIdSigner() {
        return idSigner;
    }

    public void setIdSigner(int idSigner) {
        this.idSigner = idSigner;
    }

    public int getCopyHistory() {
        return copyHistory;
    }

    public void setCopyHistory(int copyHistory) {
        this.copyHistory = copyHistory;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getIdPostponed() {
        return idPostponed;
    }

    public void setIdPostponed(int idPostponed) {
        this.idPostponed = idPostponed;
    }
}
