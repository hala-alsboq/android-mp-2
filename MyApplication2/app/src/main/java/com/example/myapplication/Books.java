package com.example.myapplication;

public class Books {

    private String name;
    private String catg;
    private double rating;
    private String writer;
    private int img;

    public Books(String name, String catg, double rating, String writer, int img) {
        this.name = name;
        this.catg = catg;
        this.rating = rating;
        this.writer = writer;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }}



