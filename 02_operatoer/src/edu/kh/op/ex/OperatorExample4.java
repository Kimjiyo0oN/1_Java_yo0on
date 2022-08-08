package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		
		
		// 논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		// ~와, 그리고(~이고), ~이면서(~면서), ~부터 ~까지, ~사이
		
		int a = 101;
		
		// a는 100 이상 이면서 짝수인가?
		
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = (a >= 100);
		result2 = (a % 2) == 0;
		result3 = result1 && result2;
		//System.out.println("a는 100 이상 이면서 짝수인가" + result1 && result2);
		//에러나는 이유 + 산술연산자가 논리,비교연산자보다 우선순위가 더 높기때문에 (result1 && result2)
		//를 해주어야한다
		System.out.println("a는 100 이상 이면서 짝수인가" + result3);
		
		int b = 5;
		// b는 1부터 10 사이의 정수인가?
		boolean result11;
		boolean result12;
		
		//result11 = 1 <= b && b <= 10;
		result11 = 1 <= b && b <= 10;
		result12 = b <= 10;
		System.out.println("b는 1부터 10 사이의 정수인가?" + (result11 && result12));
		//System.out.println("b는 1부터 10 사이의 정수인가?" + result11);
		
		
		// || (OR) 연산자 : 둘다 false 이면 false, 나머진 true 
		// 또는, ~거나, ~이거나 
		
		int c = 10;
		
		// c는 홀수 이거나 10을 초과한 수 인가?
		
		System.out.print("c는 홀수 이거나 10을 초과한 수 인가? : ");
		System.out.println(c % 2 == 1 || c > 10 );
		
		int d = 20;
		boolean result21 = 1 <= d && d <= 100 || d < 0;
		
		
		// d는 1부터 100사이 숫자 또는 음수인가?
		System.out.print("d는 1부터 100사이 숫자 또는 음수인가? : ");
		System.out.println(result21);
		
		System.out.println("---------------------------------------");
		
		// 논리 부정 연산자 : ! (NOT)
		
		System.out.println("!result21 : " + !result21); //true -> false
		
		int e= 3;
		boolean result31 = e >= 1 && e < 5; // e는 1 이상이고, 5미만 인가?
		boolean result32 = e < 1 || e >= 5; // e는 1 미만 이거나(또는) 5 이상인가

		//result31 과 result32 는 서로 반대
		System.out.println( !result31 == result32);
	}

}
