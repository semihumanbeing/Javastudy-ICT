package myutil;

public class BasicCalculationImpl implements BasicCalculation {

	@Override
	public int plus(int a, int b) {
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}

	@Override
	public int getMinimumNumber() {
		return 1;
	}
	
	

}
