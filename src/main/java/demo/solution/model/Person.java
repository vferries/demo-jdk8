package demo.solution.model;

import java.util.Optional;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Address address;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Optional<Address> getAddress() {
		return Optional.ofNullable(address);
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
