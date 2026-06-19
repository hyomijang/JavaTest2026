package chapter17.practice13.model;

import java.util.Objects;

public class StudentVO implements Comparable<StudentVO> {
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	public StudentVO() {
		this(null, 0, 0, 0, 0);
	}

	public StudentVO(String name, int id, int kor, int eng, int math) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calculateTotalAvg();
	}

	public StudentVO(StudentVO st) {
		super();
		this.name = st.name;
		this.id = st.id;
		this.kor = st.kor;
		this.eng = st.eng;
		this.math = st.math;
		this.total = st.total;
		this.avg = st.avg;
		this.rank = st.rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// 총점, 평균 계산함수
	private void calculateTotalAvg() {
		this.total = this.kor + this.eng + this.math;
		this.avg = Math.round((this.total / 3.0) * 100) / 100.0;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentVO) {
			StudentVO stvo = (StudentVO) obj;
		return (this.name.equals(stvo.name) && this.id == stvo.id)? true : false;
	    }
		return false;
	}
	


	@Override
	public int compareTo(StudentVO o) {
		return o.total - this.total;
	}

	@Override
	public String toString() {
		return "[" + name + "/" + id + "/" + kor + "/" + eng + "/" + math
				+ "/" + total + "/" + avg + "/" + rank + "] \n";
	}
	
	

}
