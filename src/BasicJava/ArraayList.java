package BasicJava;

import java.util.ArrayList;

public class ArraayList {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Sriram");
		al.add(1234);
		al.add(true);
		al.add(12.22);
		al.add(null);
		System.out.println(al);
		al.add("i will add at last");
		System.out.println(al);
		al.remove(2); //removes the 2nd  index element 
		System.out.println(al);
		System.out.println(al);
		
		
		
	}

}
