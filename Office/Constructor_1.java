package Office;

public class Constructor_1 {
	
	static int a; 
	int b1;
	int c1;
	String emp_name;
	int emp_id;
	int emp_Age;
	
	Constructor_1(){
		System.out.println("Hello java");
	}
	
	Constructor_1(int a){
		this.a = a;
		System.out.println(a);
	}
	
	
	Constructor_1(int a, int b, int c){
		this.a = a;
		 b1 = b;
		 c1 = c;
		
		System.out.println(a + " " + b1 + " " + c1 );
		
	}
	Constructor_1(String name, int id, int age){
		 emp_name = name;
	     emp_id = id;
		 emp_Age = age;
		
		System.out.println(emp_name + " " + emp_id + " " + emp_Age);
		
	}

	public static void main(String[] args) {
		
		Constructor_1 obj = new Constructor_1();
		Constructor_1 obj1 = new Constructor_1(5);
		Constructor_1 obj2 = new Constructor_1(a, 6, 7);
		Constructor_1 obj3 = new Constructor_1("sharma", 01, 21);

		
	}

}
