package OopConcept;

public class Animals {
	
	String AnimalName,Colour;
	double AnimalWeight;
	int    AnimalLegs;
	
	
	public Animals(String AnimalName, String Colour, double AnimalWeight, int AnimalLegs)
	{
	     this.AnimalName = AnimalName;
	     this.Colour = Colour;
	     this.AnimalWeight = AnimalWeight;
	     this.AnimalLegs = AnimalLegs;     
	}
	
	public void Info()
	{
		System.out.println(AnimalName  +Colour  +AnimalWeight  +AnimalLegs);
	}
	
	public void Eat()
	{
		System.out.println("eating...");
	}
	
	
	}
		

