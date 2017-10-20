//super
public class Manager extends Employee{
	private String po; // 직책

	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.po = position;
	}

	public String resultStr() {
		String result = super.resultStr();
		result += "직책 : " + po + "\n";
		return result;
	}


}
