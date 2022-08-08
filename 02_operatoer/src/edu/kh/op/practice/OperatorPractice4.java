package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input = sc.nextInt();
		
		System.out.print("영어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input2 = sc.nextInt();
		
		// 합계를 저장하기 위한 변수 
		// int sum 
		
		//평균을 저장하기 위한변수
		//double avg = sum / 3.0
		System.out.println("합계 : " + (input+ input1 + input2));
		double result = ((input + input1 + input2)/3.0);
		System.out.println("평균 : " + result);
		String result1 = (result >= 60 && (input >= 40 && input1 >= 40 && input2 >= 40)) ? "합격" : "불합격";  
		System.out.println(result1);
	}

}
