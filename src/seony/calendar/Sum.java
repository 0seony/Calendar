package seony.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 사용자가 키보드를 통해 두 수를 입력한다
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
    	//String[] input = sc.nextLine().split(" ");
		//int A = Integer.parseInt(input[0]);
		//int B = Integer.parseInt(input[1]);
		
		//next()는 띄어쓰기도 엔터처럼 입력을 끝내줌
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		
		// 출력 : 화면에 두 수의 합을 출력한다.
		//println() 과 printf()
		//System.out.println("두 수의 합은 " + (A + B) + "입니다.");
		System.out.printf("두 수의 합은 %d입니다", A+B);
		
		sc.close();
	}

}
