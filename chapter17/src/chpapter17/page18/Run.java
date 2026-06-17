package chpapter17.page18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Run {


	public static void main(String[] args) {
		// ArrayList 성능
		List<Integer> aList1 = new ArrayList<Integer>();
		List<Integer> linkList1 = new LinkedList<Integer>();
		
		System.out.println("=================add=====================");
		long starttime = System.nanoTime();
		for (int i = 0; i < 100_100; i++) {
			aList1.add(0,i);
		}
		long endtime = System.nanoTime();
		System.out.printf("%d \n",endtime - starttime);

		long starttime2 = System.nanoTime();
		for (int i = 0; i < 100_100; i++) {
			linkList1.add(0,i);
		}
		long endtime2 = System.nanoTime();
		System.out.printf("%d \n",endtime2 - starttime2);
		
		System.out.println("=================get=====================");
		long starttime3 = System.nanoTime();
		for (int i = 0; i < aList1.size(); i++) {
			aList1.get(i);
		}
		long endtime3 = System.nanoTime();
		System.out.printf("%d \n",endtime3 - starttime3);

		long starttime4 = System.nanoTime();
		for (int i = 0; i < linkList1.size()
				; i++) {
			linkList1.get(i);
		}
		long endtime4 = System.nanoTime();
		System.out.printf("%d \n",endtime4 - starttime4);
		
		
	
	
	}

}
