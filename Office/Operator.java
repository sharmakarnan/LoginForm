package Office;



public class Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Arithmetic operator");
		
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a<<1);
		System.out.println(a>>1);
		System.out.println(a++ + " " + ++a);
		System.out.println(b-- + " " + --b);
		
		System.out.println("Assignment operators");
		
		System.out.println(a);
		System.out.println(a += 2);
		System.out.println(a -= 2);
		System.out.println(a *= 2);
		System.out.println(a /= 2);
		System.out.println(a %= 2);
		
		System.out.println("Comparison Operators");
		
		int c= 10;
		
		System.out.println(a == c);
		System.out.println(b != c);
		System.out.println(a < b);
		System.out.println(a > b);
		
		
		System.out.println("Logical Operators");
		
		System.out.println(a > 5 && b < 30);
		System.out.println(a > 5 || b < 30);
		
		System.out.println("bitwise operator");
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(~a);
        }
	}

