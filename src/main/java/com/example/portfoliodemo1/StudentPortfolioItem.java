package com.example.portfoliodemo1;

import java.net.URL;

public class StudentPortfolioItem {
    private String title;
    private String description;
    private String imagePath;

    public StudentPortfolioItem(String title, String description, String imagePath) {
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public URL getImageUrl() {
        return getClass().getResource(imagePath);
    }
}
