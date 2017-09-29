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
		System.out.print("찾고자 하는 숫자를 2자리로 입력하세요: ");
		try {
			key = Integer.parseInt(in.readLine());			
		} catch (Exception e) {
			System.out.println("입력오류");

	}
		for (i = 0; i < num; i++) {
			if (ar[i] == key) {
				index = i + 1;
			}
		}

		if (index == 0) {
			System.out.println("찾는 값이 존재하지 않습니다.");
		}

		else {
			System.out.println("찾는 값은 "+ar[index-1]+"(으)로," + index + "번째에 있습니다.");
		}

		}

}
