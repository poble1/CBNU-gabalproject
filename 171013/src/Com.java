import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Com {
	public static void main(String args[]) {
		String result = ""; // ��� ���ڿ�
		Employee emp = null; // Employee��ü�� ���۷��� ����
		MEE mng = null; // Manager��ü�� ���۷��� ����
		String empNo = null; // �����ȣ�� �Է¹޴� ����
		String name = null; // �̸��� �Է¹޴� ����
		String part = null; // �μ��� �Է¹޴� ����
		String po = null; // ��å�� �Է¹޴� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("�����ȣ �Է� : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)������ :");
			name = in.readLine();
			System.out.print("�μ� �Է� :");
			part = in.readLine();
			System.out.print("��å �Է� ����̸� 1, �븮�̸� 2, �����̸� 3 :");
			po = in.readLine();
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		
				if (po.equals("1")) { // ���
					emp = new Employee(empNo, name, part);
					result += emp.resultStr();
				} else { // ������
					po = (po.equals("2")) ? "�븮" : "����";
					mng = new MEE(empNo, name, part, po);
					result += mng.resultStr() + mng.addStr();
				}

				// ��� ���ڿ��� �ֿܼ� ���
				System.out.println(result);
			}



}
