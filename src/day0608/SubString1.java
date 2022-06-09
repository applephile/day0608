package day0608;

public class SubString1 {

	public static void main(String[] args) {
		
		String ssn = "220101-3958462";
		
		//substring 괄호 안에 숫자를 2개 기입 시 시작 지점과 끝 지점을 의미하는데 끝 지점은 해당 숫자 미만까지만 포함한다
		String front = ssn.substring(0, 6);
		//substring 괄호 안에 숫자를 1개 기입 시 해당 지점을 기점으로 끝까지 출력한다
		String behind = ssn.substring(7);
		
		System.out.println(front);
		System.out.println(behind);
		
	}

}
