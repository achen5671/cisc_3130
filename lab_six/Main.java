import java.util.*;

public class Main{
	public static void main(String[] args){
		int numPracticeProb = 0;
		int numLab = 0;
		int midtermScore1 = 0;
		int midtermScore2 = 0;
		int finalScore = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the CISC3130 Grade Calculator");
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		menu();

		while(input.hasNext()){


			int choice = input.nextInt();
			switch(choice){
				case 1: 
					System.out.println("How many Practice Problems have you completed?");
					numPracticeProb = input.nextInt();
					break;
				case 2:
					System.out.println("How many Labs have you completed?");
					numLab = input.nextInt();
					break;
				case 3:
					System.out.println("What did score on midterm # 1");
					midtermScore1 = input.nextInt();
					break;
				case 4: 
					System.out.println("What did score on midterm # 2");
					midtermScore2 = input.nextInt();
					break;
				case 5:
					System.out.println("What did you score on your final?");
					finalScore = input.nextInt(); 
					break;
				case 6: 
					Student student = new Student(numPracticeProb, numLab, midtermScore1, midtermScore2, finalScore);
					System.out.print(student);
					return;
				case 7: 
					System.out.println("Goodluck " + name + "!");
					return;

				
			}
			menu();
		}



	}



	public static void menu(){
		System.out.println("Please choose what you like to enter");
		System.out.println("1. # of Practice Problems you have completed");
		System.out.println("2. # of Labs completed");
		System.out.println("3. Score got received on Midterm # 1");
		System.out.println("4. Score got received on Midterm # 2");
		System.out.println("5. Score on your final");
		System.out.println("6. Calculate Score");
		System.out.println("7. Quit");
		System.out.println("Note: Score not entered will be taken as a 0!");
	}
}