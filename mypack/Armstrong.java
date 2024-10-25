package mypack;

import java.util.Scanner;

public class Armstrong {
	private  int Armstrong_Number(int x) {
		int a=0,digit=0,temp=x;
				int sum = 0;
		
		while(temp > 0) {
			digit++;
			temp = temp / 10;
		}
		
		while(x > 0) {
			a = x % 10;
			sum +=  Math.pow(a, digit);
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		
		Armstrong obj = new Armstrong();
		if(x == obj.Armstrong_Number(x)) {
			System.out.println("is Armstrong number");
		}else {
			System.out.println("is not Armstrong number");
		}

	}



}
