package com.andrzej;

import java.util.Scanner;

/**
 * Created by andrzej on 29.05.17.
 */
public class Calc2 {

	//a bit more advanced calculator that can read multiple commands in the single equation


	public static void main(String[] args) {

//		Scanner scanner1 = new Scanner(System.in);
		int result = 0;
		int inputA, inputB;
		char operator;
		boolean calcDone = false;
		int numbersOfOperations = 0;

//		while (calcDone == false) {

		System.out.println("Input your equation: ");


		Scanner scanner1 = new Scanner(System.in).useDelimiter("\\s");

//		String z = scanner1.nextLine();
		System.out.println(scanner1.nextInt());


//		System.out.println(scanner1.next(z));
//		System.out.println(scanner1.next(z).charAt(0));
//		scanner1.close();

//		inputA = scanner1.nextInt();
//		operator = scanner1.next().charAt(0);
//		inputB = scanner1.nextInt();
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
//		scanner1.close();

	}

}
