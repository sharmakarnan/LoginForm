package oops1;

class Vehicle {
    void describe() {
        System.out.println("I am a vehicle with pedals.");
    }
}

class Cycle extends Vehicle {
    @Override
    void describe() {
        System.out.println("I am a cycle with an engine.");
    }
}

class Motorcycle extends Cycle {
    @Override
    void describe() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        System.out.print("My ancestor is a cycle who is a ");
        System.out.println();
        super.describe(); 
    }
}

public class Super_Key_poly {
		    public static void main(String[] args) {
		        Motorcycle motorcycle = new Motorcycle();
		        motorcycle.describe();
		    }
		}


	
