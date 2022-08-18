package edu.kh.opp.constructor;

import edu.kh.opp.constructor.model.vo.Member;

public class ConstructorRun {
	public static void main(String[] args) {
		Member member1 = new Member();
						 //기본 생성자
		
		Member member2 = new Member();
		                 //기본 생성자
		
		//기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다!
		//-> 클래스에 생성자가 하나도 작성되지 않으면
		//   컴파일러가 자동으로 기본 생성자를 추가해준다!
		//   public Member(){} // Member 클래스에 자동 추가
		
		Member member5 = new Member("member22","pass22@","01022223333",33);
									// -> 전달인자, 인자(Argument)
		
		Member member6 = new Member("rlfald","안알려줌", "01046573898",11);
		Member member7 = new Member("wldns","몰라", "01043344418",20);
		
		
		System.out.println("ff");
	}
}
