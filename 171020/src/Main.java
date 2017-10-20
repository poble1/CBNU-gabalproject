
public class Main {
	public static void main(String[] args) {
		Terren marine = new Terren();
		marine.attack();
		Protoss dragoon = new Protoss();
	    dragoon.attack();
		Zerge hydralisk = new Zerge();
	    hydralisk.attack();
		System.out.println("====객체 형변환과 오버라이딩을 이용====");
		Starcraft obj = new Terren();    

		obj.attack();                  // shot() 메소드 호출
	    obj = new Protoss();
		obj.attack();                  // shot() 메소드 호출 
		obj = new Zerge();
		obj.attack();                  // shot() 메소드 호출
		
	}
}
