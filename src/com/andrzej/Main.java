package com.andrzej;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);

//        String string1 = scanner1.nextLine();
//        System.out.println("Input the x integer");
//        int x = scanner1.nextInt();
//        System.out.println("Input the y integer");
//        int y = scanner1.nextInt();
//        System.out.println("Input the a integer");
//        int a = scanner1.nextInt();
//        System.out.println("Input the z integer");
//        int z = scanner1.nextInt();
//
//        System.out.println("the result of (x+y)*a + z is " + (x+y)*a + z);

//        equation1( x = scanner1.nextInt(), y = scanner1.nextInt(), a = scanner1.nextInt(), z = scanner1.nextInt());

//        System.out.println("ADD. Type the first integer");
//        int x = scanner1.nextInt();
//        System.out.println("ADD. Type the first integer");
//        int y = scanner1.nextInt();
//        System.out.println("Sum equals " + (x+y));
//
//
//        add();

		//simple calc over here
		//improve this calc by allowing to add a several other operations in one single line

		int result = 0;
		int inputA, inputB;
		char operator;
		boolean calcDone = false;
		int numbersOfOperations = 0;

//		while (calcDone == false) {
		System.out.println("Input your equation: ");
		inputA = scanner1.nextInt();
		operator = scanner1.next().charAt(0);
		inputB = scanner1.nextInt();


		switch (operator) {
			case '+':
				result = (inputA + inputB);
				break;
			case '-':
				result = (inputA - inputB);
				break;
			case '*':
				result = (inputA * inputB);
				break;
			case '/':
				result = (inputA / inputB);
				break;

		}
		System.out.println(result);


		scanner1.close();


//equation1();

//add();


	}

	public static int equation1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the x integer");
		int x = scanner.nextInt();
		System.out.println("Input the x integer");
		int y = scanner.nextInt();
		System.out.println("Input the x integer");
		int a = scanner.nextInt();
		System.out.println("Input the x integer");
		int z = scanner.nextInt();
		int result = 0;
		result = (x + y) * a + z;
		System.out.println(result);
		return result;
	}

	public static int add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the x integer");
		int x = scanner.nextInt();
		System.out.println("Input the y integer");
		int y = scanner.nextInt();

		int result = 0;
		result = x + y;
		System.out.println("Sum of x and y is " + result);
		return result;
	}
}
