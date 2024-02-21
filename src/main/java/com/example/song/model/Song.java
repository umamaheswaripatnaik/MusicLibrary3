package com.example.song.model;

import com.example.song.model.Song;
import javax.persistence.*;

@Entity
@Table(name="playlist")
public class Song {
    @Id
    @Column(name = "songId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;
    @Column(name = "songname")
    String songName;
    @Column(name = "lyricist")
    String lyricist;
    @Column(name = "singer")
    String singer;
    @Column(name = "musicdirector")
    String musicDirector;

    public Song() {
    }

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
}
