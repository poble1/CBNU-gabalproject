
public class ExceptionProblem {
	public static void main(String[] args) 
	{
		int ar[] = {10,20,30};
		for(int i=0 ; i < ar.length ; i++) //<=를 <로 바꿈; 오류 안남
		{
			System.out.println("ar[" + i + "] : " + ar[i]);	
		}		
	}


}
