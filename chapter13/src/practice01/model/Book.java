package practice01.model;

import java.util.Objects;

public class Book implements AutoCloseable {
	private String title;
	private String gervre;
	private int rentCount;

	public Book() {
		this(null, null, 0);
	}

	public Book(String title, String gervre, int rentCount) {
		super();
		this.title = title;
		this.gervre = gervre;
		this.rentCount = rentCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGervre() {
		return gervre;
	}

	public void setGervre(String gervre) {
		this.gervre = gervre;
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
			if(this.title.equals(book.title)&& this.gervre.equals(book.gervre)) return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(title,gervre);
		
	}
	
	@Override
	public void close() throws Exception {
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", gervre=" + gervre + ", rentCount=" + rentCount + "]";
	}
	
	
	
	
}
	
 		