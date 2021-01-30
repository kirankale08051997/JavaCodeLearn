package OopConcept;

public class Birds extends Animals {
	
	public Birds(String AnimalName, String Colour, double AnimalWeight, int AnimalLegs) {
		super(AnimalName, Colour, AnimalWeight, AnimalLegs);
		
	}

	public String BirdPicking()
	{
		String[] AnimalHub = new String[] {"Tiger","Elephant","Fox","Parot"};
	    
		System.out.println("flying the birds ");
		System.out.println(AnimalName + Colour + AnimalWeight + AnimalLegs);
		return AnimalHub[3];
	}
	    
	}


 