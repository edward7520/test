package baseClass;

import java.util.Date;

public class Employee {

	private String name;
	private double salary;
	private Date hireDay;

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDay == null) ? 0 : hireDay.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hireDay == null) {
			if (other.hireDay != null)
				return false;
		} else if (!hireDay.equals(other.hireDay))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// System.out.println(Object.class.hashCode());
		//System.out.println(Object.class.getModifiers());
		char a[] = { 's', 't', 'b', 'u', 's', 'n' };
		String s = new String(a, 2, 3);
		System.out.println(s);
	}
}
