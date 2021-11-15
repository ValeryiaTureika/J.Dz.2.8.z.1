package ru.netology.domain;

public class CommentsInfo {
    private String text;
    private int dataCom;
    private int count;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getDataCom() {
        return dataCom;
    }

    public void setDataOfCom(int dataOfCom) {
        this.dataCom = dataOfCom;
    }


}
