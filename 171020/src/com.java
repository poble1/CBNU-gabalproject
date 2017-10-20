import java.io.BufferedReader;
import java.io.InputStreamReader;
public class com {
	public static void main(String args[]) {
		String result =""; //결과 문자열
		Employee emp=null;
		Manager mg=null;
		String empNo=null;
		String name=null;
		String part=null;
		String po=null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("학번을 입력하세요 : ");
			empNo = in.readLine();
			System.out.print("이름을 입력하세요 :");
			name = in.readLine();
			System.out.print("학과를 입력하세요 :");
			part = in.readLine();
			System.out.print("직책 입력 : (학생-1, 교수-2, 이외-3)");
			po = in.readLine();

			
		}catch (Exception e) {
			System.out.println("입력오류");
		}
		if(po.equals("1")) {
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
			
		}else {
			po = (po.equals("2")) ? "교수" : "그외";
			mg = new Manager(empNo, name, part, po);
			result += mg.resultStr();

		}
		
		System.out.println(result);

	}
}
