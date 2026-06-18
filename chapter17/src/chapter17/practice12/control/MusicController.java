package chapter17.practice12.control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import chapter17.practice12.model.Music;

public class MusicController {
	// 멤버변수 Book bArr COUNT
	private List<Music> mList;
	private List<Music> cmList;

	// 생성자
	public MusicController() {
		mList = new ArrayList<Music>();
		cmList = new ArrayList<Music>();
	}

	// addlist. add(객체)
	public int addlist(Music music) {

		try {
			mList.add(music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public int addAtZero(Music music) {

		try {
			mList.add(0, music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Music> printAll() {
		return mList;
	}

	public List<Music> sortPrintAll() {
		return cmList;
	}

	public Music searchMusic(String title, String singer) {
		for (Music music : mList) {
			if (music.getTitle().equals(title) && music.getSinger().equals(title)) {
				return music;
			}
		}
		return null;
	}

	// 삭제
	public Music removeMusic(String title) {
		for (Music music : mList) {
			if (music.getTitle().equals(title)) {
				mList.remove(music);
				return music;
			}
		}
		return null;
	}

	// 수정
	public Music setMusic(String title, Music music) {
		for (int i = 0; i < mList.size(); i++) {
			Music m = mList.get(i);
			if (m.getTitle().equals(title)) {
				mList.set(i, music);
				return mList.get(i);
			}
		}
		return null;
	}

	// 정렬(비정렬 컨페어 array, vector
	public int ascTitle() {
		cmList.clear();
		for (Music music : mList) {
			if (music != null) {
				cmList.add(new Music(music));

			}
		}
		try {
			// treeset treemap 말고도 일반 컬렉션 프레임 워크 정렬이 가능하다.
			Collections.sort(cmList, new AscTitle());
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	// 정렬: 내림차순 가수이름 정렬

	public int descSinger() {
		cmList.clear();
		for (Music music : mList) {
			if (music != null) {
				cmList.add(new Music(music));

			}
		}

		try {
			Collections.sort(cmList);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

}
