package factory.of.factory;

interface AbstractFactories {
	Mobile getMobile();

}

class IphoneFactory implements AbstractFactories {

	@Override
	public Mobile getMobile() {
		// TODO Auto-generated method stub
		return new Iphone();
	}

}

class SamsungFactory implements AbstractFactories {

	@Override
	public Mobile getMobile() {
		// TODO Auto-generated method stub
		return new Samsung();
	}

}

class MiFactory implements AbstractFactories {

	@Override
	public Mobile getMobile() {
		// TODO Auto-generated method stub
		return new Mi();
	}

}