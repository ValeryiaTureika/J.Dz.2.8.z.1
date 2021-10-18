package ru.netology.domain;

public class CommunityRecord {
    private String text;
    private int idRecord;
    private int idSocialNetwork;
    private int idAuthorRecord;
    private int dataRecord;
    private int idRecordBasedNewRecord;
    private int idAuthorRecordBasedNewRecord;
    private String typeMediaFileRecord;

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

    public int getIdAuthorRecord() {
        return idAuthorRecord;
    }

    public void setIdAuthorRecord(int idAuthorRecord) {
        this.idAuthorRecord = idAuthorRecord;
    }

    public String getTypeMediaFileRecord() {
        return typeMediaFileRecord;
    }

    public void setTypeMediaFileRecord(String typeMediaFileRecord) {
        this.typeMediaFileRecord = typeMediaFileRecord;
    }
}
