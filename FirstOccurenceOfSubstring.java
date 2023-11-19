package com.prowings.stringclassdemo;

public class FirstOccurenceOfSubstring {
	
	public static int findOccurenceOfSubstring(String original, String target)
	{
		int indexOfTargetString=original.indexOf(target);
		
		System.out.println("occurence of target substring is: " +  indexOfTargetString);
		
		return indexOfTargetString;
		
		
		
	}
	
	public static void main(String[] args) {
		
		String original="Welcome to india";
		
		String target="india";
		
		findOccurenceOfSubstring(original,target);
		
		
		
	}

}
