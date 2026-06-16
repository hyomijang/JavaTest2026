package practice01.model;

import java.util.Objects;
//객체 만들기
//자원 자동 반납기 임플리먼드 오토 클로서블
public class Book implements AutoCloseable {
	private String title;
	private String gervre;
	private int rentCount;
//디생
	public Book() {
		this(null, null, 0);
	}
//매생
	public Book(String title, String gervre, int rentCount) {
		super();
		this.title = title;
		this.gervre = gervre;
		this.rentCount = rentCount;
	}
//겟셋
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
//불리언 이퀄스 변수값 비교하기 (다운캐스팅)(이프 인스턴스 오프)(이프 디스.타이틀 저널(북.저널, 타이틀)리턴 트루
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) 
			return false;
			Book book = (Book) obj;
			if(this.title.equals(book.title)&& this.gervre.equals(book.gervre)) return true;
		return false;
	}
//해쉬코드 적용시 오브젝트가 아닌 오브젝트스로 할 것
	@Override
	public int hashCode() {
		return Objects.hash(title,gervre);
		
	}
	
//자원값 회수 보이드 클로즈 던지기 익셉션	
	@Override
	public void close() throws Exception {
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", gervre=" + gervre + ", rentCount=" + rentCount + "]";
	}
	
	
	
	
}
	
 		