package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		
		int num;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		num = sc.nextInt();
		
//		if(num % 2 == 0) {
//			result = "짝수입니다.";
//		}else if(num % 2 == 1) {
//			result = "홀수입니다.";
//		}else {
//			result = "양수만 입력해주세요.";
//		}
//		System.out.println(result);
		
		
		switch(num % 2) {
		case 0: result = "짝수입니다."; break;
		case 1: result = "홀수입니다."; break;
		default:result = "양수만 입력해주세요.";
		}
		System.out.println(result);

	}
	public void practice2() {
		
		int korScore, mathScore, EngScore;
		int sum;
		double avg;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		korScore = sc.nextInt();
		
		System.out.print("수학점수 : ");
		mathScore = sc.nextInt();
		
		System.out.print("영어점수 : ");
		EngScore = sc.nextInt();
		
		sum = korScore + mathScore + EngScore;
		avg = sum / 3.0;
		
		if(korScore>=40 && mathScore>=40 && EngScore>=40) {
			if(avg >= 60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",korScore,mathScore,EngScore,sum,avg);
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
		
	}
	public void practice3() {
		
		int month;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 :");
		month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5:case 7: case 8: case 10: case 12: result = "31일까지 있습니다."; break;
		case 2: result = "28일까지 있습니다."; break;
		case 4: case 6: case 9: case 11: result = "30일까지 있습니다."; break;
		default: result = "잘못 입력된 달입니다.";
		}
		System.out.printf("%d월은 %s",month, result );
	}
	public void practice4() {
		
		double height, weight, BMI;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		BMI = weight /(height* height);
		
		if(BMI < 18.5) {
			result = "저체중";
		}else if(BMI >=  18.5 && BMI < 23) {
			result = "정상체중";
		}else if(BMI >=  23 && BMI < 25) {
			result = "과체중";
		}else if(BMI >=  25 && BMI < 30) {
			result = "비만";
		}else {
			result = "고도비만";
		}
		
		System.out.printf("BMI 지수 : %.14f\n%s\n",BMI,result);
		
	}
	public void practice5() {
		double middlesc, finalsc, pracsc, check, avgsc;
		//double middlesc1, finalsc1, pracsc1, check1, avgsc;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		middlesc = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		finalsc = sc.nextInt();
		
		System.out.print("과제 고사 점수 : ");
		pracsc = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		check = sc.nextInt();
		
		middlesc *= 0.2;
		finalsc *= 0.3;
		pracsc *= 0.3;
		check *= 1.0;
		
		avgsc = middlesc + finalsc + pracsc + check;
		
		System.out.println("============= 결과 =============");
		
		if(check <= 20*(1-0.3)) {		
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]",(int)check);
		}else if(avgsc < 70 ) {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n"
					+"과제 점수 (30) : %.1f\n출석 점수 (20) : %.1f\n총점 : %.1f\n" 
					+ "Fail [점수 미달]",middlesc, finalsc,pracsc ,check, avgsc);
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n"
					+"과제 점수 (30) : %.1f\n출석 점수 (20) : %.1f\n총점 : %.1f\n" 
					+ "PASS",middlesc, finalsc,pracsc ,check, avgsc);
		}
		
		
		
	}

}
