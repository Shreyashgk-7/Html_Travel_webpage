package q2;

class Hobbies {
	String h1;
	String h2;

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}

	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}

}

class Address {
	String areaname;
	String cityname;

	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", cityname=" + cityname + "]";
	}

	public Address(String areaname, String cityname) {
		super();
		this.areaname = areaname;
		this.cityname = cityname;
	}
}

class Emp {
	int id;
	String name;
	Hobbies hobbies;
	Address address;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}

	public Emp(int id, String name, Hobbies hobbies, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.address = address;
	}
}

public class Main {
	public static void main(String[] args) {
		Hobbies hobbies = new Hobbies("play", "game");
		Address address = new Address("borivali", "goa");
		Emp emp = new Emp(10, "tom", hobbies, address);
		System.out.println(emp.address.areaname);
	}
}
