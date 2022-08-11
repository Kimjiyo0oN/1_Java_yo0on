package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	public  void ex1() {
		
		//break 문 : 가장 가까운 반복문을 빠져 나가는 구문 
		
		for(int i =1; i <= 20; i++){
			System.out.println(i);
			
			//i가 20일 때 반복 종료
			
			if(i == 20) {
				break;
			}
			
			System.out.println("======================");
			for(int row =1; row <= 5; row++) {
				for(int col =1 ; col <= 30; col++) {
					System.out.printf("(%d , %d)", row , col);
					if(col ==3) {
						break;
					}
				}
				
				System.out.println();
				
				if( row == 3) {
					break;
				}
			}
		}
	}
	public  void ex2() {
		// 0이 입력될 때까지의 입력된 정수의 합 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		while(true) {  //조건식에 강제로 true 작성 == 무한 반복
			System.out.println("정수 입력dlekekek :");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input;
			
		}
		System.out.println("합계 : "+ sum);
		// 도달할 수 없는 코드
	}
}