package com.itacademy.java_classes.threads3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Formula1 extends Thread{
	
	private Numbers numbers;
	
	public Formula1(Numbers numbers) {
		this.numbers = numbers;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			synchronized (numbers) {
				numbers.setResult(numbers.getX()+ numbers.getY());
				System.out.println("Результат потока 1 = " + numbers.getResult());
				try(BufferedWriter bufWriter = new BufferedWriter (new FileWriter("resources/Calculations.txt",true))){
					bufWriter.write(numbers.getResult() + "\n");
				} catch (IOException e) {
					System.err.println("Problem handling file!!!");
				}
			}
		}
	}
	

}
