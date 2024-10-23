package LabExercises.Lab8Additional;

// Interface Sports
interface Sports {
  // Method to get the number of goals
  void getNumberOfGoals(String team);

  // Method to display the winning team
  void dispTeam();
}

// Class for Hockey that implements Sports
class Hockey implements Sports {
  private String team1, team2;
  private int goalsTeam1, goalsTeam2;

  // Constructor to initialize teams and goals
  Hockey(String team1, int goalsTeam1, String team2, int goalsTeam2) {
      this.team1 = team1;
      this.goalsTeam1 = goalsTeam1;
      this.team2 = team2;
      this.goalsTeam2 = goalsTeam2;
  }

  // Implementation of getNumberOfGoals for Hockey
  @Override
  public void getNumberOfGoals(String team) {
      if (team.equalsIgnoreCase(team1)) {
          System.out.println(team1 + " scored " + goalsTeam1 + " goals.");
      } else if (team.equalsIgnoreCase(team2)) {
          System.out.println(team2 + " scored " + goalsTeam2 + " goals.");
      } else {
          System.out.println("Team not found.");
      }
  }

  // Implementation of dispTeam for Hockey
  @Override
  public void dispTeam() {
      if (goalsTeam1 > goalsTeam2) {
          System.out.println("Winning team in Hockey: " + team1);
      } else if (goalsTeam2 > goalsTeam1) {
          System.out.println("Winning team in Hockey: " + team2);
      } else {
          System.out.println("The match is a draw.");
      }
  }
}

// Class for Football that implements Sports
class Football implements Sports {
  private String team1, team2;
  private int goalsTeam1, goalsTeam2;

  // Constructor to initialize teams and goals
  Football(String team1, int goalsTeam1, String team2, int goalsTeam2) {
      this.team1 = team1;
      this.goalsTeam1 = goalsTeam1;
      this.team2 = team2;
      this.goalsTeam2 = goalsTeam2;
  }

  // Implementation of getNumberOfGoals for Football
  @Override
  public void getNumberOfGoals(String team) {
      if (team.equalsIgnoreCase(team1)) {
          System.out.println(team1 + " scored " + goalsTeam1 + " goals.");
      } else if (team.equalsIgnoreCase(team2)) {
          System.out.println(team2 + " scored " + goalsTeam2 + " goals.");
      } else {
          System.out.println("Team not found.");
      }
  }

  // Implementation of dispTeam for Football
  @Override
  public void dispTeam() {
      if (goalsTeam1 > goalsTeam2) {
          System.out.println("Winning team in Football: " + team1);
      } else if (goalsTeam2 > goalsTeam1) {
          System.out.println("Winning team in Football: " + team2);
      } else {
          System.out.println("The match is a draw.");
      }
  }
}

// Main class to test the program
public class q3 {
  public static void main(String[] args) {
      // Create a Hockey object
      Hockey hockeyMatch = new Hockey("Team A", 3, "Team B", 2);
      hockeyMatch.getNumberOfGoals("Team A");  // Output: Team A scored 3 goals.
      hockeyMatch.getNumberOfGoals("Team B");  // Output: Team B scored 2 goals.
      hockeyMatch.dispTeam();  // Output: Winning team in Hockey: Team A

      // Create a Football object
      Football footballMatch = new Football("Team X", 1, "Team Y", 1);
      footballMatch.getNumberOfGoals("Team X");  // Output: Team X scored 1 goal.
      footballMatch.getNumberOfGoals("Team Y");  // Output: Team Y scored 1 goal.
      footballMatch.dispTeam();  // Output: The match is a draw.
  }
}
