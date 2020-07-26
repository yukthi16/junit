package com.epam.junit;
import static org.junit.Assert.*;

import org.junit.Test;
public class JunitTest {
RemoveA obj = new RemoveA();
	
	@Test
	public void testEmptyString() {
		assertEquals("",obj.remove(""),"Executed Successfully");
	}
	public void testSingleCharacterA() {
		assertEquals("C",obj.remove("C"),"Executed Successfully");
		assertEquals("",obj.remove("A"),"Executed Successfully");
		assertEquals("HBA",obj.remove("HB"),"Executed Successfully");
	}
	
	public void testStringTwoCharactersA() {
		assertEquals("CB",obj.remove("CB"),"Executed Successfully");
		assertEquals("",obj.remove("AA"),"Executed Successfully");
		assertEquals("C",obj.remove("AC"),"Executed Successfully");
		assertEquals("z",obj.remove("CA"),"Executed Successfully");
	}
	public void testStringWithNCharacterA() {
		assertEquals("CBGFA",obj.remove("ACBGFA"),"Executed Successfully");
		assertEquals("BAC",obj.remove("AABAC"),"Executed Successfully");
		assertEquals("SDFVCA",obj.remove("SDFVCA"),"Executed Successfully");
		assertEquals("BGHS",obj.remove("AABGHS"),"Executed Successfully");
	}
}
