package scp.singleton.com;

public class TestStudentSingleton {

	public static void main(String[] args) {
		Student s1=Student.getInstance();
		Student s2=Student.getInstance();
		System.out.println("eager ");
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
		
		Studentstatic obj1=Studentstatic.getInstance();
		Studentstatic obj2=Studentstatic.getInstance();
		System.out.println("static");
		System.out.println(obj1);
		System.out.println(obj2);
		
		StudentLazy obj3=StudentLazy.getInstance();
		StudentLazy obj4=StudentLazy.getInstance();
		System.out.println("Lazy initialization");
		System.out.println(obj3==obj4);
		System.out.println(obj3);
		
		System.out.println("thradsafe singleton");
		Studentthreadsafe obj5=Studentthreadsafe.getInstance();
		Studentthreadsafe obj6=Studentthreadsafe.getInstance();
		System.out.println(obj5==obj6);
		System.out.println(obj5);
		
		System.out.println("in innerclass");
		Studentbillpugh obj7=Studentbillpugh.getInstance();
		Studentbillpugh obj8=Studentbillpugh.getInstance();
		System.out.println(obj7==obj8);
	}

}
