import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MTest {

	public static void main(String[] args) {
		Predicate<Integer> i =t->t%2!=0;
		List<Integer> I = Arrays.asList(1,45,6,4);
		List<Integer> I1=   I.stream().filter(i).collect(Collectors.toList());
		System.out.println(I1);
	}
	
			
			


}
