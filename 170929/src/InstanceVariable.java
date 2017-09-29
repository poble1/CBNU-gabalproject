class Student{
	int m_nKor;
	int m_nEng;
	int m_nMat;
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.m_nKor = 30;
		// 인스턴스 변수는 초기화 하지 않으면 자동으로 0의 값을 가지며
		// 반드시 객체 이름으로만 호출해야 합니다.
		//obj.m_nEng = 100;
		obj.m_nMat = 30;
		
		System.out.println("obj의 국어 점수 = " + obj.m_nKor +"점");
		System.out.println("obj의 수학 점수 = " + obj.m_nMat +"점");
		System.out.println("obj의 영어 점수 = " + obj.m_nEng +"점");


	}

}
