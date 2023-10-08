package com.itacademy.java_classes.threads3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Numbers numbers = new Numbers(10,5,9);
		
		Formula1 formula1 = new Formula1(numbers);
		Formula2 formula2 = new Formula2(numbers);
		Formula3 formula3 = new Formula3(numbers);
		Formula4 formula4 = new Formula4(numbers);
		Formula5 formula5 = new Formula5(numbers);
		Result result = new Result();
		
		formula1.start();
		formula2.start();
		formula3.start();
		formula4.start();
		formula5.start();
		
		formula1.join();
		formula2.join();
		formula3.join();
		formula4.join();
		formula5.join();
		
		result.start();

	}

}
