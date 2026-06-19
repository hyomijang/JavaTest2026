package test01.student.model;

import java.util.Collection;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	public Student() {
		this(null,0,0,0,0);
	}
	public Student(String name, int id, int kor, int eng, int math) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		caclulateTotalAvg ();
	}
	
	private void caclulateTotalAvg() {
		this.total = this.kor + this.eng + this.math ;
		this.avg = Math.round((this.total / 3.0) * 100) / 100.0;
	
		
	}
	
	public Student(Student st) {
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
		return (student.name.equals(this.name)&& student.id == (this.id))? true : false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
