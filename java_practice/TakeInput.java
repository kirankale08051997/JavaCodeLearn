package java_practice;
import java.util.Scanner;   // Added Scanner library to use Scanner class

public class TakeInput {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);    // Created Scanner class object
		
		System.out.println("Name of Person: ");
		
		String PersonName = sc.next();           // sc.next() used for String input
		
		System.out.println("name: " + PersonName);
		
		System.out.println("Age");          // sc.nextInt() used for Integer input
		
		int age = sc.nextInt();
		
		System.out.println("Age: " + age);
		
		System.out.println("Gender: ");
		
		char g = sc.next().charAt(0);
		
		System.out.println("Gender: " + g);
		
		sc.close();
}
}
