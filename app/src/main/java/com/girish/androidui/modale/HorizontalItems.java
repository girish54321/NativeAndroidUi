package com.girish.androidui.modale;

public class HorizontalItems {

    String Title;
    String Loction;
    String ImageUrl;

    public HorizontalItems(String title, String loction, String imageUrl) {
        Title = title;
        Loction = loction;
        ImageUrl = imageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLoction() {
        return Loction;
    }

    public void setLoction(String loction) {
        Loction = loction;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
