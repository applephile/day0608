package day0608;

class Point {
	public int x;
	public int y;
}

public class Clone1 {

	public static void main(String[] args) {
		//얕은 복제에 해당하는 코드로 주소값을 직접 복제해주는 것이라서 하나의 참조변수 내 변수값을 
		//변경하게 되면 같은 주소값을 가지고 있는 참조변수들의 변수값도 변한다
		
		Point p1 = new Point();
		Point p2 = p1;
		
		p1.x = 10;
		p1.y = 20;
		
		p2.x = 30;
		p2.y = 40;
		
		System.out.println("p1.x : " + p1.x);
		System.out.println("p1.y : " + p1.y);
		
		System.out.println("p2.x : " + p2.x);
		System.out.println("p2.y : " + p2.y);
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
	}

}
