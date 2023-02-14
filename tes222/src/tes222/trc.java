package tes222;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class trc implements Comparable<List<Integer>> {

	public static void main(String[] args) {
		
		
		List<Integer> ls =  new ArrayList<Integer>();
		List<Integer> ev =  new ArrayList<Integer>();
		ls.add(5);
		ls.add(4);
		ls.add(1);
		
		for( Integer x: ls) {
			if(x%2==0) {
				ev.add(x);
			}
		}
		System.out.println(ev);
		
		 List<Integer> ev2= ls.stream().sorted().collect(Collectors.toList());

		     List<Integer> ev1  =ls.stream().filter(x->x%2==0).collect(Collectors.toList());
		     System.out.println(ev2);
	}

	

	@Override
	public int compareTo(List<Integer> o) {
		for (Integer integer : o) {
			(++integer).equals(integer);
			
		}
		return 0;
	}
	

}
