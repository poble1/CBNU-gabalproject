import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Company {
	public static void main(String args[]) {
		String result = ""; 
		Employee obj = null;
		String empNo = null; 
		String name = null;
		String part = null; 
		String position = null; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("학번을 입력하세요 : ");
			empNo = in.readLine();
			System.out.print("이름을 입력하세요 :");
			name = in.readLine();
			System.out.print("학과를 입력하세요 :");
			part = in.readLine();
			System.out.print("직책 입력 : (학생-1, 교수-2, 이외-3)");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}

				if (position.equals("1")) {
					obj = new Employee(empNo, name, part);
					result += obj.resultStr();
				} else {
					position = (position.equals("2")) ? "교수" : "직원";
		
					obj = new Manager(empNo, name, part, position);
					result += obj.resultStr();
				}

				System.out.println(result);
			}
		}

