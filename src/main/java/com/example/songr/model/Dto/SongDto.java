package com.example.songr.model.Dto;

public class SongDto {
    private String album;
    private String title;

    public String getAlbum() {
        return album;
    }

    public SongDto() {
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
