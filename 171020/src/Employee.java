class Employee {
	private String emNum; //�����ȣ
	private String name; //�����ȣ
	private String depart; //�����ȣ
	
	//������
	public Employee() {
	}
	
	public Employee(String empNo, String name, String part) {
		this.emNum = empNo;
		this.name = name;
		this.depart = part;
	}
	public String getEmNum() {
		return emNum;
	};
	public String getName() {
		return name;
	};
	public String getDepart() {
		return depart;
	};
	
	public void setEmNum(String emNum) {
		this.emNum=emNum;
	};
	public void setName(String name) {
		this.name=name;
	};
	public void setDepart(String depart) {
		this.depart=depart;
	};
	
	public String resultStr() {
		String rst="";
		rst += "�й� : " + emNum + "\n";
		rst += "�̸� : " + name + "\n";
		rst += "�� : " + depart + "\n";

		return rst;		
	}

}
