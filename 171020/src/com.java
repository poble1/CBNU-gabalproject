import java.io.BufferedReader;
import java.io.InputStreamReader;
public class com {
	public static void main(String args[]) {
		String result =""; //��� ���ڿ�
		Employee emp=null;
		Manager mg=null;
		String empNo=null;
		String name=null;
		String part=null;
		String po=null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("�й��� �Է��ϼ��� : ");
			empNo = in.readLine();
			System.out.print("�̸��� �Է��ϼ��� :");
			name = in.readLine();
			System.out.print("�а��� �Է��ϼ��� :");
			part = in.readLine();
			System.out.print("��å �Է� : (�л�-1, ����-2, �̿�-3)");
			po = in.readLine();

			
		}catch (Exception e) {
			System.out.println("�Է¿���");
		}
		if(po.equals("1")) {
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
			
		}else {
			po = (po.equals("2")) ? "����" : "�׿�";
			mg = new Manager(empNo, name, part, po);
			result += mg.resultStr();

		}
		
		System.out.println(result);

	}
}
