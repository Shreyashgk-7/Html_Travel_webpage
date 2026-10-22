package q6;

class Policy {
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Accountant extends Policy {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Emp extends Accountant {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Manager extends Accountant {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

public class Main {
	public static void main(String[] args) {
		Policy policy = new Policy();
		policy.calSal(4555);
		Accountant accountant = new Accountant();
		accountant.calSal(5656);
		Emp emp = new Emp();
		emp.calSal(45454);
		Manager manager = new Manager();
		manager.calSal(65656);
	}
}
