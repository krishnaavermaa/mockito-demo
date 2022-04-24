package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessClass {
	
	public SomeBusinessClass(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	private DataService dataService;
	
	int findTheGreatest() {
		int [] data=dataService.retrieveAllData();
		int greatest=Integer.MIN_VALUE;
		
		for(int value:data) {
			if(value>greatest) {
				greatest=value;
			}
		}
		return greatest;
	}
}