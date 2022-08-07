
public class Temperature extends Conversion{
	Temperature(){
		super.setFirstUnit("Fahrenheit");
		super.setSecondUnit("Celcius");
	}
	public double convert(int number) {
		return (number-32)*(5/9);
	}
	public double revert(int number) {
		return number*(9/5)+32;
	}
}
