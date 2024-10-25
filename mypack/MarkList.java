package mypack;



import java.util.*;

public class MarkList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mark : ");
		int mark = scan.nextInt();
		
		
		if( mark <= 100 && mark >= 91) {
			System.out.println("AA");
		}else if(mark < 90 && mark >= 81){
			System.out.println("AB");
		}else if(mark < 80 && mark >= 71){
			System.out.println("BB");
		}else if(mark < 70 && mark >= 61){
			System.out.println("BC");
		}else if(mark < 60 && mark >= 51){
			System.out.println("CD");
		}else if(mark < 50 && mark >= 41) {
			System.out.println("DD");
		}else {
			System.out.println("Fail");
		}

	}

}

