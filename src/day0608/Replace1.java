package day0608;

public class Replace1 {

	public static void main(String[] args) {
		
		String oldStr = "안녕하세요~ 반갑습니다.....";
		//찾고자 하는 문자열을 기입하고 해당 문자열을 어떤 문자열로 바꿀 것인지 기입한다
		String newStr = oldStr.replace("안녕하세요", "Hello");
		
		System.out.println(newStr);
		
	}

}
