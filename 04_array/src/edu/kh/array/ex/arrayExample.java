package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExample {
	public  void ex1() {
		/* 배열
		 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
		 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고
		 *   각 변수들은 index를 이용하여 구분함
		 * 
		 */
		int num1 =10;
		int num2 =20;
		int num3 =30;
		int num4 =40;
	
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		int sum1 = num1 + num2 + num3 + num4;
		
		
		System.out.println("합계 : "+ sum1);
		
		
		//int[] arr = {10,20,30,40};
		int[] arr = new int[4]; // [] : 배열 기호
		// int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고
		// 이를 arr이라고 부름
		
		arr[0] =10; 
		arr[1] =10; 
		arr[2] =10; 
		arr[3] =10;
		
		//System.out.println(Arrays.toString(arr));
		
		int sum2 =0;
		for(int i =0; i< 4; i++) {
			System.out.println(arr[i]);
			
			sum2 +=arr[i];
			
		}
		System.out.println(sum2);
	}
	public  void ex2() {
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
		String[] arr = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
		int num = sc.nextInt();
		System.out.println();
		int com;
		String game;
		String me;
		int countwin =0, counteq =0, countno =0;
		for(int i=1; i<=num; i++){
			com = (int)(Math.random()*3);
			game = arr[com];
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			me = sc.next();
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", game);
			if((game.equals("가위") && me.equals("바위"))||(game.equals("보") && me.equals("가위"))||(game.equals("바위") && me.equals("보"))) {
				System.out.println("플레이어 승!");
				countwin++;
			}else if(game.equals(me)) {
				System.out.println("비겼습니다.");
				counteq++;
			}else if((game.equals("가위") && me.equals("보"))||(game.equals("보") && me.equals("바위"))||(game.equals("바위") && me.equals("가위"))){
				System.out.println("졌습니다ㅠㅠ");
				countno++;
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n",countwin, counteq,countno);
				
		}
	}
}
