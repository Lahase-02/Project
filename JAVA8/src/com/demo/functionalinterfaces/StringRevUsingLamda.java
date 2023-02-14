package com.demo.functionalinterfaces;

import java.util.function.Function;

public class StringRevUsingLamda {

	static Function<String, String> rev=(str)->{
		String t ="";
		for(int i = str.length()-1;i>=0;i--) {
			t+=str.charAt(i);
		}
		return t;
		};
		
		
	
	
	public static void main(String[] args) {
		 String r= "ram";
		    String re = rev.apply(r);
		    System.out.println(re);

	}


}