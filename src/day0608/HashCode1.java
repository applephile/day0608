package day0608;

public class HashCode1 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//hashCode()는 Object에 정의돼있기 때문에 하위클래스에서 오버라이딩을 할 수 있다
		//또한 String클래스에 hashCode()가 따로 오버라이딩이 돼있기 때문에 다른 객체를 사용하더라도 무조건 각 객체의 고유한 값을 가지는 것이 아니라 
		//같은 값을 가질 수도 있다
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//identityHashCode는 hashCode()와 달리 Object에 정의돼있는 것이 아니라서 따로 오버라이딩을 할 수 없다
		//그렇기 때문에 무조건 각 객체마다 고유한 값을 가지고 있다
		//고로 각 객체를 비교하기 위해서는 identityHashCode()메서드를 사용하는 것이 좋다
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}

}
