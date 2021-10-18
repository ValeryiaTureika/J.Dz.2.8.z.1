package ru.netology.domain;

public class UserActionRecord {
    private boolean currentUserPinRecord;
    private boolean currentUserDeleteRecord;
    private boolean currentUserEditRecord;
    private boolean currentUserSaveBookmarkRecord;
    private boolean currentUserNotifyNewRecord;
    private boolean currentUserNotInterestingRecord;
    private boolean currentUserHideSourceNewsRecord;
    private boolean currentUserCopyLinkRecord;
    private boolean currentUserComplainRecord;

    public boolean isCurrentUserPinRecord() {
        return currentUserPinRecord;
    }

    public void setCurrentUserPinRecord(boolean on) {
        this.currentUserPinRecord = on;
    }

    public boolean isCurrentUserDeleteRecord() {
        return currentUserDeleteRecord;
    }

    public void setCurrentUserDeleteRecord(boolean on) {
        this.currentUserDeleteRecord = on;
    }

    public boolean isCurrentUserEditRecord() {
        return currentUserEditRecord;
    }

    public void setCurrentUserEditRecord(boolean on) {
        this.currentUserEditRecord = on;
    }

    public boolean isCurrentUserSaveBookmarkRecord() {
        return currentUserSaveBookmarkRecord;
    }

    public void setCurrentUserSaveBookmarkRecord(boolean on) {
        this.currentUserSaveBookmarkRecord = on;
    }

    public boolean isCurrentUserNotifyNewRecord() {
        return currentUserNotifyNewRecord;
    }

    public void setCurrentUserNotifyNewRecord(boolean on) {
        this.currentUserNotifyNewRecord = on;
    }

    public boolean isCurrentUserNotInterestingRecord() {
        return currentUserNotInterestingRecord;
    }

    public void setCurrentUserNotInterestingRecord(boolean on) {
        this.currentUserNotInterestingRecord = on;
    }

    public boolean isCurrentUserHideSourceNewsRecord() {
        return currentUserHideSourceNewsRecord;
    }

    public void setCurrentUserHideSourceNewsRecord(boolean on) {
        this.currentUserHideSourceNewsRecord = on;
    }

    public boolean isCurrentUserCopyLinkRecord() {
        return currentUserCopyLinkRecord;
    }

    public void setCurrentUserCopyLinkRecord(boolean on) {
        this.currentUserCopyLinkRecord = on;
    }

    public boolean isCurrentUserComplainRecord() {
        return currentUserComplainRecord;
    }

    public void setCurrentUserComplainRecord(boolean on) {
        this.currentUserComplainRecord = on;
    }
}
