package factory.of.factory;

public class TestAbstractfactory {

	public static void main(String args[]) {
		AbstractFactories afactory = new SamsungFactory();
		Mobile mymobile = MobileFactory.getMobileInstance(afactory);

		System.out.println(mymobile);
	}
}
