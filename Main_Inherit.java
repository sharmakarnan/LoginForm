package oops1;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Main_Inherit {

	
		    public static void main(String[] args) {
		        Sports sport = new Sports();
		        System.out.println(sport.getName());
		        sport.getNumberOfTeamMembers();

		        Soccer soccer = new Soccer();
		        System.out.println(soccer.getName());
		        soccer.getNumberOfTeamMembers();
		    }
		}


	