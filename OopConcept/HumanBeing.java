package OopConcept;

public class HumanBeing extends Birds {

	public HumanBeing(String AnimalName, String Colour, double AnimalWeight, int AnimalLegs) {
		super(AnimalName, Colour, AnimalWeight, AnimalLegs);
		
	}

	public void Being() 
	{
		int i,k=5;
		for(i=0;i<k-1;i++)
		{
			System.out.println("*");
		}
}
}