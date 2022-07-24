public class ICICIBank extends GeneralBank {

	@Override
	public double getSavingInterestRate() {//get value from 1 class to another class
		return 4.0;
	}

	@Override
	public double getFixedInterestRate() {
		return 8.5;
	}

}
