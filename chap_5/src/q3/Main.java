package q3;

class Bank {
	public double getRateofInterest() {
		return 3.5;
	}

}

class Axis extends Bank {
	@Override
	public double getRateofInterest() {
		return 4.5;
	}
}

class Icici extends Bank {
	@Override
	public double getRateofInterest() {
		return 3.8;
	}
}

class Sbi extends Bank {
	@Override
	public double getRateofInterest() {
		return 5.7;
	}
}

class Hdfc extends Bank {
	@Override
	public double getRateofInterest() {
		return 8.6;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getRateofInterest());
		bank = new Axis();
		System.out.println(bank.getRateofInterest());
		bank = new Hdfc();
		System.out.println(bank.getRateofInterest());
		bank = new Icici();
		System.out.println(bank.getRateofInterest());
		bank = new Sbi();
		System.out.println(bank.getRateofInterest());
	}
}
