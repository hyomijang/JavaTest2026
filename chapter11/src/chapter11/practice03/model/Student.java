package chapter11.practice03.model;

import java.util.Objects;

//9개 생성
public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		this(null, null, 0);
	}

	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			System.out.println("비정상 값 입력");
			return false;
		} 
		Student tempStu = (Student)obj;
		if (this.name.equals(tempStu.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", score=" + score + "]";
	}

//	public String inform() {
//		
//		return null;
//	}
	
	
}
