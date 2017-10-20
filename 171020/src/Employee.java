class Employee {
	private String emNum; //사원번호
	private String name; //사원번호
	private String depart; //사원번호
	
	//생성자
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
		rst += "학번 : " + emNum + "\n";
		rst += "이름 : " + name + "\n";
		rst += "과 : " + depart + "\n";

		return rst;		
	}

}
