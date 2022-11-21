import java.util.*;
public class Recording {
private String song;
private String artist;
private int playTime;
//setting the title to song name
public void setSong(String title) {
song=title;
}
//setting the name to artist name
public void setArtist(String name) {
artist=name;
}
//setting the time to playtime
public void setPlayTime(int time) {
playTime=time;
}
//returning song name
public String getSong() {
return song;
}
//returning artist name
public String getArtist() {
return artist;
}
//returning play time
public int getPlayTime() {
return playTime;
}
}
