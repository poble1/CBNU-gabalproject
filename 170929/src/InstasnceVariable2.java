class Student2{
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "�ȳ�";
}

public class InstasnceVariable2 {
	public static void main(String[] args) {
		Student2 obj = new Student2();
		
		obj.m_nKor = 32;
		// �ν��Ͻ� ������ �ʱ�ȭ ���� ������ �ڵ����� 0�� ���� ������
		// �ݵ�� ��ü �̸����θ� ȣ���ؾ� �մϴ�.
		obj.m_nEng = 100;
		obj.m_nMat = 30;
		
		System.out.println("obj�� ���� ���� = " + obj.m_nKor +"��");
		System.out.println("obj�� ���� ���� = " + obj.m_nMat +"��");
		System.out.println("obj�� ���� ���� = " + obj.m_nEng +"��");
		
		System.out.println("obj�� ������= " + obj.g_strTeacher);
		Student2.g_strTeacher = "���߱�";
		System.out.println("obj�� ������= " + obj.g_strTeacher);

	}

}
