package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPracticeTest {
	 public void practice7() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 입력 : ");
		 int input = sc.nextInt();
		 
		 for(int row =1; row <=input; row++){
			 for(int i =1; i <= row; i++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 public void practice8() {
//		 ex.
//			정수 입력 : 4
//			****
//			***
//			**
//			*
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int row =input; row >=1; row--){
			 for(int i =1; i <= row; i++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	public void practice9() {
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//if문 사용
//		for(int row =1; row <=input; row++){
//			 for(int i =1; i <= input; i++){
//				 if(i > input-row) {
//					 System.out.print("*");
//				 }else {
//					 System.out.print(" ");
//				 }
//			 }
//			 System.out.println();
//		 }
		
		//for문만 사용 
		for(int y = input; y >= 1; y--) {
			for(int i = 1; i < y; i++ ) {
				System.out.print(" ");
			}
			for(int star = input; star >= y; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		//위쪽 아래쪽 나눠서 이중for문 2번
//		for(int col = 1; col <= input; col++){
//			for(int row =1; row <= col; row++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int col = 1; col <= input-1; col++){
//			for(int row =input-1; row >= col; row--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//if else로 
		for(int col =1; col <= input*2-1; col++) {
			if(col <= input) {
				for(int row =1; row <=col; row++) {
					System.out.print("*");
				}
			}else {
				for(int row2 = input*2-1; row2 >=col; row2-- ) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
//		ex.
//		정수 입력 : 4
//		    *
//		   ***
//		  *****
//		 *******
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//for문 이용
//		for(int col =1; col <= input; col++) {
//			for(int row = input -1; row >= col; row--) {
//				System.out.print(" ");
//			}
//			for(int star = 1;  star <= col*2-1;star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		//if문 이용
		for(int col = input; col >= 1; col--) {
			for(int row =1; row <= input*2-1; row++) {
				if(row < col || row >input*2-col) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public void practice12() {
		
//		ex.
//		정수 입력 : 5
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int col =1; col <=input; col++) {
			for(int i = 1; i <= input; i++) {
				
				if(col ==1 || col == input) {	
					System.out.print("*");
				}else if(i == 1 || i == input ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	 
}
