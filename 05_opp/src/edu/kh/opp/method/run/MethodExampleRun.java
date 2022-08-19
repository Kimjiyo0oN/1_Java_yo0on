package edu.kh.opp.method.run;

import edu.kh.opp.method.model.service.MethodExampleService;
import edu.kh.opp.method.view.MethodExampleView;

//실행용 클래스
public class MethodExampleRun {
	public static void main(String[] args) {
		
		//MethodExampleView 객체 생성
		MethodExampleView view = new MethodExampleView();
		
		view.displaymenu();
		// view가 참조하는 객체의 기능(메서드) 중
		// displaymenu() 메서드를 호출
		
		
	}
}
