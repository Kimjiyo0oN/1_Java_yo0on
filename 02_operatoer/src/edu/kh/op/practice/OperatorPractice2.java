package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		//sc.next() : 한 단어 입력, 띄어쓰기 미포함
		//           -> 띄어쓰기, 엔터가 입력 종료를 의미 
		
		//sc.nextline() : 한 문장(한 줄) 입력, 띄어쓰기 포함
		//               -> 엔터가 입력 종료를 의미
		
		// 키보드   (임시저장소)입력버퍼    프로그램(RAM)
		//         [홍 길동]  sc.next에서 홍만 가져감 ->  [길동]  홍은 지워지고 길동만 남는 원리
		
		
		System.out.print("학년(정수) : ");
		int a = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int clas = sc.nextInt();  //3\n 입력버터에 3을 받고 나면 \n가 남아있음 
		
		System.out.print("번호(정수) : ");
		int num= sc.nextInt();  //타입이 int인데 \n는 int 타입이 아니기 때문에 정수를 입력하면 그 값을 가져감
		//그리고 또 \n가 남게 되는데
		
		
		System.out.print("성별(남학생/여학생) : ");
		//nextLine은 엔터를 기준으로 종료가 되기 때문에 앞에 \n 때문에 입력하기 않은 상태에서 다음 "성적~"로 넘어가게 됨
		//즉, 버터에 맨앞에 남은 엔터를 꺼내옴
		// -> 문자열을 입력하지 못하고 넘어감
		
		// ** 해결 방법 **
		//입력 버터 맨앞에 있는 엔터(개행문자)를 제거
		
		//맨 앞에 엔터(개행문자)가 남는 경우
		//-> next(), nextint(), nextFloat(), nextDouble() 등...
		//   nextLine()을 제외한 모두
		//   뒤에 sc.nextLine()을 한번 더 작성하기
		
		//sc.nextLine();     //입력 버터 맨 앞에 남은 엔터를 꺼내옴 -> 입력버터 청소
		//String g = sc.nextLine();
		String g = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double f = sc.nextFloat(); //float로 해도 %f
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n", a , clas , num , name , g, f);
	}

}
