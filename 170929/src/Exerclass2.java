
public class Exerclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int []coinunit= {500,100,50,10};
		int money=2610;
		int temp=money;
		System.out.println("money"+money);
		
		for(int i=0;i<coinunit.length;i++) {
			System.out.println(coinunit[i] + "원 : " + temp/coinunit[i]);
			temp=temp%coinunit[i];
			
		}

		

	}

}
