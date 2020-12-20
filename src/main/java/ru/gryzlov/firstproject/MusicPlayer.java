package ru.gryzlov.firstproject;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;
    //IoC
    public MusicPlayer(Music music){
        musicList.add(music);
    }
    public MusicPlayer(){ }

    public void playMusic(){
        for(Music s : musicList){
            System.out.println("Play song: " + s.getSong());
        }
    }
}
