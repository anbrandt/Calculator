package com.andrzej;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by andrzej on 29.05.17.
 */
public class Calc1 {
//simple calc that works with integers only and only with one operator!!!
	//but it reads the operator and makes a certain decision


	public static void main(String[] args) {
		File file = new File("//home/andrzej/dev/InpOutpScanner/kalkulator.csv");

		try {
			Scanner scanFile = new Scanner(file);


			String x = scanFile.nextLine();

			System.out.println(x);

//			int y = Integer.parseInt(x);

			int z = Integer.parseInt(x.replace(";", " "));


			System.out.println(z);


//			Scanner scan2 = new Scanner(System.in);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//		Scanner scan1 = new Scanner(System.in);
//
//		int result = 0;
//		int inputA, inputB;
//		char operator;
//		boolean calcDone = false;
//		int numbersOfOperations = 0;
//
////		while (calcDone == false) {
//		System.out.println("Input your equation: ");
//		inputA = scan1.nextInt();
//		operator = scan1.next().charAt(0);
//		inputB = scan1.nextInt();
//
//
//		switch (operator) {
//			case '+':
//				result = (inputA + inputB);
//				break;
//			case '-':
//				result = (inputA - inputB);
//				break;
//			case '*':
//				result = (inputA * inputB);
//				break;
//			case '/':
//				result = (inputA / inputB);
//				break;
//
//		}
//		System.out.println(result);
//
//
//		scan1.close();
//
//
//
//
//	}
//}
