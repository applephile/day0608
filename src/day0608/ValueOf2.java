package day0608;

public class ValueOf2 {

	public static void main(String[] args) {

		//앞서 ValueOf클래스에서 사용했듯이 Integer.valueOf처럼 숫자에만 사용할 수 있는 것이 아니라
		//문자열로 변환할 때도 valueOf를 사용할 수 있다
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(10 + 10.5);
		System.out.println(str1 + str2);
	}

}
