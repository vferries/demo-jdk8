package demo.solution;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;

import demo.solution.Optionals;
import demo.solution.model.Address;
import demo.solution.model.Person;

public class OptionalsTest {
	@Test
	public void testNoPerson() {
		assertThat(new Optionals().getStreetIfInCity(Optional.empty(), "Toulouse")).isEqualTo("UNKNOWN");
	}

	@Test
	public void testAddressPresent() {
		Address address = new Address("Toulouse", "12 rue Matabiau");
		Person herve = new Person("Hervé", "Ricard", 22);
		herve.setAddress(address);
		assertThat(new Optionals().getStreetIfInCity(Optional.of(herve), "Toulouse")).isEqualTo("12 rue Matabiau");
	}

	@Test
	public void testAddressAbsent() {
		Person herve = new Person("Hervé", "Ricard", 22);
		assertThat(new Optionals().getStreetIfInCity(Optional.of(herve), "Toulouse")).isEqualTo("UNKNOWN");
	}

	@Test
	public void testOtherCity() {
		Address address = new Address("Nice", "12 rue Matabiau");
		Person herve = new Person("Hervé", "Ricard", 22);
		herve.setAddress(address);
		assertThat(new Optionals().getStreetIfInCity(Optional.of(herve), "Toulouse")).isEqualTo("UNKNOWN");
	}
}
