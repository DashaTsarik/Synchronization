package com.itacademy.java_classes.threads3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Formula5 extends Thread{
	
	private Numbers numbers;
	
	public Formula5(Numbers numbers) {
		this.numbers = numbers;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			synchronized(numbers) {
				numbers.setResult(numbers.getZ() - numbers.getX());
				System.out.println("Результат потока 5 = " + numbers.getResult());
				try(BufferedWriter bufWriter = new BufferedWriter (new FileWriter("resources/Calculations.txt",true))){
					bufWriter.write(numbers.getResult() + "\n");
				} catch (IOException e) {
					System.err.println("Problem handling file!!!");
				}
			}
		}
	}

}
