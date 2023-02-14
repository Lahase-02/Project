package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		String S ="mahesh";
		
		  char[] a=S.toCharArray();
		  
		  for(int i = a.length-1;i>=0;i-- ) {
			  char b =a[i];
			  String p =new String() ;
			  
			  
			  System.out.println(p);
		  }
		  
		  char[] charArray = "Aniruddh".toCharArray();
		    IntStream.range(0, charArray.length)
		        .mapToObj(i -> charArray[(charArray.length - 1) - i])
		        .forEach(System.out::print);
		  
		List<String>  list3 =Arrays.asList("y");
		List<String>  list =Arrays.asList("yogesh","mahesh","ram","sham","yogesh","ammaya");
		//list.stream().filter(s->s.length()>5).forEach(System.out::println);
		List<String>  list1 =    list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		List<String>  Sortlist1= list.stream().sorted().collect(Collectors.toList());
	System.out.println(Sortlist1);
	//List<String>  list6 =  list.stream().anyMatch(va->{return va.startsWith("yo")};);
			
	  list.stream().anyMatch(va->{return va.startsWith("yo");});
	
	  List<String>  list6 =  list.stream().filter(vi->vi.contains("yo")).toList();
	Stream<String>r =list3.stream();
	Stream<String>ra =list6.stream();
		List<String>  list10=Stream.concat(r, ra).collect(Collectors.toList());
		//List<String>  Sortlist1= list.stream().
	System.out.println(list10);
	
	
	
 

}
}
