package com.example.songr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String artist;
    private int songCount;
    private long length;
    private String URL;

    public Album(String title, String artist, int songCount, long length, String URL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.URL = URL;
    }

    public Album() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public long getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Long getId() {
        return id;
    }



    public void setLength(long length) {
        this.length = length;
    }
}
