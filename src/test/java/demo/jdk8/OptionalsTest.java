package demo.jdk8;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

import demo.jdk8.model.Address;
import demo.jdk8.model.Person;

public class OptionalsTest {
	@Test
	public void testNoPerson() {
		assertThat(new Optionals().getStreetIfInCity(null, "Toulouse")).isEqualTo("UNKNOWN");
	}

	@Test
	public void testAddressPresent() {
		Address address = new Address("Toulouse", "12 rue Matabiau");
		Person herve = new Person("Hervé", "Ricard", 22);
		herve.setAddress(address);
		assertThat(new Optionals().getStreetIfInCity(herve, "Toulouse")).isEqualTo("12 rue Matabiau");
	}

	@Test
	public void testAddressAbsent() {
		Person herve = new Person("Hervé", "Ricard", 22);
		assertThat(new Optionals().getStreetIfInCity(herve, "Toulouse")).isEqualTo("UNKNOWN");
	}

	@Test
	public void testOtherCity() {
		Address address = new Address("Nice", "12 rue Matabiau");
		Person herve = new Person("Hervé", "Ricard", 22);
		herve.setAddress(address);
		assertThat(new Optionals().getStreetIfInCity(herve, "Toulouse")).isEqualTo("UNKNOWN");
	}
}
