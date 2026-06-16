package chapter15.practice01.controller;

import chapter15.practice01.model.Stundent;

public class StundentController {
	// Stundent 자료공간 확보, 깊은 복사공간 확보
	private Stundent[] sArr;
	private Stundent[] csArr;
	private final int COUNT = 5;

	public StundentController() {
		sArr = new Stundent[COUNT];
		csArr = new Stundent[COUNT];
	}

	// 2.입력
	public void insertStundent() {
		sArr[0] = new Stundent("sdfg", "20260604", 100, 100, 100);
		sArr[1] = new Stundent("sdas", "2026304", 80, 50, 40);
		sArr[2] = new Stundent("gg", "20264", 87, 100, 12);
		sArr[3] = new Stundent("sdf", "202606", 50, 80, 50);
		sArr[4] = new Stundent("fg", "2026032304", 32, 67, 100);
	}

	public Stundent[] seletsStudent() {
		return sArr;
	}

	// 출력

	// 수정

	// 삭제

	// 검색
	public Stundent searchStudenNoName(String name, String no) {
		Stundent findStundent = null;
		for (Stundent s : sArr) {
			if (s.getName().equals(name) && s.getNo().equals(no)) {
				findStundent = s;
				break;
			}
		}
		return findStundent;
	}

	// 정렬
	public Stundent[] sortStundent() {
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i] != null) {
				csArr[i] = new Stundent(sArr[i]);
			}
		}

		for (int i = 0; i < csArr.length - 1; i++) {
			for (int j = i; j < csArr.length; j++) {
				if (csArr[i].getTotal() < csArr[j].getTotal()) {
					Stundent buffer = csArr[i];
					csArr[i] = csArr[j];
					csArr[j] = buffer;
				}

			}

		}

		return csArr;
	}

	// 기능(전체 학생의 총점/평균)
	public int sumTotal() {
		int sum = 0;
		for (Stundent s : sArr) {
			if(s != null) {
				sum += s.getTotal();
			}
		}
		return sum;
	}
	
	public double avgTotal() {
		
		return sumTotal() / (double)COUNT;
	}
	
	
	//석차
	public Stundent[] renkStundent() {
		sortStundent(); 
		for (int i = 0; i < csArr.length; i++) {
			csArr[i].setRank(i+1);
			
		}
		/*
		 * if(i == 0) { csArr[i].setRank(i); }else if(i != 0 && (csArr[i-1].getTotal()
		 * == csArr[i].getTotal())) { csArr[i].setRank(csArr[i-1].getRank()); }else {
		 * csArr[i].setRank(i+1); } }
		 */
		return csArr;
	}
}
