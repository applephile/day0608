package day0608;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String str = s.nextLine();
		
		String[] strarr = str.split(" ");
		
		for(int i = 0; i<strarr.length; i++) {
			System.out.print(strarr[i] + ", ");
		}
		
		//띄어쓰기에 해당하는 묶음별로 배열에 저장하기 때문에 배열의 길이가 결국 어절의 개수
		System.out.printf("\n총 %d개의 어절이 있음", strarr.length);
	}

}
