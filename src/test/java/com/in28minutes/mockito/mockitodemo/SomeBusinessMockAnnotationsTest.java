package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


//to be put mandatorily when using mockito annotations
@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessClass businessClass;
	
	@Test
	public void findTheGreatest() {
		
		//fail("Not yet implemented");
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		assertEquals(24, businessClass.findTheGreatest());
		
	}

	@Test
	public void findTheGreatestAgain() {
		
		//fail("Not yet implemented");
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3});
		assertEquals(3, businessClass.findTheGreatest());
		
	}
}