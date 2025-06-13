package com.sethjohnston.gametracker.model;

public class Game {
    private int id;
    private String title;
    private String platform;
    private double rating;

    public Game(int id, String title, String platform, double rating) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.rating = rating;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
