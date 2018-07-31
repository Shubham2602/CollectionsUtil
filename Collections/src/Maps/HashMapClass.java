package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass 
{

	static int key = 0;
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Apple");
		hm.put(2, "Ball");
		hm.put(3, "Cat");
		hm.put(4, "Dog");
		hm.put(5, "Eagle");
		
		System.out.println("Size is : " + hm.size());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key : ");
		key = sc.nextInt();
		
		
		System.out.println("Corresponding Value is : " + hm.get(key));
		
		HashMapClass hmap = new HashMapClass();
		hmap.Output(hm, key);
	}
	public void Output(HashMap<Integer,String> hm,int key)
	{
		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			int j = entry.getKey();
			
			if(j==key)
				System.out.println("Corresponding value is : " + entry.getValue() + " 	Hashcode : " + entry.getValue().hashCode());
			
		}
	}

}
