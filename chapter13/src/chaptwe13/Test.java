package chaptwe13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//배열 정렬하기
		int[] ia = new int[] {7,6,9,4,3};
		
		 System.out.println(Arrays.toString(ia));
		 
		 for (int j = 0; j < ia.length-1; j++) {
			 for (int i = j; i < ia.length; i++) {
				 if(ia[j] < ia[i]) {
					 int buffer = ia [j];
					 ia[j] = ia[i];
					 ia[i] = buffer;
				 }
			 }
			
		}
		 System.out.println(Arrays.toString(ia));
	}
}
