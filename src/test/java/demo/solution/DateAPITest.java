package demo.solution;

import static org.fest.assertions.api.Assertions.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateAPITest {
	@Test
	public void testMyBirthDayAsString() {
		String myBirthDay = LocalDate.of(1984, Month.FEBRUARY, 21).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		assertThat(myBirthDay).isEqualTo("21/02/1984");
	}
	
	@Test
	public void test100thDayOfYear() {
		LocalDate d = LocalDate.ofYearDay(2014, 100);
		assertThat(d).isEqualTo(LocalDate.of(2014, Month.APRIL, 10));
	}

	@Test(expected = DateTimeException.class)
	public void testInvalidDate() {
		LocalDate.of(2014, Month.FEBRUARY, 29);
	}
}
