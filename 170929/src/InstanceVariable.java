class Student{
	int m_nKor;
	int m_nEng;
	int m_nMat;
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.m_nKor = 30;
		// �ν��Ͻ� ������ �ʱ�ȭ ���� ������ �ڵ����� 0�� ���� ������
		// �ݵ�� ��ü �̸����θ� ȣ���ؾ� �մϴ�.
		//obj.m_nEng = 100;
		obj.m_nMat = 30;
		
		System.out.println("obj�� ���� ���� = " + obj.m_nKor +"��");
		System.out.println("obj�� ���� ���� = " + obj.m_nMat +"��");
		System.out.println("obj�� ���� ���� = " + obj.m_nEng +"��");


	}

}
