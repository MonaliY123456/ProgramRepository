package scp.builder.com;

import scp.builder.com.Person.PersonBuilder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = p.new PersonBuilder("MisalPav", "aadvetitve").setEntertainment("Watching TV").build();

		System.out.println(p);
	}

}
