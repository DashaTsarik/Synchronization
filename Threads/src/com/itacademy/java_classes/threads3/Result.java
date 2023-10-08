
package com.itacademy.java_classes.threads3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Result extends Thread{
	
	public void run() {
		int sum = 0;
		String line;
		try (BufferedReader bufReader = new BufferedReader(new FileReader("resources/Calculations.txt"))){
			while((line = bufReader.readLine()) != null) {
				sum += Integer.parseInt(line);
			}
		}catch (FileNotFoundException e) {
			System.err.println("File is not found");
		}catch (IOException e) {
			System.err.println("Problems handling file!!!");
		}
		System.out.println("Cумма всех вычислений = " + sum);
	}

}
