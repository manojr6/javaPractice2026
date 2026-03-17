package javaPractice2026;

import java.util.Iterator;

public class printPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPyramidStar();
		//printPyramidNumbers();
			printHalfPyramidStars();
		//printHalfPyramidNumbers();
		//printReversePyramidStars();
		//reverseHalfPyramidStars();
	}

	public static void printPyramidStar() {

		int rows=5;

		for (int i = 1; i <=rows; i++) {
			for (int j = i; j < rows ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void printPyramidNumbers() 
	{
		int num=1;
		int rows=5;

		for (int i = 1; i <=rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=(2*i-1); k++) {
				System.out.print(num);



			}
			num++;

			System.out.println();
		}

	}

	public static void printHalfPyramidStars() {

		int rows=5;

		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j < rows ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void printHalfPyramidNumbers() {

		int rows=5;
		int num=1;

		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j < rows ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print(num);
			}
			num++;
			System.out.println();

		}

	}
	public static void printReversePyramidStars() {

		int rows=5;

		for (int i = rows; i >=1; i--) {
			for (int j = rows; j > i ; j--) {
				System.out.print(" ");
			}

			for (int k = (2*i-1) ; k >= 1 ; k--) {
				System.out.print("*");


				/*for (int k = 1; k <= (2*i-1); k++) {
					System.out.print("*");*/
			}
			System.out.println();

		}

	}

	public static void reverseHalfPyramidStars() {
		int rows=5;

		for (int i = rows; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}



}





