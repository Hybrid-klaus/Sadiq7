import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>set=new TreeSet<>();// Creating a Set interface with reference to treeset
		set.add("A");
		set.add("B");
		set.add("C");
		
		Iterator<String>it=set.iterator();
		String s="D";
		boolean res=false;
		
		while(it.hasNext()) {
			if(it.next().equals(s)) {
				res=true;
				break;
			}
		}
		if(res)System.out.print(s+"is exits");else
		System.out.print(s+"is not exist");

	}

}
