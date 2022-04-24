package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		SomeBusinessClass businessClass=new SomeBusinessClass(new DataServiceStub());
		int result=businessClass.findTheGreatest();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24,6,16};
	}
	
	
}