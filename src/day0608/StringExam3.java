package day0608;

import java.io.IOException;
import java.util.Scanner;

public class StringExam3 {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		byte[] bytes1 = new byte[26];
//		for(int i = 0; i<bytes1.length; i++) {
//			bytes1[i] = (byte) (i + 65);
//		}
//		
//		byte[] bytes2 = new byte[26];
//		for(int i = 0; i<bytes2.length; i++) {
//			bytes2[i] = (byte) (i + 97);
//		}
//		
//		byte[] bytes3 = new byte[10];
//		for(int i = 0; i<bytes3.length; i++) {
//			bytes3[i] = (byte) (i + 48);
//		}
//		
//		String str1 = new String(bytes1);
//		String str2 = new String(bytes2);
//		String str3 = new String(bytes3);
//		
//		System.out.print("영문 또는 숫자를 입력하세요 > ");
//		String str = s.next();
//		
//		int strIdx1 = str1.indexOf(str);
//		int strIdx2 = str2.indexOf(str);
//		int strIdx3 = str3.indexOf(str);
//		
//		System.out.println("Input character : " + str);
//		
//		if(strIdx1 != -1 || strIdx2 != -1) {
//			System.out.println("선택하신 " + str + "는 문자입니다.");
//		} else if(strIdx3 != -1) {
//			System.out.println("선택하신 " + str + "는 숫자입니다.");
//		} else {
//			System.out.println("입력한 값 확인 바람");
//		}
		
		System.out.print("영문 또는 숫자를 입력하세요 > ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		int str = input.charAt(0); //charAt()는 결과값을 문자로 반환하는데 그걸 int타입 변수에 대입해서 아스키코드를 받아온다
		System.out.println(str);
		if((str >= 65 && str <= 90) || (str >= 97 && str <= 122))
			System.out.println("입력하신 " + (char)str + "은 문자입니다.");
		 else if(str >= 48 && str <= 57) 
			System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
		 else 
			 System.out.println("입력한 값 확인 바람");
		
		
//		try {
//			int str = System.in.read(); //System.in.read()를 통해서 값을 받으면 아스키 코드 값으로 반환된다
			//System.in.read()로 찾은 값을 바로 비교해서 찾아준다
//			if((str >= 65 && str <= 90) || (str >= 97 && str <= 122))
//				System.out.println("입력하신 " + (char)str + "은 문자입니다.");
//			 else if(str >= 48 && str <= 57) 
//				System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
//			 else 
//				 System.out.println("입력한 값 확인 바람");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

}
