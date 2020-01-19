package com.example.ratemyskin;

public class Upload {
    private String name;
    private String imageUrl;

    public Upload() {

    }

    public Upload(String name, String imageUrl) {
        // empty names are replaced with no name
        // trim() because user might type a few spaces
        if (name.trim().equals("")) {
            name = "No name";
        }

        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setmImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
