package chapter17.page131;

import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		// Stack 
		Stack<Data> st = new Stack<Data>();
		//add
		st.add(new Data (1));
		st.add(new Data (9));
		st.add(new Data (5));
		st.add(new Data (3));
		System.out.println(st);
		
		
		//stack 최신값 확인
		System.out.println("st.peak = "+st.peek());
		System.out.println("st.pop = "+st.pop());
		System.out.println("st.size = "+st.size());
		System.out.println("st.isEmpty = "+st.isEmpty());
		
		//search , contains , containsKey , contaunsValue
		System.out.println("st.search(new Data (9)) = "+st.search(new Data (9)));
		System.out.println("st.search(new Data (1)) = "+st.search(new Data (1)));
		
	
		
		
		
	}

}
