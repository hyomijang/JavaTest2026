package chapter15.practice01.controller;


	
	import java.util.ArrayList;
	import java.util.List;
	
	import chapter15.practice01.model.Student;
	
	public class StundentController {
	    // 1.Student 자료공간 확보, 깊은 복사 공간 확보
	    private List<Student>  sArr;
	    private List<Student> csArr;
	
	
	    // 생성자
	    public StundentController() {
	        sArr = new ArrayList<Student>();
	        csArr = new ArrayList<Student>();
	    }
	
	    // 2. 입력
	    public void insertStudent() {
	        sArr.add (new Student("kdj1", "20261", 100, 70, 10));
	        sArr.add (new Student("kdj2", "20262", 10, 100, 100));
	        sArr.add (new Student("kdj3", "20263", 70, 10, 100));
	        sArr.add (new Student("kdj4", "20264", 100, 10, 60));
	        sArr.add (new Student("kdj5", "20265", 50, 40, 10));
	    }
	
	    // 3. 출력
	    public List<Student> selextStudent() {
	        return sArr;
	    }
	
	    // 4. 수정
	    // 5. 삭제
	    // 6. 검색
	    public Student searchStudentNoName(String name, String no) {
	        Student findStudent = null;
	        for (Student s : sArr) {
	            if (s.getName().equals(name) && s.getNo().equals(no)) {
	                findStudent = s;
	                break;
	            }
	        }
	        return findStudent;
	    }
	// 7. 정렬
	    public List<Student> sortStudents() {
	        for (int i = 0; i < sArr.size(); i++) {
	            if (sArr.get(i) != null) {
	                csArr.add(sArr.get(i));
	            }
	        }
	
	        for (int i = 0; i < csArr.size() - 1; i++) {
	            for (int j = i + 1; j < csArr.size(); j++) {
	                if (csArr.get(i).getTotal() < csArr.get(j).getTotal()) {
	                    Student buffer = csArr.get(i);
	                    csArr.set(i, csArr.get(j));
	                    csArr.set(j, buffer);
	                }
	            }
	        }
	
	        return csArr;
	    }
	
	    // 8. 기능 (전체학생 총점, 평균)
	        public int sumTotal() {
	            int sum = 0;
	        for (Student s : sArr) {
	            if (s != null) {
	                sum += s.getTotal();
	            }
	        }
	        return sum;
	    }
	
	    public double avgTotal() {
	        return sumTotal() / (double)sArr.size();
	    }
	
	    // 8. 기능 (석차)
	    public List<Student> rankStudents() {
	        for (int i = 0; i < csArr.size(); i++) {
	//            csArr[i].setRank(i+1);
	//
	//            if (i == 0) {
	//                csArr[i].setRank(i + 1);
	//            } else if (csArr[i - 1].getTotal() == csArr[i].getTotal()) {
	//                csArr[i].setRank(csArr[i - 1].getRank());
	//            } else {
	//                csArr[i].setRank(i + 1);
	//
	//            }
	        }
	        // 원본에 등수를 입력
	//        for (int i = 0; i < csArr.length; i++) {
	//            for (int j = 0; j < sArr.length; j++) {
	//                if (csArr[i].getNo().equals(sArr[i].getNo())) {
	//                    sArr[i].setRank(csArr[i].getRank());
	//                    break;
	//                }
	//            }
	//
	//        }
	
	        return csArr;
	
	    }
	
	    public double sumavg() {
	        // TODO Auto-generated method stub
	        return 0;
	    }
	
	}