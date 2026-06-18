package chapter17.page49;

import java.util.SortedSet;
import java.util.TreeSet;

public class Run2 {

	public static void main(String[] args) {
		TreeSet<Data2> ts = new TreeSet<Data2>();
		// 50개 객체를 트리셋에 추가
		for (int i = 1; i <= 20; i++) {
			int value = (int) (Math.random() * (20 - 1 + 1) + 1);
			System.out.printf("%3d ", value);
			ts.add(new Data2(value));
		}
		System.out.println();
		System.out.printf("ts. size () = %s \n", ts.size());
		// 50개 출력
		System.out.println("=============");
		System.out.printf("ts. size () = %s \n", ts.size());
		System.out.println(ts);
		// 가장 작은 값은 first()
		System.out.printf("ts.first () = %s \n", ts.first());
		System.out.printf("ts. pollfirst () = %s \n", ts.pollFirst());
		System.out.printf("ts. size () = %s \n", ts.size());
		System.out.println(ts);
		// 가장 작은 값은 last()
		System.out.printf("ts.last () = %s \n", ts.last());
		System.out.printf("ts. polllast () = %s \n", ts.pollLast());
		System.out.printf("ts. size () = %s \n", ts.size());
		System.out.println(ts);
		// lower()
		System.out.printf("ts.lower () = %s \n", ts.lower(new Data2(10)));
		// higher()
		System.out.printf("ts.higher () = %s \n", ts.higher(new Data2(10)));

		// floor()
		System.out.printf("ts.floor() = %s \n", ts.floor(new Data2(10)));
		// ceiling()
		System.out.printf("ts.ceiling () = %s \n", ts.ceiling(new Data2(10)));
		// headSet(E), headSet(E,false)
		SortedSet<Data2> ss = ts.headSet(new Data2(10), true);
		System.out.println(ss);
		// tailSet(E), tailSet(E,false)
		SortedSet<Data2> ss1 = ts.tailSet(new Data2(10), false);
		System.out.println(ss1);
		//subSet(E1)(E2)(T,F)
		SortedSet<Data2> ss2 = ts.subSet(new Data2(5),true, new Data2(15),true);
		System.out.println(ss2);
		//기본 up->down //역정렬
		SortedSet<Data2> ss3 = ts.descendingSet();
		System.out.println(ss3);
	}

}
