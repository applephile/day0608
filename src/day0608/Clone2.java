package day0608;

//깊은 복제를 위한 단계
//Cloneable -> Object clone() -> main메서드 try-catch문

class CloneTest implements Cloneable {
	
	public int x;
	public int y;
	
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
}

public class Clone2 {

	public static void main(String[] args) {
		
		CloneTest c1 = new CloneTest();
		CloneTest c2 = null;
		
		try {
			//clone메서드 자체는 java.lang에 들어있는 메서드이기 때문에 형변환을 해줘야한다.
			//clone의 예외인 CloneNotSupportedException은 Exception예외에 들어있는 것이라서 반드시 예외처리를 해줘야 한다 
			//깊은 복제를 해주면 해당 형식 자체를 복제하는 것이기 때문에 얕은 복제와 달리 주소 자체가 따로 주어진다
			c2 = (CloneTest) c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		c1.x = 10;
		c1.y = 20;
		
		c2.x = 30;
		c2.y = 40;
				
		System.out.println("c1.x : " + c1.x + " c1.y : " + c1.y);
		System.out.println("c2.x : " + c2.x + " c2.y : " + c2.y);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}

}
