package Notations;

import java.util.ArrayList;
import java.util.List;

public class runClass 
{
	public static void main(String[] args) {
		findScale fs = new findScale();
		List<String> printResult = new ArrayList<>();
		printResult = fs.dorian();
		
		for(String s : printResult)
			System.out.println(s);
	}
}
