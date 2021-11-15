package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinate;

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public String getType() {
        return type;
    }
}
