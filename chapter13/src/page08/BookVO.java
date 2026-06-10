package page08;

import java.util.Objects;

public class BookVO {
	private String title;
	private String genre;
	private int rentCount;

	public BookVO() {
		this(null, null, 0);
	}

	public BookVO(String title, String genre, int rentCount) {
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
		if(!(obj instanceof BookVO)) {
			return false;
		}
		BookVO bv = (BookVO)obj;
		if (this.title.equals(bv.title)&& this.genre.equals(bv.genre)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title,genre);
	}

	public String infrom() {
		return "[도서명:" + title + "/ 장르=" + genre + "/ 대여 횟수=" + rentCount + "]";
	}

}
