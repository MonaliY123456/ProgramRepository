package scp.builder.com;

public class Person {

	public Person(PersonBuilder personBuilder) {
		//super();
		this.eating=personBuilder.eating;
		this.Sleeping=personBuilder.Sleeping;
		this.walking=personBuilder.walking;
		this.Entertainment=personBuilder.Entertainment;
		
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	String eating;
	String Sleeping;   //mandatory
	String walking;
	String Entertainment;
	@Override
	public String toString() {
		return "Person [eating=" + eating + ", Sleeping=" + Sleeping + ", walking=" + walking + ", Entertainment="
				+ Entertainment + "]";
	
	
	
	
	}
   class  PersonBuilder
   {
	   String eating;
	   String Sleeping;
	   String walking;
	   String Entertainment;
	   
	   
	public PersonBuilder(String eating, String sleeping) {
		super();
		   this.eating = eating;
           this.Sleeping = sleeping;
		}
	   public PersonBuilder setwalking(String walk)
	   {
		   this.walking=walk;
		return this;
		   
	   }
	   public PersonBuilder setEntertainment(String entertain )
	   {
		   this.Entertainment=entertain;
		   return this;
	   }
	   public Person build()
	   {
		   return new Person(this);
	   }
   }
   
   
}
