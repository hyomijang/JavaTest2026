package chapter17.page49;

import java.util.Objects;

public class Data {
	private int no;
	private String name;

	public Data(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [" + no + "" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Data))
			return false;
		Data data = (Data) obj;
		if(data.name.equals(this.name) && data.no == (this.no)) {
			return true;
		}
		return false;}
		

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

}
