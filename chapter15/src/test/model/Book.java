package test.model;

import java.util.Objects;

public class Book {
	private String title;
	private String genre;
	private int rentCount;
	private String grade;
	
	public Book() {
		this(null,null,0);
	}
	public Book(String title, String genre, int rentCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
		this.grade = "nomalseller";
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRentCount() {
		return rentCount;
	}
	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book))
			return false;
		Book book = (Book) obj;
		if (this.genre.equals(book.genre) && this.title.equals(book.title)) return true;
		return false;
		}

	@Override
	public int hashCode() {
		return Objects.hash(genre, title);
	}
	@Override
	public String toString() {
		return " [도서명 = " + title + "/장르: " + genre + "/대여횟수:" + rentCount + "]";
	}
	
	
	
	
	
}
