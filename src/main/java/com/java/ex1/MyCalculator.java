package com.java.ex1;

public class MyCalculator {

	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
	}
	
	public void add() {
		if(calculator.addition(firstNum, secondNum) ==10) {
			
		};
		 calculator.addition(firstNum, secondNum);
	}

	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mult() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
}
