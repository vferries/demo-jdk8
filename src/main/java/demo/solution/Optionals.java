package demo.solution;

import java.util.Optional;

import demo.solution.model.Address;
import demo.solution.model.Person;

public class Optionals {
	public String getStreetIfInCity(Optional<Person> person,
			String city) {
		String street = "UNKNOWN";
		if (person.isPresent()) {
			Optional<Address> address = person.get().getAddress();
			if (address.isPresent()) {
				if (city.equals(address.get().getCity().get())) {
					street = address.get().getStreet().get();
				}
			}
		}
		return street;
	}

	public String getStreetIfInCity2(Optional<Person> person,
			String city) {
		return person.flatMap(Person::getAddress)
				.filter(a -> city.equals(city))
				.flatMap(Address::getStreet).orElse("UNKNOWN");
	}
}
