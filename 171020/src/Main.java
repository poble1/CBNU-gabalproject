
public class Main {
	public static void main(String[] args) {
		Terren marine = new Terren();
		marine.attack();
		Protoss dragoon = new Protoss();
	    dragoon.attack();
		Zerge hydralisk = new Zerge();
	    hydralisk.attack();
		System.out.println("====��ü ����ȯ�� �������̵��� �̿�====");
		Starcraft obj = new Terren();    

		obj.attack();                  // shot() �޼ҵ� ȣ��
	    obj = new Protoss();
		obj.attack();                  // shot() �޼ҵ� ȣ�� 
		obj = new Zerge();
		obj.attack();                  // shot() �޼ҵ� ȣ��
		
	}
}
