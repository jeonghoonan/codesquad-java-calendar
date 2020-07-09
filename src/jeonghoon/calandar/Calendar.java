package jeonghoon.calandar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
//		if (month == 1) {
//			return 31;
//		} else if (month == 2) {
//			return 28;
//		}
//		return 31;
//	}
		
//		switch (month) {
//		case 2:
//			return 28;
//		case 4:
//			return 30;
//		default:
//			return 31;
//		}
//	}
		return MAX_DAYS[month - 1];
	}
	public void printSampleCalendar() {
		System.out.println("일   월    화    수   목    금      토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6   7");
		System.out.println("8  9 10 11 12  13 14");
		System.out.println("1516 17 18 19  20 21");
		System.out.println("2223 24 25 26  27 28");
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.println(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			
			if (month > 12) {
				continue;
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
		}
		
		System.out.println("Bye~");
//		cal.printSampleCalendar();
		scanner.close();
	}

}
