package chapter17.page49;

import java.util.HashSet;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		//list == set 똑같고 get () X
		//set 중복값 불가 (equals,hashcode 필수)
		//treeSet 정렬, 검색 (comparable 구현이된다)
		Set<Data > hsset = new HashSet<Data>();
		hsset.add(new Data(1, "A"));
		hsset.add(new Data(1, "B"));
		hsset.add(new Data(1, "A"));
		hsset.add(new Data(1, "D"));
		/*hsset.add("B");
		hsset.add("C");
		hsset.add("A");  //중복값으로 출력불가.
*/		System.out.println(hsset.toString());
		hsset.remove(new Data(1,"A"));
		System.out.println(hsset.toString());
		//가져오기기능 get
		System.out.println("=======get -> foreach====");
		for (Data data : hsset) {
			System.out.println(data);
			
		}
		//clear 기능
		hsset.clear();
		System.out.println(hsset);
		
	}
}
