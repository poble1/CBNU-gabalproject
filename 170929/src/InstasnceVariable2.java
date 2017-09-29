class Student2{
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "안녕";
}

public class InstasnceVariable2 {
	public static void main(String[] args) {
		Student2 obj = new Student2();
		
		obj.m_nKor = 32;
		// 인스턴스 변수는 초기화 하지 않으면 자동으로 0의 값을 가지며
		// 반드시 객체 이름으로만 호출해야 합니다.
		obj.m_nEng = 100;
		obj.m_nMat = 30;
		
		System.out.println("obj의 국어 점수 = " + obj.m_nKor +"점");
		System.out.println("obj의 수학 점수 = " + obj.m_nMat +"점");
		System.out.println("obj의 영어 점수 = " + obj.m_nEng +"점");
		
		System.out.println("obj의 선생님= " + obj.g_strTeacher);
		Student2.g_strTeacher = "안중근";
		System.out.println("obj의 선생님= " + obj.g_strTeacher);

	}

}
