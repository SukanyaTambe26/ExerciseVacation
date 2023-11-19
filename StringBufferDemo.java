package com.prowings.stringclassdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s="Hello";//immutable
		System.out.println(s);
		
		s=s.concat("word");//make new objecct as string is immutable
		System.out.println(s);
				
		StringBuffer sb=new StringBuffer("hello");//mutable
		sb.append("word");//does not change reference like string as it is mutable,, make change in original
		System.out.println(sb);
		
		System.out.println("length:"+sb.length());
		System.out.println("capacity:"+sb.capacity());//by bdefault capacity is 21
		
		
		StringBuilder sbd=new StringBuilder("hello");//mutable
		sbd.append("word");
		System.out.println(sbd);
		
		

	}

}
