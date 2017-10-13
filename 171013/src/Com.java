import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Com {
	public static void main(String args[]) {
		String result = ""; // 결과 문자열
		Employee emp = null; // Employee객체의 레퍼런스 변수
		MEE mng = null; // Manager객체의 레퍼런스 변수
		String empNo = null; // 사원번호를 입력받는 변수
		String name = null; // 이름을 입력받는 변수
		String part = null; // 부서를 입력받는 변수
		String po = null; // 직책을 입력받는 변수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("사원번호 입력 : ");
			empNo = in.readLine();
			System.out.print("이름 입력(예)장윤정 :");
			name = in.readLine();
			System.out.print("부서 입력 :");
			part = in.readLine();
			System.out.print("직책 입력 사원이면 1, 대리이면 2, 과장이면 3 :");
			po = in.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		
				if (po.equals("1")) { // 사원
					emp = new Employee(empNo, name, part);
					result += emp.resultStr();
				} else { // 관리자
					po = (po.equals("2")) ? "대리" : "과장";
					mng = new MEE(empNo, name, part, po);
					result += mng.resultStr() + mng.addStr();
				}

				// 결과 문자열을 콘솔에 출력
				System.out.println(result);
			}



}
