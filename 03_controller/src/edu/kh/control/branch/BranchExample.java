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
			System.out.println("정수 입력 :");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input;
			
		}
		System.out.println("합계 : "+ sum);
		// 도달할 수 없는 코드
	}
	public  void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		String str ="";
		
		System.out.println("--- 문자열 입력(종료시 exit@ 입력) ---");
		while(true) {
			
			String input = sc.nextLine();
			
			
			//비교연산자는 보통 기본 자료형의 값 비교만 가능하다
			//->String은 기본 자료형 X, 참조형 O
			
			//->참조형은 A.equals(B) 값을 비교할 수 있다
			
			
			if(input == "exit@") {  
				break;
			}
			str += input+ "\n";   //누적
		}
	}
	public  void ex4() {
		
		//continue : 다음 반복으로 넘어감 
		
		//1부터 30까지 5의 배수를 제외하고 출력(continue 사용)
		
		for(int i =0; i <= 30; i++) {
			if(i % 5 == 0){
				
				continue; // 다음 반복으로 이동(증감식 부분으로 이동)
				
			}
			System.out.println(i);
		}
	}
	public  void ex5() {
		
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤
		
		for(int i =1; i <= 100; i++) {
			if(i % 5 == 0) {
				if(i == 40) {
					System.out.println(i);
					break;
				}
				continue;
			}
			System.out.println(i);
		}
	}
	public  void ex6() {
		//프로그램 시작시 1~ 50 사이의 임의의 수 (난수)를 하나 생성하여
		//사용자가 몇 회 만에 맞추는 지 카운트
		
		//만약 틀렸을 경우 난수가 입력한 수보다 크면 up / 작으면 DOWN 출력
		
		//(임의의 수 30일 경우)
		
		//ex)
		//1번 입력 : 10
		//UP
		
		//난수 생성 
		Scanner sc = new Scanner(System.in);
		int ran =(int)(Math.random()*50 + 1);   //1~50 사이
		int count =0;
		int succ;
		while(true){
			count++;
			System.out.printf("%d번 입력:",count);
			succ= sc.nextInt();
			if(succ == ran) {
				System.out.printf("정답입니다! (총 입력 횟수 : %d회)",count);
				break;
			}else if(succ < ran){
				System.out.println("UP");
			}else {
				System.out.println("DOWN");
			}
			 
		};
	}
	
	// 가위 바위 보 게임
	
	// 몇판? : 3
		
	// 1번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 :  가위
	// 컴퓨터는 [보]를 선택했습니다.
	// 플레이어 승!
	// 현재 기록 : 1승 0무 0패
		
	// 2번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 :  보
	// 컴퓨터는 [보]를 선택했습니다.
	// 비겼습니다.
	// 현재 기록 : 1승 1무 0패
		
	// 3번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 :  가위
	// 컴퓨터는 [바위]를 선택했습니다.
	// 졌습니다ㅠㅠ
	// 현재 기록 : 1승 1무 1패
	public void rpsGame() {
		
		String me;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
		int num = sc.nextInt();
		//System.out.println();
		
		String com = null;
		
		int win =0;
		int draw =0;
		int lose = 0;
		
		for(int i= 1; i <=num ; i ++) {
			int ran = (int)(Math.random()*3);
			
			
			
			System.out.println("\n"+ i + "번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			me = sc.next();
			
			switch(ran) {
			case 0: com ="가위"; break;
			case 1: com ="바위";break;
			case 2: com ="보";break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			// 사용자와 컴퓨터 가위, 바위, 보 승패 판별 
			
			//String 비교시 equals() 사용
			if(com.equals(me)) { 
				System.out.println("비겼습니다.");
				draw++;
					
			}else {
				
				//사용자가 이기는 경우에 true가 되는 상황을 미리 변수로 선언
				boolean win1 = me.equals("가위") && com.equals("보");
				boolean win2 = me.equals("바위") && com.equals("가위");
				boolean win3 = me.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) { //이기는 경우 
					System.out.println("플레이어 승!");
					win++;
				}else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
				
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n",win, draw ,lose);
		}
	}
}
