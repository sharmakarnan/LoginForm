package Office;

public class Encapsulation_access {

	public static void main(String[] args) {
		access_data();
	}

	private static void access_data() {
		Encapsulation_data employee = new Encapsulation_data(1, "sharma", 21, 957871, "chennai");
		employee.getEmp_Address();
		employee.getEmp_Age();
		employee.getEmp_id();
		employee.getEmp_no();
		employee.getEmp_name();
		
		System.out.println(employee.getEmp_Address());
		System.out.println(employee.getEmp_Age());
		System.out.println(employee.getEmp_id());
		System.out.println(employee.getEmp_no());
		System.out.println(employee.getEmp_name());
		
	}

}
