import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
    	//variables
        int numPracticeProb = 0;
        int numLab = 0;
        int midtermScore1 = 0;
        int midtermScore2 = 0;
        int finalScore = 0;

        //scanners for input
        Scanner input = new Scanner(System.in);

        //start
        System.out.println("Welcome to the CISC3130 Grade Calculator");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println();

        //print menu
        menu();
        //try catch. close program if an error appears. If not, do the task the user entered. 
        try
        {
            while(input.hasNext())
            {

            	//receives user choice
                String choice = input.nextLine();

                //switch case for the user choice. Each case checks whether the # enter is valid
                switch(choice.toLowerCase())
                {
                case "1":
                    System.out.println("How many Practice Problems have you completed?");
                    numPracticeProb = input.nextInt();
                    if(numPracticeProb < 0 || numPracticeProb > 8)
                    {
                        System.out.println("Invalid #. There are only 8 practice problems.");
                        numPracticeProb = 0;
                        break;
                    }

                    break;


                case "2":
                    System.out.println("How many Labs have you completed?");
                    numLab = input.nextInt();
                    if(numLab < 0 || numLab > 7)
                    {
                        System.out.println("Invalid #. There are only 7 labs.");
                        numLab = 0;
                        break;
                    }

                    break;


                case "3":
                    System.out.println("What did score on midterm # 1");
                    midtermScore1 = input.nextInt();
                    if(midtermScore1 < 0 || midtermScore1 > 100)
                    {
                        System.out.println("Invalid #. Midterm is scored out of 100");
                        midtermScore1 = 0;
                        break;
                    }

                    break;


                case "4":
                    System.out.println("What did score on midterm # 2");
                    midtermScore2 = input.nextInt();
                    if(midtermScore2 < 0 || midtermScore2 > 100)
                    {
                        System.out.println("Invalid #. Midterm is scored out of 100");
                        midtermScore2 = 0;
                        break;
                    }

                    break;


                case "5":
                    System.out.println("What did you score on your final?");
                    finalScore = input.nextInt();
                    if(finalScore < 0 || finalScore > 100)
                    {
                        System.out.println("Invalid #. Final is scored out of 100");
                        finalScore = 0;
                        break;
                    }

                    break;

                //create a student obj with the grades enter. 
                case "c":
                    Student student = new Student(name, numPracticeProb, numLab, midtermScore1, midtermScore2, finalScore);
                    System.out.print(student);
                    return;
                //quit the program
                case "q":
                    System.out.println("Goodluck " + name + "!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again!");


                }
                System.out.println();
                menu();
            }

        }
        //catch any error that comes up
        catch(Exception e)
        {
            System.out.println("An error has occured, the programs has closed.");
        }
    }

    //method to print menu 
    public static void menu()
    {
        System.out.println("*****Please enter all assignments you have completed*****");
        System.out.println("*****Note: Score not entered will be taken as a 0!*****");
        System.out.println("1. # of Practice Problems you have completed");
        System.out.println("2. # of Labs completed");
        System.out.println("3. Score got received on Midterm # 1");
        System.out.println("4. Score got received on Midterm # 2");
        System.out.println("5. Score on your final");
        System.out.println("c. Calculate Score");
        System.out.println("q. Quit");
        System.out.println();

    }
}