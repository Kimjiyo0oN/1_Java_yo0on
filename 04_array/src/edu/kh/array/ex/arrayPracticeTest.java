package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPracticeTest {
	public void ex1() {
		// 인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당.
		// 인원 수 만큼 점수를 입력 받아
		// 합계, 평균, 최고점, 최저점을 출력
				
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
				
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		
		for(int i = 1; i <= input; i++) {
			System.out.printf("%d번 점수 입력 : ", i );
			score[i-1] = sc.nextInt();
			sum += score[i-1];
			if(max<score[i-1]) {
				max = score[i-1];
			}
			if(i == 1) {
				min = score[i-1];
			}else if(min>score[i-1]) {
				min = score[i-1];
			}
		}
		
		avg = sum / (double)input;
		System.out.printf("\n합계 : %d\n평균 : %.1f\n최고점 : %d\n최저점 : %d", sum , avg, max,min);
		
	}
	
	public void ex2() {
		
		// 배열 내 데이터 검색
		
		// 입력 받은 정수가 배열에 존재하면  몇 번 인덱스에 존재하는지 출력
		// 단, 없다면 "존재하지 않습니다." 출력
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		for(int i =0; i<arr.length; i++) {
			if(search == arr[i]) {
				System.out.println( i + "번째 인덱스에 존재합니다.");
				
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	// 로또 번호 생성기
	public void createLottoNumber() {
			
			// 배열을 이용한 중복 데이터 제거 + 정렬
			
			// 1. 1 ~ 45 사이의 중복되지 않은 난수 6개
			// 2. 생성된 난수를 오름 차순 정렬
		System.out.println("***** 로또 번호 생성기 *****");
		
		// 난수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		
		for(int i =0; i < lotto.length; i++ ) {
			lotto[i] = (int)(Math.random()*45+1);
			if(i >0 ) {	
				for(int x =0; x<i; x++  ) {
					if(lotto[x] == lotto[i]) {
						i--;
						break;
					}
				}
			}
		}
		
		//Arrays.sort(lotto);
		for(int i = 0; i < lotto.length; i++) {
			for(int sort= i+1; sort <lotto.length; sort++) {
				if(lotto[i]>lotto[sort]) {
					int temp = lotto[i];
					lotto[i] = lotto[sort];
					lotto[sort] =temp;
				}
			}
		}
		
		
		// lotto 배열에 저장된 모든 값 출력
		System.out.println( Arrays.toString(lotto)  );
		
	}
	
	public void ex3() {
		// 3행 3열짜리 int 2차원 배열에 난수(0~9)를 대입
		// 단, 각각의 마지막 행/열은 각 행/열의 합
		// 마지막 행, 마지막 열은 전체 난수 합
		
		//  8  5 13
		//  3  7 10
		// 11 12 23
		
		int[][] arr = new int[3][3];
		
		for(int row =0; row < arr.length-1; row++) {
			for(int col =0; col < arr[row].length-1; col++) {
				int ran = (int)(Math.random()*10);
				arr[row][col] = ran;
				arr[row][arr[row].length-1] +=  ran;
				arr[arr.length-1][arr[row].length-1] += arr[row][col];
				arr[arr.length-1][col] +=ran;
			}	
		}
		// 출력용
		for(int row=0 ; row<arr.length ; row++) {
		for(int col=0 ; col<arr[row].length ; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println(); // 줄바꿈
		}	
	}
	public void ex4() {
		// 2차원 배열 선언과 동시에 초기화
		
		char[][] arr = { {'a', 'b', 'c'},  
					     {'d', 'e', 'f'}, 
						 {'g', 'h', 'i'} 
					   };
				
//				char[] arr1 = {'a', 'b', 'c'};
//				char[] arr2 = {'d', 'e', 'f'};
//				char[] arr3 = {'g', 'h', 'i'};
	
				
		// 1. char 입력 받기
		System.out.print("검색할 알파벳을 입력해주세요 : ");

		Scanner sc = new Scanner(System.in);
				
		// char input = sc.nextChar(); 
		// nextChar()는 존재하지 않음 -> Scanner는 char 자료형 입력을 지원 X
				
		char input = sc.next().charAt(0) ;
		// sc.next() : 단어 입력(문자열, String)
		// 문자열.charAt(0) : 문자열 중 0번째 인덱스 문자 하나를 얻어옴
				
				
		boolean flag = true; // true면 검색 결과 없음 / false면 검색 결과 존재
				
		// 2. 2차원 배열 내 검색
		for(int row=0 ; row<arr.length ; row++) {
					
			for(int col=0 ; col<arr[row].length ; col++) {
					
				// arr[row][col] 의 값과 입력 값이 같다면
				if( arr[row][col] == input ) {
					System.out.printf("%c는 %d행 %d열에 존재합니다. \n", input, row, col);
					flag = false;
				}
			}
		}
				
				
		if(flag) {
			System.out.println("일치하는 알파벳이 없습니다.");
		}
		
	}
	public void upDownGame() {
		
		// 프로그램 시작 시 1 ~ 50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇 회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수 보다 크면 UP / 작으면 DOWN 출력
		
		// (임의의 수 30일 경우)
		
		// ex) 
		// 1번 입력 : 10
		// UP
		
		// 2번 입력 : 40
		// Down
		
		// 3번 입력 : 30
		// 정답 입니다! (총 입력 횟수 : 3회)
		
		
		// 난수 생성 : Math.random()  -> Java에서 제공해주는 난수 생성 방법
		//  0.0 <=  x  < 1.0             0.0이상 1.0미만의 난수를 생성(double 형)
		int ran = (int)(Math.random() * 50 + 1);
		// 0.0 <=  x < 1.0  
		// 0.0 <=  x * 50 < 50.0
		// 1.0 <=  x * 50 +1 < 51.0
		
		// 1 <=  (int)(x * 50 +1) < 51  -----> 1 ~ 50 사이 난수
		
//		System.out.println(ran);
		
		Scanner sc = new Scanner(System.in);

		int count = 1;
		
		while(true) {
			System.out.print(count + "번 입력 : ");
			int input = sc.nextInt();
			
			if(ran == input) { // 난수 == 입력값
				System.out.printf("정답 입니다! (총 입력 횟수 : %d회) \n", count);
				break; // while문 종료
			} else if(ran > input) { // 난수 > 입력값
				System.out.println("UP");
				
			} else { // 난수 < 입력값
				System.out.println("DOWN");
			}
			
			count++;
		}
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
			Scanner sc = new Scanner(System.in);

			System.out.print("몇판? ");
			int round = sc.nextInt();
			
			// 승/무/패를 기록한 변수 선언 및 0으로 초기화
			int win = 0;
			int draw = 0;
			int lose = 0;
			
			for(int i=1 ; i<=round ; i++) {
				System.out.println("\n" + i + "번째 게임");
				
				System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
				String player = sc.next();
				
				// 컴퓨터 가위/바위/보 지정
				int ran = (int)(Math.random() * 3); // 0 1 2
				
				String com = null; // String의 기본 값
				// null : 없다(비슷)
				
				switch(ran) {
				case 0 : com = "가위"; break;
				case 1 : com = "바위"; break;
				case 2 : com = "보"; break;
				}

				System.out.printf("컴퓨터는 [%s]를 선택했습니다. \n", com);
				
				
				// 사용자와 컴퓨터 가위, 바위, 보 승패 판별
				
				// String 비교 시 equals() 사용
				if( player.equals(com)  ) {
					System.out.println("비겼습니다.");
					draw++;
					
				} else {
					
					// 사용자가 이기는 경우에 true가 되는 상황을 미리 변수로 선언
					boolean win1 = player.equals("가위") && com.equals("보");
					boolean win2 = player.equals("바위") && com.equals("가위");
					boolean win3 = player.equals("보") && com.equals("바위");
					
					if(win1 || win2 || win3) { // 이기는 경우
						System.out.println("플레이어 승!");
						win++;
						
					}else { // 지는 경우
						System.out.println("졌습니다ㅠㅠ");
						lose++;
					}
				}
				
				System.out.printf("현재 기록 : %d승 %d무 %d패 \n", win, draw, lose);
				
				
			}
		}
}
