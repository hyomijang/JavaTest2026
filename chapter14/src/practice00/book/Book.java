package practice00.book;

import java.util.Objects;

public class Book {
	private String title;
	private String genre;
	private int rentCount;
	public Book() {
		this(null,null,0);
	}
	public Book(String title, String genre, int rentCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(genre,this.genre) && Objects.equals(title, this.title);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genre, title);
	}
	@Override
	public String toString() {
		return " [도서명: " + title + "/ 장르:" + genre + "/대여횟수:" + rentCount + "]";
	}
	
	
	
	
	
}
