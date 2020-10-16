package com.sri.WeekFiveWork;

public class SpacedLogger implements Logger {
	
	//	***	Item 3b, 6, 7 & 8  of Week 5 Coding Assignment
	//	***	3.	Create two classes that implement the Logger interface
	//	***		b.	Error
	//	***	6.	The SpacedLogger should add spaces between each character of the String argument
	//	***		passed into its methods. 
	//	***	7.	If the log method received “Hello” as an argument, it should print H e l l o
	//	***	8.	The error method should do the same, but with “ERROR:” preceding the spaced out 
	//	***		input (i.e. ERROR: H e l l o)
	
	public void spaceAdd(String error) {

		StringBuilder gather = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
		   if (i > 0) {
			   if (i == error.length()) 
			    	  break;
		      gather.append(" ");
		    }

		   gather.append(error.charAt(i));
		}
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** Output form SpacedLogger Class which implements Logger interface          *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		
		System.out.println(gather.toString());
		System.out.println();		
		System.out.println();		
	}

	public void errorSpaceAdd(String error) {

		StringBuilder gather = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
		   if (i > 0) {
		      if (i == error.length()) 
		    	  break;
		      gather.append(" ");
		    }
		   gather.append(error.charAt(i));
		}

		System.out.println("ERROR: " + gather.toString());
	}
	@Override
	public void asteriskAdd(String log) {
		
	}
	@Override
	public void errorAdd(String log) {
		
	}
}
