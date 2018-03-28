package com.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import com.demo.ComputeService;
import com.demo.ICompute;

public class ComputeServiceTest {
	
	ComputeService service;
	
	@Before
	public void setup() {
		ICompute ic = mock(ICompute.class);
		when(ic.add(75, 50)).thenReturn(125);
		service  = new ComputeService();
		service.setComp(ic);
	}

	@Test
	public void testAddNumbers() {
		assertEquals(service.addNumbers(75, 50), 125);
	}
	
	@Test
	public void testAddNumbers2() {
		assertEquals(service.addNumbers(60, 65), 125);
	}

}
