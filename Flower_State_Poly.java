package oops1;

import java.util.Scanner;

class State{

	Flower yourNationalFlower() {
		return new Flower();
	}
	
}

class Andhra_pradesh extends State{
	Lily yourNationalFlower() {
		return new Lily();
	}
}

class West_Bengal extends State{
	Lotus yourNationalFlower() {
		return new Lotus();
	}
}

class Flower{
	String whatYourName() {
		return "unknown name";
	}
}

class Lily extends Flower{
	String whatYourName() {
		return "Lily";
	}
}

class Lotus extends Flower{
	String whatYourName() {
		return "Lotus";
	}
}

public class Flower_State_Poly {

	public static void main(String[] args) {
	

		String stateName = "Andhra_pradesh";
		
		State state;
		switch(stateName) {
		
		case "Andhra_pradesh":
			state = new Andhra_pradesh();
			break;
		case "West_Bengal":
			state = new West_Bengal();
			break;
		default :
			state = new State();
		}
		
		System.out.println(state.yourNationalFlower().whatYourName());
	}

}
