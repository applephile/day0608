package day0608;

import java.util.Scanner;

public class StringExam2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		
		System.out.print("영문 또는 숫자를 입력하세요 > ");
		String str = s.next();
		//대문자를 작성하더라도 소문자로 변환하여 비교해준다
		String temp = str.toLowerCase();
		
		//미리 지정해놓은 변수 안에 사용자가 작성한 값이 있는지 indexOf로 찾아서 그 값을 변수에 저장한다
		int alphaIdx = alpha.indexOf(temp);
		int numIdx = num.indexOf(temp);
		
		System.out.println("Input character : " + str);
		
		//위에서 indexOf로 찾은 값을 통해서 해당 문자가 지정해놓은 문자열에 있는지 없는지 판단한다
		if(alphaIdx != -1) {
			System.out.println("선택하신 " + str + "는 영문입니다.");
		} else if(numIdx != -1) {
			System.out.println("선택하신 " + str + "는 숫자입니다.");
		} else {
			System.out.println("없는 문자입니다.");
		}
		
	}

}
