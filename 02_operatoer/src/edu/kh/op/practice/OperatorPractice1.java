package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input1 = sc.nextInt();
		
		
		int result1 = input1 / input;
		int result2 = input1 % input;
		System.out.printf("1인당 사탕 개수 : %d \n남은 사탕 개수: %d\n", result1 , result2);
		
	}

}
