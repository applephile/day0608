package day0608;

class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//기본적인 equals()메서드는 해당 변수의 주소를 비교를 하기 때문에
	//지금처럼 오버라이딩을 해줘서 주소가 아닌 값을 직접 비교하도록 해준다
	public boolean equals(Object obj) {
		if(!(obj instanceof Member)) return false;
		
		Member m = (Member)obj;
		return this.id == m.id;
	}
}

public class Equals2 {

	public static void main(String[] args) {
		
		Member mem1 = new Member("blue");
		Member mem2 = new Member("blue");
		Member mem3 = new Member("red");
		
		if(mem1.equals(mem2)) {
			System.out.println("mem1과 mem2는 동일합니다.");
		} else {
			System.out.println("mem1과 mem2는 동일하지 않습니다.");
		}
		
		if(mem1.equals(mem3)) {
			System.out.println("mem1과 mem3는 동일합니다.");
		} else {
			System.out.println("mem1과 mem3는 동일하지 않습니다.");
		}
		
	}

}
