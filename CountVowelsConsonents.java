
//	Question= Count the vowels and consonents from given string

package com.prowings.stringclassdemo;

public class CountVowelsConsonents {
	

	
	public CountVowelsConsonents() {
		
	}

	public static void countVowelsConsonents(String  s)
	{
		
		
		int vowelCount=0;
		
		int consonentCount=0;
		
		s=s.toLowerCase();
		
		for(int i=0; i<s.length();i++)
		{
		char resultedChar=s.charAt(i);
		
		if( resultedChar >='a' &&  resultedChar <= 'z')
		{
			if  (resultedChar == 'a' ||  resultedChar== 'e'|| resultedChar=='i' ||
					 resultedChar =='o' ||  resultedChar=='u')
				
				vowelCount ++;
			else 
				
				 consonentCount++;
			System.out.println("total vowels is:"+ vowelCount);
			System.out.println("total consonenta is:"+ consonentCount);
				
		}
		}
	}
	
	public static void main(String[] args) {
		
		String input="I love my country";
		
		countVowelsConsonents(input);
		
		//output:
//		total vowels is:1
//		total consonenta is:0
//		total vowels is:1
//		total consonenta is:1
//		total vowels is:2
//		total consonenta is:1
//		total vowels is:2
//		total consonenta is:2
//		total vowels is:3
//		total consonenta is:2
//		total vowels is:3
//		total consonenta is:3
//		total vowels is:3
//		total consonenta is:4
//		total vowels is:3
//		total consonenta is:5
//		total vowels is:4
//		total consonenta is:5
//		total vowels is:5
//		total consonenta is:5
//		total vowels is:5
//		total consonenta is:6
//		total vowels is:5
//		total consonenta is:7
//		total vowels is:5
//		total consonenta is:8
//		total vowels is:5
//		total consonenta is:9
//
//		
//		
//		
		
		
	}
}


	
