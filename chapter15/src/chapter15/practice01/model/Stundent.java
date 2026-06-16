package chapter15.practice01.model;

import java.time.chrono.IsoChronology;
import java.util.Objects;

public class Stundent {
	private String name;
	private String no;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int rank;
	private double avg;

	public Stundent() {
		this(null, null, 0, 0, 0);
	}

	public Stundent(String name, String no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0 ;
	}

	// deep copy
	public Stundent(Stundent s) {
		this.name = s.name;
		this.no = s.no;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.total = s.total;
		this.avg = s.avg;
		this.rank = s.rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Stundent) {
			Stundent s = (Stundent) obj;
			if (name.equals(s.name) && no.equals(s.no))
				return true;
			}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,no);
	}

	@Override
	public String toString() {
		return "Stundent [" + name + "," + no + ", " + kor + ", " + eng + ", " + math + ", "
				+ total + "," + avg + "]";
	}
	
}
