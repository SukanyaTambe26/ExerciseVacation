package com.prowings.stringclassdemo;

public class ConversionsIString {

	public static void main(String[] args) {
		
		//object or primitive to String
		
		int n = 10;
		String number = String.valueOf(n);
        String num = "10";
System.out.println(number);
System.out.println(number == num);// makes new string
		boolean res = true;
		String res2 = "true";
        String convertedRes = String.valueOf(res);
        System.out.println(convertedRes);
        Student s=new Student(10,"ram","pune");
		String student=String.valueOf(s);
		 System.out.println(student);
		 char[] chars = { 'h', 'e', 'l', 'l', 'o' };
        String data = String.valueOf(chars);
		System.out.println(data);
     	String data2 = String.valueOf(chars, 2, 3);//method on array
		System.out.println(data2);
		
		
		
		//String to primitive
		
		int convetredNum=Integer.parseInt(num);
		System.out.println(convetredNum+5);//TO Ccheck is converted into primitive,,,if this is String output is "10"5; but if primitive then output is 15;
	}
}
