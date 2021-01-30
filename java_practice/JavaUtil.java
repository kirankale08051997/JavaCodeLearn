package java_practice;

public class JavaUtil { 
	public static String ProductInfo()
	{
	
		String[] ProductBucket = new String[]{"internetplan","Tv offer","Mobile Offer"};
		return ProductBucket[0];
	}
	public static void ProductOrders(int argument)
	{
		int k = argument + 100;
		if(k<150)
			System.out.println("Multplay Bundle");
		else
			System.out.println("nothing");
 }
	public static String Vodafone(String Sus)
	{
		String var = Sus + "I learned to JAVA CODE****";
	return var;
	}
	public void Addition(int z)
	{
		int count = z + 89;
		
		System.out.println(count);
		
	}
}