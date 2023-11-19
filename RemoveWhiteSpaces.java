//question:- remove white spaces from given string:


package com.prowings.stringclassdemo;

public class RemoveWhiteSpaces {
	
	static String s= "India is my country";
	static String result;
	
	public static String removeWhiteSpaces(String s)
	{
//		result=s.replace(" ","");
		result=s.replaceAll(" ","");
		
		return result;
		}

	
	public static void main(String[] args) {
		
	removeWhiteSpaces("India is my country");
		System.out.println("resulted String is:"+ result);
		
	}
}

//output is:
//resulted String is:Indiaismycountry
