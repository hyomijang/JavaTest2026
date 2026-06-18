package chapter17.practice12.model;

import java.util.Objects;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	public Music() {
		this(null,null);
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public Music(Music music) {
		this.title = music.title;
		this.singer = music.singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		return Objects.hash(title,singer);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music music = (Music)obj;
		return(title.equals(this.title) && singer.equals(music.title))? true:false;
			
		}
		return false;
	}
	@Override
	public int compareTo(Music o) {
		return o.singer.compareTo(this.singer);
	}
	
	@Override
	public String toString() {
		return " [" + title + "," + singer + "]";
	}
	
	
	
}
