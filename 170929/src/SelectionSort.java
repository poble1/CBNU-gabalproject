
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[]= {22,55,11,44,33};
		int i,j,temp;
		System.out.println("���� �� : ");
		for(i=0;i<5;i++){
			System.out.println((i+1) + "��° ������" + test[i]);
		}
		for(i=0;i<test.length-1;i++) {
			for(j=i+1;j<test.length;j++)
				if(test[i]>test[j]) {
					temp=test[i];
					test[i]=test[j];
					test[j]=temp;
				}
		}
		System.out.println("�������� ���� �� : ");
		for(i=0;i<5;i++)
	 	{
			System.out.println((i+1) + "��° ������" + test[i]);
		}
		for(i=0;i<test.length-1;i++) {
			for(j=i+1;j<test.length;j++)
				if(test[i]<test[j]) {
					temp=test[i];
					test[i]=test[j];
					test[j]=temp;
				}
		}
		System.out.println("�������� ���� �� : ");
		for(i=0;i<5;i++)
	 	{
			System.out.println((i+1) + "��° ������" + test[i]);
		}
	}

}
