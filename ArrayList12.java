import java.util.List;
import java.util.ArrayList;

class MyArrayList<e> extends ArrayList<e>
{
	public boolean add(e e1)//This method is used to append an element to a ArrayList.
	{
		if(e1 instanceof Integer||e1 instanceof Float|| e1 instanceof Double)//check whether an object is an instance of a particular class or not.
		{
			super.add(e1);
			return true;
		}
		else
		{
			throw new ClassCastException("other datatypes are not supported");
		}
	}
}
public class ArrayList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Object> list = new MyArrayList<>();
		
		try {
			list.add(10);
			list.add(1.1F);
			list.add(5.50D);
		//	list.add("hello");
		} catch (Exception e) {
			e.printStackTrace();//it give details about the excep occurred 	
		}
		
		System.out.println(list);
	}

}
