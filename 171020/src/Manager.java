//super
public class Manager extends Employee{
	private String po; // ��å

	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.po = position;
	}

	public String resultStr() {
		String result = super.resultStr();
		result += "��å : " + po + "\n";
		return result;
	}


}
