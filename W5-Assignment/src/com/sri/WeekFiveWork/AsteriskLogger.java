package com.sri.WeekFiveWork;

public class AsteriskLogger implements Logger {
	
	//	***	Item 3a, 4 & 5  of Week 5 Coding Assignment
	//	***	3.	Create two classes that implement the Logger interface
	//	***		a.	AsteriskLogger
	//	***	4.	The log method on the AsteriskLogger should print out the String it receives between 3 
	//	***		asterisks on either side of the String (e.g. if the String passed in is “Hello”, then
	//	***		it should print ***Hello*** to the console.
	//	***	5.	The error method on the AsteriskLogger should print the String it receives inside a box
	//	***		of asterisks, with the String preceded by the word “ERROR:”.a.	AsteriskLogger

	
	public void asteriskAdd(String log) {
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** Output form AsteriskLogger Class which implements Logger interface          *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		
        System.out.println("***" + log + "***");
		System.out.println();		
		System.out.println();		

    }
    
    public void errorAdd(String log) {
        System.out.println("****************************");
        System.out.println("***    ERROR! " + log + "      ****");
        System.out.println("****************************");
		System.out.println();		
		System.out.println();		

    }

	@Override
	public void spaceAdd(String log) {
		// this method is not used.
	}

	@Override
	public void errorSpaceAdd(String log) {
		// this method is not used
	}


}
