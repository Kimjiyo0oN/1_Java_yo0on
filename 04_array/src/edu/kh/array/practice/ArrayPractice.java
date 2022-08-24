package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.array.ex.arrayPracticeTest;

public class ArrayPractice {
	public void practice1() {
		
		int[] arr = new int[9];
		int sum =0;
		
		for(int i=1; i <= arr.length; i++ ) {
			arr[i-1] = i;
			System.out.print(i+" ");
			if((i-1) %2==0) {
				sum += arr[i-1];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d",sum);
		
		
	}
	public void practice2() {
		
		int[] arr = new int[9];
		int sum =0;
		
		for(int i=arr.length; i >= 1; i-- ) {
			arr[arr.length-i] = i;
			System.out.print(i+" ");
			if((arr.length-i) %2 !=0) {
				sum += arr[arr.length-i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d",sum);
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i < arr.length; i++ ) {
			arr[i] = i+1;
			System.out.print((arr[i])+" ");
		}
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int num, index;
		
		for(int i=0; i < arr.length; i++ ) {
			System.out.printf("입력 %d :", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		num = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=0; i < arr.length; i++ ) {
			if(num == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input =sc.next();
		System.out.print("문자 : ");
		char input1 = sc.next().charAt(0);
		int count=0;
		
		char[] arr = new char[input.length()];
		
		System.out.print("application에 i가 존재하는 위치(인덱스) : " );
		for(int i=0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			if(input1== arr[i]) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n%s 개수 : %d", input1, count);
		
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum=0;
		
		for(int i =0; i < input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String residentNum =sc.next();
		char[] charNum = new char[residentNum.length()];
		
		for(int i =0; i < residentNum.length(); i++) {
			if(i>7) {
				charNum[i] = '*';
			}else {
				charNum[i] = residentNum.charAt(i);
			}
			System.out.print(charNum[i]);
		}
		
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int num1 =0;
		while(true) {
			System.out.print("정수 : ");
			num1 = sc.nextInt();
			if(num1%2!=0 && num1>3) {
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		
		int[] arr = new int[num1];
		boolean flag = false;
		int result =1;
		
		for(int i =0; i < arr.length; i++) {
			if(flag||(0<i&&i<(arr.length-1))) {
				System.out.print(", ");
			}
			if((arr.length/2) > i) {
				arr[i] = result++;
				flag = true;
				System.out.print(arr[i]);
			}else {
				arr[i] = result--;
				System.out.print(arr[i]);
			}
			
		}

	}
	public void practice9() {
		
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i =0; i < arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice10() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i =0; i < arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
			System.out.print(arr[i]+" ");
		}
		int max= arr[0];
		int min= arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.printf("\n최대값 : %d\n최소값 : %d\n",max,min);
		
	}
	public void practice11() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		
		boolean flag = true;
		
		for(int i =0; i < arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			flag = true;
			for(int y=0; y < i; y++ ) {
				if(arr[y]==ran) {
					i--;
					flag = false;
					break;
				}
			}
			if(flag) {
				arr[i] = ran;
				System.out.print(arr[i]+" ");
			}
		}
	}
	public void practice12() {
		int[] arr = new int[6];

		boolean flag = true;
		
		for(int i =0; i < arr.length; i++) {
			int ran = (int)(Math.random()*45+1);
			flag = true;
			for(int y=0; y < i; y++ ) {
				if(arr[y]==ran) {
					i--;
					flag = false;
					break;
				}
			}
			if(flag) {
				arr[i] = ran;
			}
		}
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] chInput = new char[input.length()];
		
		for(int i =0; i < chInput.length; i++) {
			chInput[i] = input.charAt(i);			
		}
		
		int count = chInput.length;
		System.out.print("문자열에 있는 문자 : ");
		for(int i =0; i < chInput.length; i++) {
			boolean flag = true;
			for(int y =0; y < i; y++) {		
				if(chInput[i] == chInput[y]) {
					count--;
					//System.out.println(count);
					flag = false;
					break;
				}
			}
			if(flag) {
				if(i == (chInput.length-1)) {
					System.out.println(chInput[i]);
				}else {
					System.out.print(chInput[i]+ ", ");
				}
			}
		}
		System.out.printf("문자 개수 : %d",count);
		
		
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine(); 
		int count =0;
		String arr[] = new String[input];
		for(int i =0; i < input; i++) {
			System.out.printf("%d번째 문자열 : ", i+1);
			arr[i] = sc.nextLine(); 
		}
		count = input;
		boolean flag = false;
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String input1 = sc.next();
			if(input1.equals("n")||input1.equals("N")) {
				System.out.println(Arrays.toString(arr));
				break;
			}else {
				System.out.print("더 입력하고 싶은 개수 : ");
				input = sc.nextInt();
				sc.nextLine(); 
				String arr1[] = new String[count+input];
				System.arraycopy(arr, 0, arr1, 0, arr.length);
				for(int i =count; i < count+input; i++) {
					System.out.printf("%d번째 문자열 : ", i+1);
					arr1[i] = sc.nextLine();
				}
				count +=input;
				arr = arr1;
			}
		}
		
	}
	public void practice15() {
		String[][] array = new String[3][3];
		array= new String[][]{{"(0,0)","(0,1)","(0,2)"},
							{"(1,0)","(1,1)","(1,2)"},
							{"(2,0)","(2,1)","(2,2)"}};
		
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				System.out.print(array[i][y].toString());
			}
			System.out.println();
		}
							
	}
	public void practice16() {
		int[][] array = new int[4][4];
		
		int count =1;
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				array[i][y] = count++;
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}
	}
	public void practice17() {
		int[][] array = new int[4][4];
		
		int count =1;
		for(int i=array.length-1; i>=0; i--) {
			for(int y=array[i].length-1; y >=0 ; y--) {
				array[i][y] = count++;
			}
		}
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}
	}
	public void practice18() {
		int[][] array = new int[4][4];
		
		for(int i=0; i< array.length-1; i++) {
			for(int y=0; y< array[i].length-1; y++) {
				int ran = (int)(Math.random()*10+1);
				array[i][y] = ran;
				array[i][array[i].length-1] +=ran;
				array[array.length-1][y] +=ran;
				array[array.length-1][array[i].length-1] +=ran;
			}
		}
		
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}
		
	}
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		char[][] array = new char[row][col];
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				int ran = (int)(Math.random()*26+65);
				array[i][y] = (char) ran;
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}
	}
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		int count = 97;
		char[][] array = new char[row][];
		for(int i=0; i< array.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			int col = sc.nextInt();
			array[i] = new char[col];
			for(int y=0; y< array[i].length; y++) {
				array[i][y] = (char)(count++);
			}
		}
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}
		

	}
	public void practice21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] num1 = new String[3][2];
		String[][] num2 = new String[3][2];
		
		boolean flag = true;
		int count =0;
		for(int i=0; i< num1.length; i++) {
			if(flag) {
				System.out.println("== 1분단 ==");
			}
			for(int y=0; y< num1[i].length; y++) {
				num1[i][y] = students[count++];
				System.out.print(num1[i][y]+"  ");
				flag = false;
				if(i == (num1.length-1)&& y== (num1[i].length-1)) {
					flag = true;
				}
			}
			System.out.println();
		}
		for(int i=0; i< num2.length; i++) {
			if(flag) {
				System.out.println("== 2분단 ==");
			}
			for(int y=0; y< num2[i].length; y++) {
				num2[i][y] = students[count++];
				System.out.print(num2[i][y]+"  ");
				flag = false;
			}
			System.out.println();
		}
	}
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] num1 = new String[3][2];
		String[][] num2 = new String[3][2];
		
		boolean flag = true;
		int count =0;
		for(int i=0; i< num1.length; i++) {
			if(flag) {
				System.out.println("== 1분단 ==");
			}
			for(int y=0; y< num1[i].length; y++) {
				num1[i][y] = students[count++];
				System.out.print(num1[i][y]+"  ");
				flag = false;
				if(i == (num1.length-1)&& y== (num1[i].length-1)) {
					flag = true;
				}
			}
			System.out.println();
		}
		for(int i=0; i< num2.length; i++) {
			if(flag) {
				System.out.println("== 2분단 ==");
			}
			for(int y=0; y< num2[i].length; y++) {
				num2[i][y] = students[count++];
				System.out.print(num2[i][y]+"  ");
				flag = false;
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		for(int i=0; i< num1.length; i++) {
			for(int y=0; y< num1[i].length; y++) {
				if(input.equals(num1[i][y])) {
					 	if(y==0) {
					 		System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다.",input,(i+1));
					 	}else {
					 		System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 오른쪽에 있습니다.",input,(i+1));
					 	}
						break;
				}else if(input.equals(num2[i][y])){
					if(y==0) {
				 		System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다.",input,(i+1));
				 	}else {
				 		System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다.",input,(i+1));
				 	}
						break;
				}
			}
		}
	}
	public void practice23() {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] array = new String[6][6];
//		array[0][1] = '0';
// 		array[1][0] = '0';
// 		array[0][2] = '1';
// 		array[2][0] = '1';
// 		array[0][3] = '2';
// 		array[3][0] = '2';
// 		array[0][4] = '3';
// 		array[4][0] = '3';
// 		array[0][5] = '4';
// 		array[5][0] = '4';
		int count =0;
		array[0][0] = " ";
		for(int i =1; i<array.length; i++) {
			array[0][i] = String.valueOf(i-1);
			array[i][0] = String.valueOf(i-1);	
		}
		for(int i=1; i< array.length; i++) {
			for(int y=1; y< array[i].length; y++) {
				array[i][y] = " ";	
			}
		}
 		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		array[row+1][col+1] = "X";
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				System.out.print(array[i][y]+" ");
			}
			System.out.println();
		}		
	}
	public void practice24() {
		Scanner sc = new Scanner(System.in);
		
		String[][] array = new String[6][6];
		int count =0;
		array[0][0] = " ";
		for(int i =1; i<array.length; i++) {
			array[0][i] = String.valueOf(i-1);
			array[i][0] = String.valueOf(i-1);	
		}
		for(int i=1; i< array.length; i++) {
			for(int y=1; y< array[i].length; y++) {
				array[i][y] = " ";	
			}
		}
 		while(true) {
 			System.out.print("행 인덱스 입력 : ");
 			int row = sc.nextInt();
 			if(row == 99) {
 				System.out.println("프로그램 종료");
 				break;
 			}
 			System.out.print("열 인덱스 입력 : ");
 			int col = sc.nextInt();
 			array[row+1][col+1] = "X";
 			for(int i=0; i< array.length; i++) {
 				for(int y=0; y< array[i].length; y++) {
 					System.out.print(array[i][y]+" ");
 				}
 				System.out.println();
 			}	
 		}
	}
	public void BingoGame() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고판 크기 지정 : ");
		int row = sc.nextInt();
		
		boolean flag = false;
		String[][] array = new String[row][row];
		for(int i=0; i< array.length; i++) {
			for(int y=0; y< array[i].length; y++) {
				int ran = (int)(Math.random()*row*row+1);
				array[i][y] = String.valueOf(ran);
				flag = false;
				for(int ix =0; ix <= i; ix++) {
					if(flag) {
						break;
					}
					for(int x=0; x < array[i].length; x++) {
						if((i) == ix && x >=y) {
							flag = true;
							break;
						}
						//System.out.println(x+":"+array[i][x].equals(String.valueOf(ran)));
						if(array[ix][x].equals(String.valueOf(ran))) {
							//array[i][x]==String.valueOf(ran)
							y--;
							flag = true;
							break;
						}
					}	
				}
			}
		}
		for(int i=0; i< array.length; i++) {
				for(int y=0; y< array[i].length; y++) {
					System.out.printf("%2s ",array[i][y]);
				}
				System.out.println();
			}	
		System.out.println("============빙고게임 시작============");
		
		while(true) {
			int roundCount =0;
			int[][] bingoCount = new int[row+1][row+1];
			System.out.print("정수를 입력하시오 : ");
			int bingo = sc.nextInt();
			if(1 > bingo || bingo > row*row) {
				System.out.println("다시 입력해수세요");
				continue;
			}
			for(int i=0; i< array.length; i++) {
 				for(int y=0; y< array[i].length; y++) {
 					if(array[i][y].equals(String.valueOf(bingo))) {
 						array[i][y] ="★";
 					}
 					System.out.printf("%2s ",array[i][y]);
 				}
 				System.out.println();
 			}
			for(int i=0; i< array.length; i++) {
 				for(int y=0; y< array[i].length; y++) {
 					if(array[i][y].equals("★")) {
 						bingoCount[i][row] +=1;
 						bingoCount[row][y] +=1;
 						if(i==y) {
 							bingoCount[row][row]+=1;
 							
 						}	
 						for(int x =0; x<row;x++) {
 							if(((i-x)==0)&&((y-(row-1)+x)==0)) {
 								bingoCount[0][0] +=1;
 								break;
 							}
 						}
 					}
 				}
 			}
			if(bingoCount[0][0]==row) {
				roundCount++;
			}
			for(int y=0; y< bingoCount.length; y++) {
				if(bingoCount[row][y]==row) {
					roundCount++;
				}
				
			}
			for(int i=0; i< bingoCount.length-1; i++) {
				if(bingoCount[i][row]==row) {
					roundCount++;
				}
			}
			
			
			System.out.printf("현재 %d빙고\n",roundCount);
			if(roundCount>=3) {
				System.out.println("***** BINGO!!! *****");
				break;
			}
		}                                                  
		
		
	}
	
}
