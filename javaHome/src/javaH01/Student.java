package javaH01;

import java.util.Objects;

public class Student{
	private String studentId;
	private String name;
	private int scores;
	private int sum;
	private double average;
	//객체 만들기
	//디생/메생
	public Student() {
		 this(null,null,0,0,0);
	}
	public Student(String studentId, String name, int sum, int scores, double average) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.sum = sum;
		this.scores =scores ;
		this.average = average;
	}
	
	//get/set/ 
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	//이퀄스 해시코드
	
	//tostring
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", sum=" + sum + ", scores=" + scores
				+ ", average=" + average + "]";
	}
	
	
	
	
	
}
