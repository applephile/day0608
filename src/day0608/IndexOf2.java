package day0608;

public class IndexOf2 {

	public static void emailTest(String str) {
		//해당 문자열에서 찾고자 하는 문자가 없으면 -1을 반환하는 것을 이용해서 해당 문자가 있는지 없는지를 판단하고
		//찾고자 하는 문자가 앞에 있을 수록 낮은 숫자를 반환하는 것을 이용해서 두 문자의 반환값을 비교해준다
		if(str.indexOf("@") != -1 && str.indexOf(".") != -1 && str.indexOf("@") < str.indexOf(".")) {
			System.out.println("이메일 확인");
		} else { 
			System.out.println("이메일 재작성 필요");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//입력받은 값이 메일주소가 맞는지 확인하는 메서드
		//1. 반드시 '@'가 있어야함
		//2. 반드시 '.'이 있어야함
		//3. '@'가 '.'보다 먼저 나와야 함
		
		String email1 = "test@naver.com";
		String email2 = "testnaver.com";
		String email3 = "test@navercom";
		String email4 = "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
	}

}
