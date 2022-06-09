package day0608;

class Value {
	int value;
	
	Value(){}
	
	Value(int value) {
		this.value = value;
	}
}

public class Equals1 {
	
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//각각 참조변수로 따로 선언하게 되면 변수 내 값은 같더라도 참조변수가 가리키는 주소는 다르다
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다");
		} else {
			System.out.println("v1과 v2가 다릅니다");
		}
		
		v2 = v1;
		//하나의 참조변수 주소를 다른 하나의 참조변수 주소와 같게 해주면 서로 같은 주소를 가리킨다
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다");
		} else {
			System.out.println("v1과 v2가 다릅니다");
		}
	}
}
