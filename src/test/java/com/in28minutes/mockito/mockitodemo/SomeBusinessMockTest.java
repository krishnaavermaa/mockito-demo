package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void findTheGreatest() {
		
		//fail("Not yet implemented");
		DataService dataServiceMock= mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		SomeBusinessClass businessClass=new SomeBusinessClass(dataServiceMock);
		int result=businessClass.findTheGreatest();
		assertEquals(24, result);
	}

}