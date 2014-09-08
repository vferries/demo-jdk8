package demo.jdk8;

import demo.jdk8.model.Address;
import demo.jdk8.model.Person;

public class Optionals {
	public String getStreetIfInCity(Person person, String city) {
		String street = "UNKNOWN";
		if (person != null) {
			Address address = person.getAddress();
			if (address != null) {
				if (city != null && city.equals(address.getCity())) {
					street = address.getStreet();
				}
			}
		}
		return street;
	}
}
