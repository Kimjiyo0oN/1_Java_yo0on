package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	public void ex1() {
		
		/*for문
		 * -끝이 정해져 있는 경우 사용하는 반복문
		 * (==반복 횟수 지정되어 있는 경우)
		 * 
		 * [작성법]
		 * 
		 * for(초기식; 조건식; 증감식){
		 * 		조건식이 true일때 반복 수행할 코드
		 * }
		 * 
		 */
		
		//for문 기초 사용법
		//1~10까지 반복 출력
		for(int i =1 ;  i <11; i++) {
			// 1)초기식; 2,5)조건식; 4,7) 증감식
			
			// 3,6) 반복 수행할 코드
			System.out.println( i+ "출력");
			
			//1,2,3,4 수행 후 -> 5~7 반복		
		}
	}
	public void ex2() {
		//for 기초 사용법 2
		
		//5부터 12까지 1씩 증가하면서 출력 
		for(int i = 5; i <= 12; i++) {
			System.out.println( i+ "출력");
		}
		System.out.println("=======================");
		int sum =0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println( sum+ " <= 1~100 합출력");
		
	}
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		
		int sum = 0; //합계 저장용 변수
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합 : %d \n",num1,num2, sum);
		
	}
	public void ex4() {
		//for 
		
		//1부터 100까지 3씩 증가하면 출력
		//1 4 7 10 13 16 19 22 24 28 31
		
		for(int i =1 ; i <= 100; i += 3) {
			// 1씩 증가 == i++  == i = i + 1
			// 3씩 증가 == i+=3 == i = i + 3
			System.out.print(i+" ");
		}
		
		System.out.println("=======================");
		
		//10부터 20까지 0.5씩 증가
		for(float i = 10 ; i <= 20; i += 0.5) {
			// 1씩 증가 == i++  == i = i + 1
			// 3씩 증가 == i+=3 == i = i + 3
			System.out.print(i+" ");
		}
	}
	public void ex5() {
		// for 문 + char + 자동/강제 형변환 응용 
		
		//A ~ Z까지 출력 
//		for(int i ='A'; i <= 'Z'; i++) {
//			System.out.print((char)i+" ");
//		}
		
		for(char i ='A'; i <= 'Z'; i++) { //문자는 원래 범위가 정해져 있지 않지만 
			System.out.print(i+" ");      //char에 아스키코드 A 65 에 +1을 하면 자동형변화이 되는 것처럼..
		}
	}
	public void ex6() {  //응용
		// 10부터 1까지 1씩 감소하면서 출력 
		
		for(int i = 10; i >=1; i--) {
			System.out.print(i+" ");
		}
	}
	public void ex7() {
		// 입력, sum , for 응용
		
		// 정수 5개를 입력 받아서 합계 구하기 
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0,sum =0;
		for(int i = 1; i <= 5; i++  ) {
			System.out.print("입력 "+ i + ": ");
			num1 =sc.nextInt();
			sum += num1; 
		}
		System.out.println("합계:  "+ sum);
	}
	public void ex8() {
		  // 정수를 몇 번 입력 받을지 먼저 입력 받고
	      // 입력된 정수의 합계를 출력
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 3
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 입력 3 : 30
	      // 합계 : 60
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 2
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 합계 : 30
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 정수의 개수 : ");
		int input =  sc.nextInt();
		int num1 = 0,sum =0;
		for(int i= 1; i <= input; i++) {
			System.out.print("입력 "+ i + ": ");
			num1 =sc.nextInt();
			sum += num1; 
		}
		System.out.println("합계 : "+ sum);
		
	}
	public void ex9() {
		for(int i =1; i <= 20; i++) {
			
			if(i%5 ==0) {
				System.out.print("("+i + ") ");
			}else {
				System.out.print(i + " ");
			}
		}
	}
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9)입력 : ");
		int input =sc.nextInt();
		if(2>input && 10<input) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(input+"단은: ");
			for(int i = 1; i <=9; i++) {
				System.out.printf("%d X %d = %d\n", i, input, i*input);
			}
		}
		System.out.println("=====================================");
		if(2>input && 10<input) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(input+"단은: ");
			for(int i = 9; i >=1; i--) {
				System.out.printf("%d X %d = %d\n", i, input, i*input);
			}
		}
	}
	// =====================================================================
	// [중첩 반복문]
	public void ex11() {
		//12345
		//12345
		//12345
		//12345
		for(int j = 1; j <=4; j++) {
			for(int i =1; i <= 5; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public void ex12() { //[응용]
		// 구구단 2단부터 9단까지 모두 출력
		for(int j=2; j <= 9; j++) {
			for(int i=1; i <= 9; i++) {
				System.out.printf("%dX%d=%2d ",j,i,j*i);
				// %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}
			System.out.println();
		}
	}
	
	public void ex13() {
		//2중 for문을 이용하여 다음 모양을 출력하세요.
		
		//1
		//12
		//123
		//1234
		for(int j=1; j<=4; j++) {
			for(int i=1; i <=j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public void ex14() {
		//2중 for문을 이용하여 다음 모양을 출력하세요.
		
				//4
				//43
				//432
				//4321
		for(int j=4; j>=1; j--) {
			for(int i=4; i >=j; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
//		for(int j=1; j<=4; j++) {
//			for(int i=4; i >=5-j; i--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
	}
	public void ex15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력된 정수 : ");
		int input = sc.nextInt();
		
//		for(int j=1; j<=input; j++) {      //앞에 5로 다 출력 54321
//			for(int i=input; i >=j; i--) { //             5432
//				System.out.print(i);       //             543
//			}                              //             54
//			System.out.println();          //             5
//		}
		for(int j=input; j>=1; j--) {      //54321
			for(int i=j; i >=1; i--) {     //4321
				System.out.print(i);       //321
			}                              //21
			System.out.println();          //1
		}
		
	}
	public void ex16() {
		
		for (int i=0; i<5; i++) {
		    // 2. 별표의 변화 : 1-2-3-4-5
		    for (int k=0; k< i+1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();   //별표가 원하는 갯수만큼 찍히고 나면 줄바꿈
		} 
	}
	public void ex17() {
		
		// 합계 : sum 
		// 개수 : count
		
		// * count, % (나머지), for문을 이용한 검색
		
		// 1부터 20 사이의 3의 배수의 개수 출력 
		int count =0,sum =0;
		for(int i =1; i <= 20; i++) {
			//3의 배수만 출력
			if(i % 3 == 0) {
				System.out.print(i + " ");
				sum +=i;
				count++;
			}
		}
		System.out.println("\nsum: "+sum);
		System.out.println("count: "+count);
	}
	public void ex18() {
		//2종 for문과 count를 이용해서 아래 모양 출력하기
		
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		int count = 0;
		for(int j =1; j <= 3; j++) {
			for(int i=1; i <=4; i++) {
				System.out.print((++count) + " "); 
			}
			System.out.println(); 
		}
	}
}
