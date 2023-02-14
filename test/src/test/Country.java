package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
public class Country  {

//	public String toString() {
	//	return "Country [name=" + name + "]";
	//}
public String name;
@Override
public int hashCode() {
	return 31;


}
@Override
public boolean equals(Object obj) {
return true;
}
public static void main(String args[]) {
	
Country countryOne = new Country();
Country countryTwo = new Country();
Country countryTh = new Country();
countryOne.name = "India";
countryTwo.name = "wepal";
countryTh.name ="mahesh";

	
	Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();


List<Country> ls = Arrays.asList(new Country("India"),new Country("India121"));

HashSet<Country> countrySet = new HashSet<>();
countrySet.add(countryOne);
 countrySet.add(countryTwo);
 countrySet.add(countryTh);
System.out.println(countrySet.size());
//Iterator itr = countrySet.iterator();

//while (itr.hasNext()) {
   // System.out.println(itr.next());
//}


}
public Country(String name) {
	super();
	this.name = name;
}
@Override
public String toString() {
	return "Country [toString()=" + super.toString() + "]";
}
}



