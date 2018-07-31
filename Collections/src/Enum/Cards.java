package Enum;

public enum Cards {

	ACE("4"),
	JACK("3"),
	QUEEN("2"),
	KING("1");




private String value;
private Cards(String value)
{
	this.value = value;
}
}
