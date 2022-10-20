package main;

public class Measure {
	public Measure() {
		
	}
	
	public double mm(double i) {
		double c = i*10;
		return c;
	}
	
	public double m(double i) {
		double c = i*0.01;
		return c;
	}
	
	public double km(double i) {
		double c = i*0.00001;
		return c;
	}
	
	public double in(double i) {
		double c = i*0.3937007874;
		return c;
	}
	
	public double ft(double i) {
		double c = i*0.032808399;
		return c;
	}
	
	public double yd(double i) {
		double c = i*0.010936133;
		return c;
	}
	
	public double mi(double i) {
		double c = i*0.0000062137;
		return c;
	}
}
