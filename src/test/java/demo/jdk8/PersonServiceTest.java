package demo.jdk8;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import demo.jdk8.model.Person;
import static org.fest.assertions.api.Assertions.*;

public class PersonServiceTest {
	private PersonService service;

	@Before
	public void initTest() {
		service = new PersonService();
	}

	@Test
	public void nobodyShouldBe0_3YearsOld() {
		assertThat(service.getPersonsByAge().get(3)).isNull();
	}

	@Test
	public void thereShouldBe6_30YearsOld() {
		assertThat(service.getPersonsByAge().get(30)).hasSize(6);
	}

	@Test
	public void shouldListFerriesFamily() {
		assertThat(service.listFirstNamesFromFamily("Ferries")).hasSize(37)
				.contains("Vincent").contains("Alexis").contains("C�lia")
				.contains("Antony");
	}

	@Test
	public void shouldBeSortedByFirstAndLastName() throws Exception {
		Person alexis = new Person("Alexis", "Ferries", 11);
		Person antony = new Person("Antony", "Ferries", 14);
		Person chloé = new Person("Chlo�", "Vermuso", 22);
		List<Person> actual = service.personsSortedByFirstNameAndLastName();
		assertThat(actual.get(0)).isEqualsToByComparingFields(alexis);
		assertThat(actual.get(1)).isEqualsToByComparingFields(antony);
		assertThat(actual.get(2)).isEqualsToByComparingFields(chloé);
	}
}
