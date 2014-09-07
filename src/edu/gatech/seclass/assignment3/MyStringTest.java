package edu.gatech.seclass.assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStringTest {

	//Test Get Vowels
	// 1. Null String
	@Test
	public void testGetVowelsNULL() {
		
		MyString myStr = new MyString();
		String result = myStr.getVowels();
		
		assertEquals(null, result);
	}

	// 2. Empty String
	@Test
	public void testGetVowelsEmpty() {
		
		
		MyString myStr = new MyString();
		myStr.setString("");
		String result = myStr.getVowels();
		
		assertEquals("", result);
	}

	// 3. Test with string that has no vowels. hsdfncd
	@Test
	public void testGetVowelsNoVowels() {
		
		
		MyString myStr = new MyString();
		myStr.setString("hsdfncd");
		String result = myStr.getVowels();
		
		assertEquals("", result);
	}

	// 4. Test with apple orange violet blue. Another YOU. Eat It.
	@Test
	public void testGetVowels() {
		
		
		MyString myStr = new MyString();
		myStr.setString("apple orange violet blue. Another YOU. Eat It");
		String result = myStr.getVowels();
		
		assertEquals("aeoaeioeueAoeOUEaI", result);
	}

	//Test Get Substring
	// 1. Null String
	@Test
	public void testGetSubstringNULL() {
		
		MyString myStr = new MyString();
		String result = myStr.getSubstring(0, 10);
		
		assertEquals(null, result);
	}
	
	// 2. Empty String
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetSubstringEmpty() {
		
		MyString myStr = new MyString();
		myStr.setString("");
		myStr.getSubstring(0, 10);
	}

	// 3. Start less than 0
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetSubstringStartBefore() {
		
		MyString myStr = new MyString();
		myStr.setString("Hello World");
		myStr.getSubstring(-1, 10);
	}

	// 4. End longer than string length
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetSubstringEndAfter() {
		
		String str = "Hello World";
		MyString myStr = new MyString();
		myStr.setString(str);
		myStr.getSubstring(0,str.length()+1);
	}

	// 5. End before start
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetSubstringEndBeforeStart() {
	
		MyString myStr = new MyString();
		myStr.setString("Hello World");
		myStr.getSubstring(4,0);
	}

	// 6. qwertyqwerty start = 2 end = 9
	@Test
	public void testGetSubstring() {
		
		MyString myStr = new MyString();
		myStr.setString("qwertyqwerty");
		String result = myStr.getSubstring(2, 9);
		
		assertEquals("ertyqwe", result);
	}
	
	//Test Index Of
	// 1. Null String
	@Test
	public void testIndexOfNull() {
		
		MyString myStr = new MyString();
		int result = myStr.indexOf('B');
		
		assertEquals(-1, result);
	}
	
	// 2. Empty String
	@Test
	public void testIndexOfEmpty() {
		
		MyString myStr = new MyString();
		myStr.setString("");
		int result = myStr.indexOf('B');
		
		assertEquals(-1, result);
	}
	
	// 3 SdjhBWed with h = 3
	@Test
	public void testIndexOf() {
		
		MyString myStr = new MyString();
		myStr.setString("SdjhBWed");
		int result = myStr.indexOf('B');
	
		assertEquals(4, result);
	}

	//Test Remove Char
	// 1. Null String
	@Test
	public void testRemoveCharNULL() {
		
		MyString myStr = new MyString();
		
		myStr.removeChar('f');
		String result =  myStr.getString();
		
		assertEquals(null, result);
	}

	// 2. Empty String
	@Test
	public void testRemoveCharEmpty() {
		
		MyString myStr = new MyString();
		
		myStr.setString("");
		myStr.removeChar('f');
		String result =  myStr.getString();
		
		assertEquals("", result);
	}
	
	// 3. test Hello World with l
	@Test
	public void testRemoveChar() {
		
		MyString myStr = new MyString();
		
		myStr.setString("Hello World");
		myStr.removeChar('l');
		String result =  myStr.getString();
		
		assertEquals("Heo Word", result);
	}
	
	//Test Invert
	// 1. Null String
	@Test
	public void testInvertNULL() {
		
		MyString myStr = new MyString();
		myStr.invert(); 
		String result = myStr.getString();
		
		assertEquals(null, result);
	}
	
	// 2. Empty String
	// 3. qwerty
	@Test
	public void testInvertEmpty() {
		
		MyString myStr = new MyString();
		myStr.setString("");
		myStr.invert(); 
		String result = myStr.getString();
		
		assertEquals("", result);
	}
	
	// 3. qwerty
	@Test
	public void testInvert() {
		
		MyString myStr = new MyString();
		myStr.setString("qwerty");
		myStr.invert(); 
		String result = myStr.getString();
		
		assertEquals("ytrewq", result);
	}
}
