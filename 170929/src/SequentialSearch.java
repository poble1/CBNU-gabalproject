import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {33,34,15,12,68,10,55,82,13};
		int i, num;
		int key=0, index=0;
		num=ar.length;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ã���� �ϴ� ���ڸ� 2�ڸ��� �Է��ϼ���: ");
		try {
			key = Integer.parseInt(in.readLine());			
		} catch (Exception e) {
			System.out.println("�Է¿���");

	}
		for (i = 0; i < num; i++) {
			if (ar[i] == key) {
				index = i + 1;
			}
		}

		if (index == 0) {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}

		else {
			System.out.println("ã�� ���� "+ar[index-1]+"(��)��," + index + "��°�� �ֽ��ϴ�.");
		}

		}

}
