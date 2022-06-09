package day0608;

import java.util.Scanner;

public class Equals3 {

	public static void main(String[] args) {
		//사용자에게 id와 pw를 입력받아
		//모두 동일하게 입력하면 '로그인 성공'
		//아니면 '로그인 실패' 표시
		
		String id = "green";
		String pw = "1234";
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userId = s.nextLine();
		System.out.print("비밀번호 입력 : ");
		String userPw = s.nextLine();
		
		//equals()메서드를 String 참조변수에 사용하면 주소가 아니라 값을 직접 비교하게 된다 
		if(id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		s.close();
	}

}
