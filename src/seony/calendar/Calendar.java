package seony.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cl = new Calendar();
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print("> ");
			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			} else if (month<1 || month>12) {
				continue;
			} else {
				cl.printMaxDays(month);
				System.out.println();
			}
		}
		sc.close();
	}

	public void printMaxDays(int month) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Calendar cl = new Calendar();
		System.out.printf("%d월은 %d일까지 있습니다.", month, cl.calMaxDays(month));
	}

	public void printSampleCalendar() {
		// println()을 이용해 달력 만들기
		System.out.println(" 일   월   화  수   목    금   토");
		System.out.println("--------------------");
		System.out.println("  1    2    3   4    5    6    7");
		System.out.println("  8   9   10  11   12   13  14");
		System.out.println(" 15  16  17  18   19  20  21");
		System.out.println("22  23  24  25  26  27  28");
	}

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int calMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}

}
