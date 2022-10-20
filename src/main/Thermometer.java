package main;

public class Thermometer {
	public Thermometer() {

	}

	public double f(double i) {
		double c = i*1.8+32;
		return c;
	}
	
	public double k(double i) {
		double c = i+273.15;
		return c;
	}
}
