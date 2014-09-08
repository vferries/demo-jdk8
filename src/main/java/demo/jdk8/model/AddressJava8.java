package demo.jdk8.model;

import java.util.Optional;

public class AddressJava8 {
	private String city;
	private String street;

	public AddressJava8(String city, String street) {
		this.city = city;
		this.street = street;
	}

	public Optional<String> getCity() {
		return city == null ? Optional.of(city) : Optional.empty();
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Optional<String> getStreet() {
		return street == null ? Optional.of(street) : Optional.empty();
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
