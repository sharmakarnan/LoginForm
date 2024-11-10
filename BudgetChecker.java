package oops1;

import java.util.Scanner;

public class BudgetChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String inputLine = sc.nextLine();
			String part[] = inputLine.split(" ");
			String role = part[0];
			int moneySpent = Integer.parseInt(part[1]);
			
			int limitBudget;
			String memberType;
			
			if(role.equals("SENIOR")) {
				limitBudget = 100;
				memberType = "senior member";	
			}else if(role.equals("JUNIOR")){
				limitBudget = 50;
				memberType = "junior member";	
			}else {
				continue;
			}
			
			if(moneySpent > limitBudget) {
				System.out.println("budget limit is over");
			}else {
				int budgetleft = limitBudget - moneySpent;
				
				System.out.println(memberType);
				System.out.println("spend " + moneySpent);
				System.out.println("budget left " + budgetleft );
			}
		}
	}

}
