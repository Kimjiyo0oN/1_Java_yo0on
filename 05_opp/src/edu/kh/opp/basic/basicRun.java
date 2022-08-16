package edu.kh.opp.basic;

public class basicRun {
	public static void main(String[] args) {
		
		
		KJY 김지윤 = new KJY();
		// heap 영역에 KJY 클래스에 정의된 내일을 이용하여
		// KJY 객체 생성(할당)
		
		
		// 객체가 가지고 있는 속석 출력
		System.out.println("이름 : " + 김지윤.name);
		System.out.println("나이 : " + 김지윤.age);
		System.out.println("생년월일 : " + 김지윤.birthday);
		
		//System.out.println("비밀번호 : " + 김지윤.password);
		// The field KJY.password is not visible
		
		//비밀번호를 볼수 있는 기능을 호출 == 간접 접근 방법
		김지윤.showPassword();
		
		// 기능 수행
		김지윤.eat();
		김지윤.study();
		김지윤.plus(50, 100);
	}
}
