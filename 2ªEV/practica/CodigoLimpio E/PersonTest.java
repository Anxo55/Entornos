import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person person = new Person();
		person.name="pepe";
		person.surname="gomez";
		String initials = person.getInitials();
		assertEquals("p g", initials);
	}

}
