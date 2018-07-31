package Enum;

public class EnumDemo {

	public static void main(String[] args) {
		int offset = 10; 
		System.out.println(Cards.KING.ordinal()+offset);
		System.out.println(Cards.QUEEN.ordinal()+ offset);
	}

}
