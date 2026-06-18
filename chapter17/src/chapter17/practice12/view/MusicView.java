package chapter17.practice12.view;

import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Scanner;

import chapter17.practice12.control.MusicController;
import chapter17.practice12.model.Music;

public class MusicView {
	private Scanner sc;
	private MusicController mc;

	public MusicView() {
		sc = new Scanner(System.in);
		mc = new MusicController();
	}

	public void mainMenu() {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.print("** 메인 메뉴 **\n" + "1. 마지막 위치에 곡 추가\n" + "2. 첫 위치에 곡 추가\n" + "3. 전체 곡 목록 출력\n"
					+ "4. 특정 곡 검색\n" + "5. 특정 곡 삭제\n" + "6. 특정 곡 정보 수정\n" + "7. 곡명 오름차순 정렬 \n" + "8. 가수명 내림차순 정렬 \n"
					+ "9. 종료\n" + "메뉴 번호 선택 : >> ");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				exitFlag = true;
				break;

			default:
				break;
			}
		}

	}

	// 8. 가수명 내림차순 정렬
	private void descSinger() {
		int result = mc.descSinger();
		if (result == 1) {
			System.out.println("가수명 정렬이 완료되었습니다.");
			List<Music> cmlist = mc.sortPrintAll();
			System.out.println(cmlist);
		} else {
			System.out.println("가수명 정렬을 실패하였습니다.");

		}
	}

	// 7. 곡명 오름차순 정렬
	private void ascTitle() {
		int result = mc.ascTitle();
		if (result == 1) {
			System.out.println("곡제목 정렬이 완료되었습니다.");
			List<Music> cmlist = mc.sortPrintAll();
			System.out.println(cmlist);
		} else {
			System.out.println("곡제목 정렬을 실패하였습니다.");

		}

	}

	// 특정 곡 정보 수정
	private void setMusic() {
		System.out.print("old title >>");
		String oldtitle = sc.nextLine();
		System.out.print("new title >>");
		String title = sc.nextLine();
		System.out.print("new singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		Music newmusic = mc.setMusic(oldtitle, music);
		if (newmusic != null) {
			System.out.println("음악이 수정되었습니다:" + music);
		} else {
			System.out.println(oldtitle + "music이 검색되지 않았습니다.");

		}

	}

	// 5. 특정 곡 삭제
	private void removeMusic() {
		System.out.print("delete title >>");
		String title = sc.nextLine();
		Music music = mc.removeMusic(title);
		if (music != null) {
			System.out.println("음악이 삭제되었습니다:" + music);
		} else {
			System.out.println("해당 곡은 없습니다.");

		}

	}

	// 4. 특정 곡 검색
	private void searchMusic() {
		System.out.print("search title >>");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title, title);
		if (music != null) {
			System.out.println("음악이 검색되었습니다" + music);
		} else {
			System.out.println("해당 곡은 없습니다.");

		}
	}

	// 3. 전체 곡 목록 출력
	private void printAll() {
		List<Music> mlist = mc.printAll();
		if (mlist != null) {
			System.out.println(mlist);
		} else {
			System.out.println("현재 등록된 곡이 없습니다.");

		}

	}

	// 2. 첫 위치에 곡 추가
	private void addAtZero() {
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		if (result == 1) {
			System.out.printf("%s  %s 처음위치에 등록이 잘 되었습니다. \n", title, singer);
		} else {
			System.out.printf("%s  %s 처음위치에 등록을 실패했습니다. \n", title, singer);

		}

	}

	// 1. 마지막 위치에 곡 추가
	private void addList() {
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addlist(music);
		if (result == 1) {
			System.out.printf("%s  %s등록이 잘 되었습니다. \n", title, singer);
		} else {
			System.out.printf("%s  %s 등록을 실패했습니다. \n", title, singer);

		}
	}

}
