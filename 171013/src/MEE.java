
public class MEE extends Employee{
	private String po; //��å
	//������
	public MEE(String epNum,String name, String depart, String po )
	{
		setEmNum(epNum);
		setName(name);
		setDepart(depart);
		this.po = po;

	}
	public String addStr() {
		String result = "";
		result += "��å : " + po + "\n";
		return result;
	}

}
