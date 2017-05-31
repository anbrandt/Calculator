package com.andrzej;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by andrzej on 29.05.17.
 */
public class CalcFile {


	public static void main(String[] args) {
		File file = new File("//home/andrzej/dev/InpOutpScanner/kalkulator.csv");
//reading the inside of the file

		try {
			Scanner scanner1 = new Scanner(file);
			System.out.println(scanner1.nextLine());
			System.out.println(scanner1.nextLine());
			System.out.println(scanner1.nextLine());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
