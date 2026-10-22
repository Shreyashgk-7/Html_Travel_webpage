package q5;

class Manager {
	String task1 = "ffggfggh";
	String task2 = "dgjngdjnf";

	public Manager() {
		System.out.println("Manager task");
	}

	public void displayTask() {
		System.out.println("task done");
	}
}

class Emp extends Manager {
	int id;
	String name;

	public Emp(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public void displayEmptask() {
		super.displayTask();
		System.out.println(super.task1);
		System.out.println(super.task2);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(23, "raj");
		emp.displayEmptask();
	}
}
