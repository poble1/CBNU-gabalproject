
public class Exerclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ū �ݾ��� ������ �켱������ �Ž��� ��� �Ѵ�.
		int []coinunit= {500,100,50,10};
		int money=2610;
		int temp=money;
		System.out.println("money"+money);
		
		for(int i=0;i<coinunit.length;i++) {
			System.out.println(coinunit[i] + "�� : " + temp/coinunit[i]);
			temp=temp%coinunit[i];
			
		}

		

	}

}
