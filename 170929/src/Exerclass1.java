
public class Exerclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}};
		int total=0;
		int count=0;
		float average=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j]; //��
				count++;
			}
		}
		
		average=total/count;
		System.out.println("�� : "+total);
		System.out.println("��� : "+average);

	}

}
