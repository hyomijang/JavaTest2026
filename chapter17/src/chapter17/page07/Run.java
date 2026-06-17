package chapter17.page07;

import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		//배열(크키,삭제,추가 : 변경불가 ||| 수정만 가능) 리스트의 차이점
		//배열크기 낭비, 리스트 낭비없음
		String[] array = {"가", "나", "다", "라", "마", "바", "사"};
		for (String string : array) {
			System.out.printf("%5s ",string);
		}
		array[1] = null;
		array[2] = null;
		System.out.println();
		for (String string : array) {
			System.out.printf("%5s ",string);
		}
		System.out.println();
		System.out.printf("배열의 크기 %d \n",array.length);
		System.out.println(array);
		System.out.println("/n==========================================/n");
		//리스트
		ArrayList<String> aList =  new ArrayList<String>();
		aList.add("가"); aList.add("나"); aList.add("다");
		aList.add("라"); aList.add("마"); aList.add("바");
		aList.add("사");
		for (String string : aList) {
			System.out.printf("%5s ",string);
		}
		System.out.printf("배열의 크기 %d \n",aList.size());
		System.out.println(aList +"asda");

		aList.remove(1);
		aList.remove(2);
		System.out.println();
		for (String string : aList) {
			System.out.printf("%5s ",string);
		}
		System.out.printf("배열의 크기 %d \n",aList.size());
	}

}
