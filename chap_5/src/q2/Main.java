package q2;

class Emp {
	public void calSal(double salary) {
		System.out.println(salary);
	}

	public void calSal(double salary, double tax) {
		System.out.println(salary - tax);
	}

	public void calSal(double salary, double tax, double bonus) {
		System.out.println(salary - tax + bonus);
	}
}

class Accountant extends Emp {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}

	@Override
	public void calSal(double salary, double tax) {
		System.out.println(salary - tax);
	}

	@Override
	public void calSal(double salary, double tax, double bonus) {
		System.out.println(salary - tax + bonus);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.calSal(23535);
		emp.calSal(4545, 2340);
		emp.calSal(463354, 30, 3440);

		Accountant accountant = new Accountant();
		accountant.calSal(4355);
		accountant.calSal(5345, 550);
		accountant.calSal(5453, 3540, 54640);

	}
}
