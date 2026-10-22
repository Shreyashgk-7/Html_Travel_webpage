package q1;

class Emp {
	int id;
	String name;
	double salary;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "tom", 23000);
		System.out.println(emp);
		emp = null;
		System.gc();
		System.out.println(emp);
	}
}
