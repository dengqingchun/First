package com.example.second.litepal;

import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePal;
import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class Song extends LitePalSupport {

    @Column(nullable = false)
    private String name;

    private int duration;

    @Column(ignore = true)
    private String uselessField;

    private Album album;

    // generated getters and setters.

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void setUselessField(String uselessField) {
        this.uselessField = uselessField;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setName(String name) {
        this.name = name;
    }
    SQLiteDatabase db = LitePal.getDatabase();
}
