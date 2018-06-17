package factory.of.factory;

public abstract class Mobile {
	public abstract boolean isBluetoothAvailable();

	public abstract int getPrice();

	public abstract long imei();

	@Override
	public String toString() {
		return "Mobile [isBluetoothAvailable()=" + isBluetoothAvailable() + ", getPrice()=" + getPrice() + ", imei()="
				+ imei() + "]";
	}

}

class Iphone extends Mobile {

	@Override
	public boolean isBluetoothAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public long imei() {
		// TODO Auto-generated method stub
		return 1111111;
	}

}

class Samsung extends Mobile {

	@Override
	public boolean isBluetoothAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 250000;
	}

	@Override
	public long imei() {
		// TODO Auto-generated method stub
		return 222222;
	}

}

class Mi extends Mobile {

	@Override
	public boolean isBluetoothAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 200001;
	}

	@Override
	public long imei() {
		// TODO Auto-generated method stub
		return 3333333;
	}

}

class MobileFactory {

	public static Mobile getMobileInstance(AbstractFactories afactory) {
		return afactory.getMobile();

	}
}
