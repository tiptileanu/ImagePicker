package com.example.imagepicker;

public class Attractions {

    private String name, location, desc, imageURL, bookingURL;
    private boolean canBook;

    public Attractions() {

    }

    public Attractions(String name, String location, String desc, String imageURL, String bookingURL, boolean canBook) {
        this.name = name;
        this.location = location;
        this.desc = desc;
        this.imageURL = imageURL;
        this.bookingURL = bookingURL;
        this.canBook = canBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getBookingURL() {
        return bookingURL;
    }

    public void setBookingURL(String bookingURL) {
        this.bookingURL = bookingURL;
    }

    public boolean isCanBook() {
        return canBook;
    }

    public void setCanBook(boolean canBook) {
        this.canBook = canBook;
    }
}
