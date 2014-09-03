package org.gradle;

import org.junit.Test;
import static org.fest.assertions.api.Assertions.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertThat(person.getName()).isEqualTo("Larry");
    }
}
