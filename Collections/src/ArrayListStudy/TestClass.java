package ArrayListStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void main(String[] args) 
	{
		studentSet s1 = new studentSet(1,"Shubham",26);
		studentSet s2 = new studentSet(2,"Soham",27);
		studentSet s3 = new studentSet(3,"Gaurav",26);
		
		ArrayList<studentSet> list = new ArrayList<studentSet>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		studentSet st;
		/*
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			st = (studentSet)itr.next();
			System.out.println(st.rollno + ". " + st.name + " " + st.age +" years");
		}
		*/
		
		for(studentSet s : list)
		{
			System.out.println(s.rollno + ". " + s.name + " " + s.age +" years");
		}
	}

}
