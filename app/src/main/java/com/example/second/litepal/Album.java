package com.example.second.litepal;

import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePal;
import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album extends DataSupport {

    @Column(unique = true, defaultValue = "unknown")
    private String name;

    @Column(ignore = true)
    private float price;

    private Date releaseDate;

    private List<Song> songs = new ArrayList<>();

    // generated getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    SQLiteDatabase db = LitePal.getDatabase();

}