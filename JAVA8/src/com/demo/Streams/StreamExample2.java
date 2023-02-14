package com.demo.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
	   List<Integer> ls = Arrays.asList(23,57,54,8,76);
	
	
		/*
		 * int max= ls.get(0);
		 * 
		 * System.out.println(ls.size()); for(int i = 1; i<ls.size();i++) {
		 * if(ls.get(i)>max) { max=ls.get(i); } }
		 * 
		 * 
		 * System.out.println(max);
		 */	
	//List<Integer> result=ls.stream().filter(x->x%2!=0).collect(Collectors.toList());
	//List<Integer> result=ls.stream().distinct().collect(Collectors.toList());
	//Integer result=ls.stream().reduce(0, (x,y)-> x>y ?x:y);
	   //Optional<Integer> result=ls.stream().reduce((x,y)-> x>y ?x:y);
	   //Optional<Integer> result = ls.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	   Integer result = ls.stream().max(Integer::compare).get();
	   System.out.println(result);
	}
}