package chapter15.practice02.model;

import java.util.Objects;

public class Book {

		private String title;
		private String genre;
		private int rentCount;

		public Book() {
			this(null, null, 0);
		}

		public Book(String title, String genre, int rentCount) {
			super();
			this.title = title;
			this.genre = genre;
			this.rentCount = rentCount;
		}

		public Book(Book book) {
			this.title = book.title;
			this.genre = book.genre;
			this.rentCount = book.rentCount;
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
			if(book.genre.equals(this.genre) && book.title.equals(this.title)) return true;
			return false;
			
		}

		@Override
		public int hashCode() {
			return Objects.hash(genre, title);
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", genre=" + genre + ", rentCount=" + rentCount + "]";
		}

	}

