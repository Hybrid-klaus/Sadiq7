import java.util.*;  
class HashSet8{  
 public static void main(String args[]){  
    HashSet<String> set=new HashSet<String>();  
           set.add("emp1");    
           set.add("emp2");    
           set.add("emp3");     
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  //Unordered
           }
           List<String> set1 = new ArrayList<String>(set);
           Collections.sort(set1);//for ordered
           System.out.println(set1); 
 }  
}  
