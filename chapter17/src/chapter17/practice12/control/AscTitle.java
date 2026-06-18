package chapter17.practice12.control;

import java.util.Comparator;

import chapter17.practice12.model.Music;

public class AscTitle implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Music && o2 instanceof Music) {
			Music music1 = (Music)o1;
			Music music2 = (Music)o2;
			int result = music1.getTitle().compareTo(music2.getTitle());
			if(result == 0) {
				result = music1.getSinger().compareTo(music2.getSinger());
			}
			return result;
		}
		return 0;
	}

	/*
	 * @Override public int compare(Music o1, Music o2) { return 0; }
	 */
	
	
	
}
