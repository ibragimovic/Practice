package com.company.taskB;

public class Song {
    private String name;
    private String singer;
    private String genre;
    private String songText;

    public Song(String name, String singer, String genre, String songText) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.songText = songText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSongText() {
        return songText;
    }

    public void setSongText(String songText) {
        this.songText = songText;
    }
}
