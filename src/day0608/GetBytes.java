package day0608;

import java.io.UnsupportedEncodingException;

public class GetBytes {

	public static void main(String[] args) {
		
		//getBytes() : 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴함
		
		//byte[] bytes1 = "문자열".getBytes();
		//byte[] bytes2 = "문자열".getBytes(Charset charset);
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);

		//리턴된 바이트 배열값을 다시 문자형으로 바꾸기 위해서 String으로 재정의해준다
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		try {
			//getBytes 괄호 안에 출력할 때 사용할 기본 문자셋을 선언해서 해당 문자셋에 맞게 바이트 길이를 출력한다
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("bytes2 -> String : " + str2);
			
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes2);
			System.out.println("bytes3 -> String : " + str3);
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}
