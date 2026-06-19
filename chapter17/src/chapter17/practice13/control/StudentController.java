package chapter17.practice13.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import chapter17.practice13.model.StudentVO;

public class StudentController {
	private List<StudentVO> sL;
	private List<StudentVO> csL;

	public StudentController() {
		sL = new ArrayList<StudentVO>();

	}

	// 데이타 베이스(출력 insert_)
	public int addStudent(StudentVO svo) {
		try {
			if (svo != null) {
				sL.add(svo);
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}

	// 출력 (select)00000
	public List<StudentVO> printAll() {
		return sL;
	}

	// 검색 (select)
	public StudentVO searchStudent(String name, int id) {
		for (StudentVO svo : sL) {
			if (svo.getId() == id && svo.getName().equals(name)) {
				return svo;
			}
		}
		return null;
	}

	// 삭제 (delete)
	public StudentVO removeStudent(String name, int id) {
		for (StudentVO svo : sL) {
			if (svo.getId() == id && svo.getName().equals(name)) {
				sL.remove(svo);
				return svo;
			}
		}
		return null;
	}

	// 수정 (update)
	public StudentVO updateStudent(int id, String name ,StudentVO student) {
		for (int i = 0; i < sL.size(); i++) {
			if (sL.get(i).getId() == id && sL.get(i).getName().equals(name)) {
				sL.set(i, student);
				return student;
			}
		}
		return null;
	}

	// 정렬(select) :deepcopy :shallow copy(o)
	public List<StudentVO> sortByTotalDesc() {

		try {

			// shallow copy (1)
			csL = new ArrayList<StudentVO>(sL);

			// 정렬 (total 정렬)
			Collections.sort(csL);

			// 랭킹부여 (공동순위시 순위밀림)
			for (int i = 0; i < csL.size(); i++) {
				if (i == 0) {
					// 처음 나오는것 : 1등 셋팅
					csL.get(i).setRank(1);
					continue;
				}
				// total 점수가 같은지 점검한다.
				if (csL.get(i - 1).getTotal() == csL.get(i).getTotal()) {
					csL.get(i).setRank(csL.get(i - 1).getRank());
				} else {
					csL.get(i).setRank(i + 1);
				}
			}
			return csL;
		} catch (Exception e) {
			return null;
		}
	}

	// 정렬(select) :deepcopy :shallow copy(o)
	public List<StudentVO> sortByNameAsc() {

		try {

			// shallow copy (1)
			csL = new ArrayList<StudentVO>(sL);

			// 정렬 (total 정렬)
			Collections.sort(csL, new AscendingNameStudent());

			return csL;

		} catch (Exception e) {
			return null;
		}
	}
}
