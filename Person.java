import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable{
	private int age;
	private String name = "";
	private String address = "";
	private int zip;
	private double salary;
	
	public Person() {
		
	}
	public Person(int age, String name, String address, int zip, double salary) {
		setAge(age);
		setName(name);
		setAddress(address);
		setZip(zip);
		setSalary(salary);
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Person o) {
		if(this.getSalary() < o.getSalary()) {
			return 1;
		} else if(this.getSalary() > o.getSalary()) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return String.format(("%d %s %s %d $%,.2f") ,age, name, address, zip, salary);
	}

}
