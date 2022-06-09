package day0608;



public class ByteToString {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

		//배열로 저장돼있는 bytes값을 String으로 선언해서 문자값을 반환받는다
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//문자값으면 반환받을 때 첫 위치와 끝 위치를 지정해서 반환받을 수 있다
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		System.out.println();
	}

}
