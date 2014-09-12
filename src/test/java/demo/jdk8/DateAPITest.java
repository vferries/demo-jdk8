package demo.jdk8;

import static org.fest.assertions.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DateAPITest {
	@Test
	public void testMyBirthDayAsString() {
		String myBirthDay = "";
		assertThat(myBirthDay).isEqualTo("21/02/1984");
	}
	
	@Test
	public void test100thDayOfYear() {
		LocalDate d = LocalDate.now();
		assertThat(d).isEqualTo(LocalDate.of(2014, Month.APRIL, 10));
	}

	@Test
	public void testInvalidDate() {
		LocalDate.of(2014, Month.FEBRUARY, 29);
	}
	
	
}
