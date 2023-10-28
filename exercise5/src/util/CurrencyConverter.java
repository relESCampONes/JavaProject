package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollar, double value) {
		return dollar * value * (IOF + 1);
	}
}

