package test2.model;

import java.util.Objects;

public class Book {
	private String title;
	private String genre;
	private String bmSeller;
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
	public Book(String title) {
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
	}
	
	public String getBmSeller() {
		return bmSeller;
	}
	public void setBmSeller(String bmSeller) {
		this.bmSeller = bmSeller;
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
		if(book.genre.equals(this.genre) && book.title.equals(this.title))return true;;
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genre, title);
	}
	@Override
	public String toString() {
		return "[도서명 : " + title + " / 장르 :" + genre + "/ 대여횟수 :" + rentCount + "]";
	}
	
	
	
	
}
