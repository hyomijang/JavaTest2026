package chapter17.page49;

import java.util.Objects;

public class Data2 implements Comparable<Data2>{
	
		private int age;

		public Data2(int age) {
			super();
			this.age = age;
		}

		public Data2(Data2 data2) {

			this.age = data2.age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public int hashCode() {
		return Objects.hashCode(age);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Data2) {
				Data2 data2 = (Data2)obj;
			 	return(data2.age == this.age)? true : false;
		}
		return false;
		}
		
		@Override
		public int compareTo(Data2 o) {
		return Integer.compare(this.age, o.age);
		}

		@Override
		public String toString() {
			return " [" + age +  "]";
		}

		
	
}
