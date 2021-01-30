package java_practice;

public class Human {
	
	String name;
	double HightInches;
	String eyeclour;
	int age;
	char FavoriteSymbol;
	
	public Human() {}  //constructor Human which has same name as class name , NO need to declare always as it is
	                   // by default present in class where constructor does not defined
	
	public void Activity() {
		System.out.println("Human have unique "  + name);
		System.out.println("i have " + HightInches  + "tall");
		System.out.println("i have eyecoulur as " + eyeclour);
		System.out.println("my age is " + age);
		System.out.println("i found of symbol which is " + FavoriteSymbol);
	    System.out.println("Humans can swim...");
	    System.out.println("human can eat.....");
	    System.out.println("hummans can run");
	}

}
