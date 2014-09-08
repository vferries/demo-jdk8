package demo.jdk8;

import org.junit.Before;
import org.junit.Test;

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
	public void should() {
		assertThat(service.listFirstNamesFromFamily("Ferries")).hasSize(37)
				.contains("Vincent").contains("Alexis").contains("Célia")
				.contains("Antony");
	}

}
