package demo.jdk8.model;

import java.util.Optional;

public class PersonJava8 {
	private String firstName;
	private String lastName;
	private int age;
	private AddressJava8 address;

	public PersonJava8(String firstName, String lastName, int age) {
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

	public Optional<AddressJava8> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public void setAddress(AddressJava8 address) {
		this.address = address;
	}
}
