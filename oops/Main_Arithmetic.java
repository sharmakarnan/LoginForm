package oops1;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Main_Arithmetic {

		    public static void main(String[] args) {
		        MyCalculator myCalculator = new MyCalculator();
		        int n = 6; 
		        System.out.println("I implemented: AdvancedArithmetic");
		        System.out.println(myCalculator.divisor_sum(n)); 

		        Adder adder = new Adder();
		        System.out.println("My superclass is: " + Arithmetic.class.getSimpleName());
		        System.out.println(adder.add(42, 13)); 
		        System.out.println(adder.add(7, 13));  
		    }
		}


	
