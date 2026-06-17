package chapter17.page09;

import java.awt.Label;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Run {
	public static void main(String[] args) {
		//list -> ArratList , Vector , Linklist
		//size()-> 기본값 1 -> 생성자 갯수를 입력이 가능하다.
		//linkedList ; 구조때문에 사이즈를 잡아놓고 사용하는 것이 아니다.
		List<String> aList1 = new ArrayList<String>(50);
		List<String> aList2 = new Vector<String>(50);
		List<String> aList3 = new LinkedList<String>();
		//==========================================
		//Arrays.asList(); 정적리스트로 변경한다.(추가,삭제불가 ||배열기능동일화)
		List<String> aList4 =  Arrays.asList("A","b","c");
		System.out.println(aList4);
		aList4.set(2, "4");
		System.out.println(aList4);
		
		List<String> aList5 = new ArrayList<String>();
		aList5.add("2");
		aList5.add("2");
		aList5.add("5");
		aList5.add("2");
		aList5.add("asda");
		System.out.println(aList5);
		System.out.println("aList4.clear() = "+aList5);
		aList5.clear();
		System.out.println("aList4.clear() = "+aList5);
		if(aList5.isEmpty()) {
			System.out.printf("%d \n",aList5.size());
		}
		
		List<String> aList6 = new ArrayList<String>();
		aList6.add("2");
		aList6.add("2");
		aList6.add("5");
		Object[] oArray =  aList6.toArray(new String[0]);
		System.out.println(Arrays.toString(oArray));
		
		if(aList6.contains("2") == true) {
			System.out.println("있엉");
		}
		
	}
}