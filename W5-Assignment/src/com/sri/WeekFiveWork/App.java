package com.sri.WeekFiveWork;

public class App {

	public static void main(String[] args) {
		

		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** Week 5 Coding Assignment - Interfaces Implementation                        *** ***");
		System.out.println("*** Student: SRI SRINIVASAN                                                     *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		

		
		//	***	Item 9, 10 & 11 of Week 5 Coding Assignment
		// 	***	9.	Create a class named App that has a main method.
		//	***	10.	In this class instantiate an instance of each of your logger classes 
		//	***		that implement the Logger interface.
		//	***	11.	Test both methods on both instances, passing in Strings of your choice.

		
		Logger log = new AsteriskLogger();

       	log.asteriskAdd("Greetings");
      	log.errorAdd("Ouch");
      	
       	Logger error = new SpacedLogger();
       	
       	error.spaceAdd("Everest");
       	error.errorSpaceAdd("Masterpieces");

	}

}
