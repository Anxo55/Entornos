import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DocumentoIdentificativoTest {

	@Test
	void testGetLetter() {
		DocumentoIdentificativo doc = new Nif();
		doc.text="36765546N";
		assertEquals("N", doc.getLetter());
	}

	@Test
	void testIsValid() {
		DocumentoIdentificativo doc = new Cif();
		doc.text="B34455667";
		assertEquals(true, doc.isValid());
		assertTrue(doc.isValid());
	}

}