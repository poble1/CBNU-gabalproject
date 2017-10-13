
public class MEE extends Employee{
	private String po; //流氓
	//积己磊
	public MEE(String epNum,String name, String depart, String po )
	{
		setEmNum(epNum);
		setName(name);
		setDepart(depart);
		this.po = po;

	}
	public String addStr() {
		String result = "";
		result += "流氓 : " + po + "\n";
		return result;
	}

}
