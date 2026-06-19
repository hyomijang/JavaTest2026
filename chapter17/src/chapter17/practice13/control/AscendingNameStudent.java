package chapter17.practice13.control;

import java.util.Comparator;
import chapter17.practice13.model.StudentVO;

public class AscendingNameStudent implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof StudentVO && o2 instanceof StudentVO) {
			StudentVO stu1 = (StudentVO) o1;
			StudentVO stu2 = (StudentVO) o2;
			return (stu1.getName().compareTo(stu2.getName()));

		}
		return 0;
	}

}
