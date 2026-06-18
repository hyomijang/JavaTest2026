package chapter17.page131;

import java.util.Objects;

public class Data {
	private int number;

	public Data(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data data = (Data)obj;
			return(data.number == this.number)? true : false;
		}
		return false;
	}
	
	public int compareTo(int number) {
	return compareTo(this.number);
	}

	@Override
	public String toString() {
		return " [" + number +  "]";
	}

}
