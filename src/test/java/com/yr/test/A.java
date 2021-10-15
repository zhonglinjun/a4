package com.yr.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A {

	@Test
	public void aa()
	{
		System.out.pritnln(1);
		assertEquals(1, 1);
	}
	
	@Test
	public void bb()
	{
		assertEquals(1, 2);
	}
	
	
	@Test
	public void cc()
	{
		assertEquals(1, 2);
	}
}
