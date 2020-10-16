package com.sri.WeekFiveWork;

public interface Logger {
	
	//	***	Item 1 & 2  of Week 5 Coding Assignment
	// 	***	1.	Create an interface named Logger.
	//	***	2.	Add two void methods to the Logger interface, each should take a String as an argument
	//	***		a.	Log
	//	***		b.	Error

	public void asteriskAdd(String log);			
	public void errorAdd(String error);
	public void spaceAdd(String log);			
	public void errorSpaceAdd(String error);

}
