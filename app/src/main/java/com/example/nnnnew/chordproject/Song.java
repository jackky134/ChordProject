package com.example.nnnnew.chordproject;

/**
 * Created by nnnnew on 6/12/2017 AD.
 */

// คลาสเพลง

public class Song {

    private String songName;
    private String singerName;
    private String imgChord;
    private Long _id;

    public Song(String songName, String singerName, String imgChord, Long _id) {
        this.songName = songName;
        this.singerName = singerName;
        this.imgChord = imgChord;
        this._id = _id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getImgChord() {
        return imgChord;
    }

    public void setImgChord(String imgChord) {
        this.imgChord = imgChord;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }
}
