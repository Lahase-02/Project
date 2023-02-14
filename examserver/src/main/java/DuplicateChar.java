
public class DuplicateChar {

	public static void main(String[] args) {
		 String s = "rrrrmmat";
		 
		  char t[]=s.toCharArray();
		 
		 for(int i = 0;i<s.length();i++) {
			 
			 for(int j =i+1; j<s.length();j++) {
				 if(t[i]==t[j]) {
					 System.out.println( t[j]);
						break;
					
				 }
			
		 }
		 

	}

}
}
