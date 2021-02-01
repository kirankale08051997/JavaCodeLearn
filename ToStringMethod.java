package JavaScratch;

public class ToStringMethod {
	
	 String Name;
	 int Age;
	 String OrganizationName;
	 double Temprature;
	 
	 public ToStringMethod(String Name, int Age, String OrganizationName, double Temprature)
    { 
		 this.Name = Name;
		 this.Age = Age;
		 this.OrganizationName = OrganizationName;
		 this.Temprature = Temprature;
	}
	
	  public String getName() { return Name; }
	 
	 public int getAge() { return Age; }
	  
	 public String getOrganizationName() { return OrganizationName; }
	 
	 public double getTemprature() { return Temprature; }
	 
	 

		  @Override 
		  public String toString() 
		  {
		  return ("Name is: \n" + getName()+"\n" + getAge()+ "\n"+ getOrganizationName()+ "\n"+getTemprature());
		  }
	public static void main(String[] args) {
		ToStringMethod tostring = new ToStringMethod("Kiran",24,"Amdocs",52.23);
	    System.out.println(tostring);
	}

}
