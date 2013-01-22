package com.wondersgroup.avenue.reflect;

import static org.junit.Assert.*;

import org.junit.Test;

public class OfficeTest {
	
	@Test
	public void testSuiteName(){
		Office o = new Word();
		assertEquals("Microsoft Office Word",o.getSuiteName());
		Office c = new Excel();
		assertEquals("Microsoft Office Excel",c.getSuiteName());
	}
	
	@Test
	public void testOfficeLoader() throws ClassNotFoundException, Exception{
		String word = "com.wondersgroup.avenue.reflect.Word";
		String excel = "com.wondersgroup.avenue.reflect.Excel";
		assertEquals("Microsoft Office Excel",OfficeLoader.getSuiteName(excel));	
	}

	private void asssertEquals(String string, String suiteName) {
		// TODO Auto-generated method stub
		
	}

}
