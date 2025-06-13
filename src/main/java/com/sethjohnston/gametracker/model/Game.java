package com.sethjohnston.gametracker.model;

public class Game {
    private int gameId;
    private String title;
    private String platform;
    private double rating;

    public Game(int gameId, String title, String platform, double rating) {
        this.gameId = gameId;
        this.title = title;
        this.platform = platform;
        this.rating = rating;
    }

    public int getGameId() {
        return this.gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
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
