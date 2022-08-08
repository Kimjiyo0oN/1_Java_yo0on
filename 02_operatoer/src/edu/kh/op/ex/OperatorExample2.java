package edu.kh.op.ex;

public class OperatorExample2 {

	public static void main(String[] args) {
		
		// 증감 연산자 : ++ , --
		// -> 피연산자를 1 중가 또는 감소 시키는 연산자
		
		// 전위 연산 : ++a. --a
		// -> a를 먼저 1 증가 / 감소  시키고 다른 연산을 수행한다
		
		// 후위 연산 : a++ , a--
		// -> 다른 연산을 먼저 다 수행한 후 마지막에 a를 1 증가 / 감소 시킴
		
		int num1 = 10;
		int num2 = 10;
		
		
		//후위 연산
		num1++;
		num2--;
		
		System.out.println("num1++ : " + num1);
		System.out.println("num2-- : " + num2);	
		
		System.out.println("num1++ : " + (num1++));
		System.out.println("num2-- : " + (num2--));	
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("--------------------------------");
		
		//전위 연산
		++num1;
		--num2;
		
		System.out.println("++num1 : " + num1);
		System.out.println("--num2 : " + num2);	
		
		System.out.println("++num1 : " + (++num1));
		System.out.println("--num2 : " + (--num2));	
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("--------------------------------");
		//전위 연산
		System.out.println("++num1 + 10 : " + ((++num1) + 10));
		                   //++14 + 10
		System.out.println("num1: " + num1); //15
		
		//후위 연산
		System.out.println("num1++ + 10 : " + ((num1++) + 10));
        					//15++ + 10 = 25
		System.out.println("num1: " + num1); //16
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		//c = 3 + 4 = 7
		//a = 4 , b = 4
		// 최종적으로 a,b,c는 각각 얼마인가?
		// a =
		// b =
		// c =
		
		System.out.printf("a = %d, b = %d, c = %d\n", a,b,c);
	}

}
