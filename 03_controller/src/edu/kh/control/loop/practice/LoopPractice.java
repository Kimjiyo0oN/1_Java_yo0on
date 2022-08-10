package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input <1){
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {
			for(int i = 1; i <=input; i++ ) {
				System.out.print( i+" ");
			}
		}
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input <1){
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {
			for(int i = input; i >=1; i-- ) {
				System.out.print( i+" ");
			}
		}
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 :");
		int input = sc.nextInt();
		int sum =0;
		for(int i = 1; i <=input; i++ ) {
			sum += i;
			if(i == input) {
				System.out.print( i +" = ");
			}else {
				System.out.print( i +" + ");
			}
			
		}
		System.out.println(sum);
		
		
	}
	public void practice4() {
		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 :");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int input2 = sc.nextInt();
		
		if(input1 >=1 && input2 >=1) {
			if(input1 < input2) {
				for(int i = input1; i <= input2; i++) {
					System.out.print( i +" ");
				}
			}else {
				for(int i = input2; i <= input1; i++) {
					System.out.print( i +" ");
				}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
			
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 :");
		int input = sc.nextInt();
		
		System.out.println("===== 4단 =====");
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",input, i , input*i);
		}
		
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 :");
		int input = sc.nextInt();
	
		if(input >= 2 && input <= 9) {
			System.out.printf("===== %d =====\n", input);
			for(int i = 1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n",input, i , input*i);
			}
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int j=1; j <= input; j++) {
			for(int i =1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int j=1; j <= input; j++) {
			for(int i =input; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		for(int j = input; j >= 1; j--) {
//			for(int i = 1; i <= input ; i++) {
//				if(i < j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}	
//			}
//			System.out.println("");
//		}
		
		for(int x = input; x >= 1; x--) {
			for(int i = 1; i <= x-1 ; i++) {
				System.out.print(" ");
			}
			for(int j =input; j >=x; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int j =1; j <= input; j++) {
			for(int i = 1; i <= j; i++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int j =input-1; j >= 1; j--) {
			for(int i = 1; i <= j; i++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int j = input; j >= 1; j--) {
			for(int i = 1; i <= input ; i++) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}	
			}
	
			for(int y = 1; y <= input-j; y++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int x= 1; x <= input; x++ ) {
			if(x==1 || x == input) {
				for(int i = 1; i <= input; i++ ) {
					System.out.print("*");
				}
				
				System.out.println("");
			}else {
				for(int j = 1; j <= input; j++ ) {
					if(j==1 || j == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			
		}
	}
	public void practice13() {
		
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count =0;
		for(int i = 1; i <= input; i++) {
			if(i % 2 ==0 || i % 3 ==0 ) {
				System.out.print(i + " ");
			}
			if(i % 2 == 0 && i % 3 == 0 ) {
				count++;
			}
		}
		System.out.println(" ");
		System.out.printf("count : %d",count);
	}

}
