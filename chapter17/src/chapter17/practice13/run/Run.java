package chapter17.practice13.run;

import chapter17.practice13.control.StudentController;
import chapter17.practice13.model.StudentVO;
import chapter17.practice13.view.StudentView;


public class Run {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		StudentView sv = new StudentView();
		sv.display();
		System.out.println("the end");
	
	}

}
