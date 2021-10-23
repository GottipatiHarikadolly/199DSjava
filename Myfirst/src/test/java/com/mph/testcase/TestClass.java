package com.mph.testcase;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("Rahul");
		String str2 = new String("Rahul");
		String str3 =null;
		String str4="deeps";
		String str5="deeps";
		
		
		int val1=5;
		int val2=6;
		
		String[] arr1={"one","two","three"};
		String[] arr2={"one","two","three"};
		
		//assertEquals(str4, str5);
		//assertSame(str4, str3);
		//assertNotSame(str1, str2);
		//assertTrue(val1>val2);
		//assertFalse(val1<val2);
		//assertNotNull(str3);
		assertArrayEquals(arr1, arr2);
		
	}

}