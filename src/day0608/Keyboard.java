package day0608;

import java.io.IOException;

public class Keyboard {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력 > ");
		//기본적으로 System.in.read(); 라고만 메서드를 사용하면 작성된 값을 아스키코드 값으로 반환한다
		int readByte = System.in.read(bytes); //키보드 입력값을 매개변수 값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴 
		System.out.println(readByte);
		
		String str = new String(bytes, 0, readByte - 2);
		System.out.println(str);
	}

}
