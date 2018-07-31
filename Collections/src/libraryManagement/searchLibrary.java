package libraryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class searchLibrary 
{

	Map<Tag,Books> mp = new HashMap<Tag,Books>();
	ArrayList<Tag> arg0 = new ArrayList<Tag>();
	ArrayList<Books> arg1 = new ArrayList<Books>();
	
	public static void main(String args[])
	{
		System.out.println("***********Library Management System*************");
		System.out.println("1. Add a book");
		System.out.println("2. Issue a book");
		System.out.println("3. Return a book");
		System.out.println("4. Print Book Details");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				addBook();
			case 2 :
				issueBook();
			case 3:
				returnBook();
			case 4:
				bookDetails();
			default:
				System.out.println("Wrong entry !");
				
		}
	}

	private static void bookDetails() 
	{
		
	}

	private static void returnBook() 
	{
		
	}

	private static void issueBook() 
	{
		
	}

	private static void addBook() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name : ");
		String bookName = sc.nextLine();
	}
}
