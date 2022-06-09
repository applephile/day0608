package day0608;

class A {
	A() {
		System.out.println("A클래스 객체 생성");
	}
}

class B {
	B() {
		System.out.println("B클래스 객체 생성");
	}
}

public class GetClass {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		//참조변수가 어떤 클래스로 선언돼었는지 확인하는 메서드
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		
	}

}
