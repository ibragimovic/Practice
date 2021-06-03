package com.company.taskA;

public class Song {
    private String name;
    private String singer;
    private String genre;
    private String text;

    public Song(String name, String singer, String genre, String songText) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.text = songText;
    }

    @Override
    public String toString() {
        String message = getName() + "\n" + getSinger() + "\n" + getText() + "\n" + getGenre();
        return message;
    }

    public Song(String photograph, String ed_sheeran, String s) {

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

    public String getText() {
        return text;
    }

    public void setText(String songText) {
        this.text = songText;
    }
}
