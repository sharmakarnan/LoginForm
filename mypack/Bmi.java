package mypack;


public class Bmi {

	public static void main(String[] args) {
		
		
		int a = 452;
		int b = 72;
		
		double weight = 452*0.453592;
		double height = 72*0.0254;
		
		double BMI = weight / (height * height);
	      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
		

	}

}
