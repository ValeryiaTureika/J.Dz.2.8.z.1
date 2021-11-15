package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean userReposted;

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
