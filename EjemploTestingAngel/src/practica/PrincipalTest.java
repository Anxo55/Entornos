package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testAdd() {
	  float r = Principal.add(4,3);
	  assertEquals(7,r);
	}
	
	@Test
	void testAddWithDecimal() {
		float r = Principal.add(3.5f, 0.2f);
		assertEquals(3.7, r, 0.001);
	}

	@Test
	void testGetFirstLetter() {
		char letter = Principal.getFirstCharacterInUpperCase("pepe");
		assertEquals('P', letter);
	}
	
	@Test 
	void testAEmpyString( ) {
		char letter = Principal.getFirstCharacterInUpperCase("");
		assertEquals(0, letter);
	}
	
	@Test
	void testANullString() {
		char letter = Principal.getFirstCharacterInUpperCase(null);
		assertEquals(0, letter);
	}
	
	@Test
	void testSumOfArraySimple() {
		float list[] = new float[] {4,7,2};
		float sum = Principal.sum(list);
		assertEquals(13, sum);
	}
	
	@Test
	void testSumOfEmpyArray() {
		float list[] = new float [] {};
		float sum = Principal.sum(list);
		assertEquals(0, sum);
		
	
	}
	
	@Test
	void testSumOfNullArray() {
	float list[] = null;
	float sum = Principal.sum(list);
	assertEquals(0, sum);
}
	
	@Test
	void testlargestNumberOfArray() {
		int list[] = new int[] {4,2,7,1};
		int theLargest = Principal.getLargestValue(list);
		assertEquals(7, theLargest);
	}
	
	@Test
	void testLargestNumberOfEmptyArray() {
		int list[] = new int[] {};
		int theLargest = Principal.getLargestValue(list);
		assertEquals(0, theLargest);
		
	}
	
	@Test
	void testLargestNumberOfNullArray() {
		int list[] = null;
		int theLargest = Principal.getLargestValue(list);
		assertEquals(0, theLargest);	
	}
	
	@Test
	void testLargestNumberInElement() {
		int list[] = new int[] {4};
		int theLargest;
	}
}
