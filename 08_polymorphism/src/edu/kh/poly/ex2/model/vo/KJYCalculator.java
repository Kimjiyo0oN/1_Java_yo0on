package edu.kh.poly.ex2.model.vo;

public class KJYCalculator implements Calculator{

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum = num1+num2;
		return sum;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		
		return num1-num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public double divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1/(double)num2);
	}

	@Override
	public double areaOfCircle(double r) {
		// TODO Auto-generated method stub
		return r*r* Calculator.PI;
	}

	@Override
	public double pow(double a, int b) {
		// TODO Auto-generated method stub
		//Math.pow(a,b);
		double result =a;
		for(int i=1 ; i < b; i++ ) {
			 result *=a;
		}
		return result;
	}

}
