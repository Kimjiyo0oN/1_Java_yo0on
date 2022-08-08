package edu.kh.op.ex;

import java.util.Scanner; //Scanner import

public class OperatorExample1 {
		public static void main(String[] args) {
			
			//산술연산자 : + - * / %(나머지)
			
			System.out.println("두 정수를 입력받아 산술 연산 결과 출력하기");
			
			//스캐너 생성
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 1 : ");
			int input1 = sc.nextInt();
			
			System.out.print("정수 입력 2 : ");
			int input2 = sc.nextInt();
			
			
			System.out.println(input1 + " + " + input2 + " = " +(input1+input2) );
			
			System.out.printf("%d - %d = %d\n", input1, input2, (input1 - input2));
			
			System.out.printf("%d * %d = %d\n", input1, input2, (input1 * input2));
			
			System.out.printf("%d / %d = %d\n", input1, input2, (input1 / input2));
		
			//printf에서 '%' 문자를 출력허가 위해서 %%를 입력해야한다
			//%d 출력하는 패턴으로 인식하기 때문에
			System.out.printf("%d %% %d = %d\n", input1, input2, (input1 % input2));

			System.out.println("a\nb\nc");
		}
	
}
