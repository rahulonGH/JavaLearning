package git.Learning;

interface Bank{
	double InterestRateCalculator();
}
class SBI implements Bank{

	@Override
	public double InterestRateCalculator() {
		return 10;
	}
	
}
class BOI implements Bank{

	@Override
	public double InterestRateCalculator() {
		return 8;
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
	}

}
