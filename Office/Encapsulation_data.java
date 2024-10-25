package Office;

public class Encapsulation_data {
	private int emp_id;
	private String emp_name;
	private int emp_Age;
	private int emp_no;
	private String emp_Address;
	
	Encapsulation_data(int emp_id, String emp_name, int emp_Age, int emp_no, String emp_Address){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_Age = emp_Age;
		this.emp_no = emp_no;
		this.emp_Address = emp_Address;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_Age() {
		return emp_Age;
	}

	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_Address() {
		return emp_Address;
	}

	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}
	
	

}
