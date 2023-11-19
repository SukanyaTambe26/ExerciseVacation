//question: replace with character


package com.prowings.stringclassdemo;

public class ReplaceWithCharacter {
	
	
	public ReplaceWithCharacter() {
	
	}


  public static String replaceWithNewCharacter (String s)
	{
	return s.replace("S","B");
	}
		

	
	public static void main(String[] args) {
		
		 String input="Shivani";
		 	
		
		System.out.println("new resulted string is:" +  replaceWithNewCharacter(input));
		
		
		
		}
}

//output:new resulted string is:Bhivani