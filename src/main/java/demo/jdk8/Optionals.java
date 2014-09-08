package demo.jdk8;

import java.util.Optional;

import demo.jdk8.model.Address;
import demo.jdk8.model.AddressJava8;
import demo.jdk8.model.Person;
import demo.jdk8.model.PersonJava8;

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

	public String getStreetIfInCityJava8(Optional<PersonJava8> person,
			String city) {

		String street = "UNKNOWN";
		if (person.isPresent()) {
			Optional<AddressJava8> address = person.get().getAddress();
			if (address.isPresent()) {
				if (city.equals(address.get().getCity())) {
					street = address.get().getStreet().get();
				}
			}
		}
		return street;
	}

	public String getStreetIfInCityJava82(Optional<PersonJava8> person,
			String city) {
		return person.flatMap(PersonJava8::getAddress)
				.filter(a -> city.equals(a.getCity()))
				.flatMap(AddressJava8::getStreet).orElse("UNKNOWN");
	}
}
