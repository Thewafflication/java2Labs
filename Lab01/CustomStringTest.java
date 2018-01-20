import static org.junit.Assert.*;
import java.math.*;
import org.junit.Test;
public class CustomStringTest {

	@Test
	public final void testCustomString() {
		CustomString test = new CustomString();
		assertTrue("Postcondition of CustomString() not met!",
				test.getSize() == 0);
		assertTrue("Postcondition of CustomString() not met!",
				test.getCapacity() == CustomString.DEFAULT_CAP);
	}

	@Test
	public final void testCustomStringCharArray() {
		char tester[] = "testing".toCharArray();
		CustomString test = new CustomString(tester);
		assertTrue("Postcondition of CustomString(char[]) not met!",
				test.getSize() == tester.length);
		assertTrue("Postcondition of CustomString(char[]) not met!",
				test.getCapacity() == tester.length);
	}

	@Test
	public final void testToString() {
		String tester = "testing";
		CustomString test = new CustomString(tester.toCharArray());
		assertTrue("Postcondition of toString() not met!",
				test.toString().equals(tester));
	}

	@Test
	public final void testGetSize() {
		CustomString test = new CustomString();
		assertTrue("Postcondition of getSize() not met!",
				test.getSize() == 0);
	}

	@Test
	public final void testGetCapacity() {
		CustomString test = new CustomString();
		assertTrue("Postcondition of CustomString() not met!",
				test.getCapacity() == CustomString.DEFAULT_CAP);
		char tester[] = "tester".toCharArray();
		test = new CustomString(tester);
		assertTrue("Postcondition of CustomString() not met!",
				test.getCapacity() == tester.length);
	}

	@Test
	public final void testAppend() {
		CustomString test = new CustomString("test".toCharArray());
		CustomString test2 = new CustomString("testtest".toCharArray());
		test.append("test".toCharArray());
		assertTrue("Postcondition of CustomString() not met!" + test.toString() + " " + test2.toString(),
				test2.toString().equals(
					test.toString()));
	}

	@Test
	public final void testLength() {
		CustomString test = new CustomString();
		assertTrue("Postcondition of length() not met!",
				test.length() == 0);
		String someString = "test";
		assertTrue("Postcondition of length() not met!",
				test.length() == someString.length());
	}

	@Test
	public final void testIsEmpty() {
		CustomString test = new CustomString();
		CustomString test2 = new CustomString("n".toCharArray());
		assertTrue("Postcondition of length() not met!",
				test.isEmpty() && !test2.isEmpty());
	}
	@Test
	public final void testCharAt() {
		CustomString test = new CustomString("naboo".toCharArray());
		assertTrue("Postcondition of length() not met!",
				test.charAt(2) == 'b');

	}

	@Test
	public final void testEqualsObject() {
		CustomString test = new CustomString("naboo".toCharArray());
		Object obj = new Object();
		assertTrue("Postcondition of length() not met!" + String.valueOf(test.equals(obj)),
				!(!(test.equals(test)) || (test.equals(obj))) );
	}

	@Test
	public final void testEqualsIgnoreCase() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCompareTo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testStartsWith() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testEndsWith() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testIndexOf() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSubstring() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReplace() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testResize() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testContains() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToUpperCase() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToCharArray() {
		fail("Not yet implemented"); // TODO
	}

}
