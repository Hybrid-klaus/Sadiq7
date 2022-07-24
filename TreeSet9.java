import java.util.*;
;

public class TreeSet9{  
public static void main(String args[]){  
		  
	  TreeSet<String> al=new TreeSet<String>();    
		 al.add("jan");  
		 al.add("feb");  
		 al.add("march");  
	     al.add("April");  
		 al.add("may");  
		 al.add("june");  
		 al.add("july");  
	     al.add("aug");  
		 al.add("sep");  
		 al.add("oct");  
		 al.add("nov");  
	     al.add("dec");  
	     System.out.println("TreeSet elements: ");
	     Iterator<String> i=al.iterator();  
	     while(i.hasNext()){  
	      System.out.println(i.next()); 
		  }  
}
}