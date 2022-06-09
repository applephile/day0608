package day0608;

public class ValueOf {

	public static void main(String[] args) {
		
		//int -> String 변환
		//숫자 -> 문자로 변환
		int iVal = 100;
		String strval1 = String.valueOf(iVal);
		
		//double을 String으로 변환하기 위해 ""을 더해줌 / 문자 + 숫자 = 문자;
		//숫자 -> 문자로 변환
		double dVal = 200.0;
		String strval2 = dVal + "";
		
		//문자 -> 숫자로 변환
		//parseInt, parseDouble 등 해당하는 변수의 자료형에 맞는 메서드를 사용한다
		double sum1 = Integer.parseInt(strval1) + Double.parseDouble(strval2);
		System.out.println("strval1 + strval2 = " + sum1);
		
		//위와 같이 parse를 사용할 거 없이 valueOf만 사용해주면 알아서 변환된다
		double sum2 = Integer.valueOf(strval1) + Double.valueOf(strval2);
		System.out.println("strval1 + strval2 = " + sum2);

		//split("문자열") : 해당 문자열을 구분자로 나눠서 배열에 각각 저장
		//join() : 여러 문자열 사이에 구분자를 넣어서 결함
		String animal = "dog, cat, bear";
		String[] arr = animal.split(", ");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String str = String.join("-", arr);
		System.out.println(str);
	}

}
