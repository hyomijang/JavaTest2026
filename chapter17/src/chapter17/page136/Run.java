package chapter17.page136;

import java.util.LinkedList;
import java.util.Queue;

public class Run {

	public static void main(String[] args) {
		// Queue
		Queue<Data> q = new LinkedList<Data>();
		q.offer(new Data(3));
		q.offer(new Data(7));
		q.offer(new Data(8));
		q.offer(new Data(1));
		System.out.println(q);
		
		//
		System.out.println("q.peek()= "+q.peek());
		System.out.println("q.size()= "+q.size());
		q.clear();
		System.out.println("q.poll()= "+q.poll());
		System.out.println("q.size()= "+q.size());
		
		q.offer(new Data(8));
		q.offer(new Data(1));
		System.out.println(q);
		System.out.println("q.remove()= "+q.remove());
		System.out.println("q.poll()= "+q.poll());
		System.out.println("q.poll()= "+q.poll());
		System.out.println("q.poll()= "+q.poll());
		System.out.println("q.poll()= "+q.poll());

	}

}
