import java.util.*;

public class Student{
	//possible points students can score
	private final int practiceProbScore = 44;
	private final int labsScore = 16;
	private final int midtermScore = 20; 
	private final int finalExamScore = 20;
	private final double totalScore = 100;

	//instance vars
	private String name;
	private double studentTotalScore = 0;

	private double studentPracticeProbScore = 0;
	private double studentLabsScore = 0;
	private double studentMidtermScore = 0; 
	private double studentFinalExamScore = 0;
	

	//contructor
	public Student(String name, int studentPracticeProb, int studentLabs, int studentMidterm1, int studentMidterm2, int studentFinalScore){
		this.name = name;
		calculateStudentPracticeProblemScore(studentPracticeProb);
		calculateStudentLabScore(studentLabs);
		calculateStudentMidTermScore(studentMidterm1);
		calculateStudentMidTermScore(studentMidterm2);
		calculateStudentFinalScore(studentFinalScore);
	}

	//calculates score base on the # of practice problem in the class (8)
	private void calculateStudentPracticeProblemScore(int studentPracticeProb){
		studentPracticeProbScore = studentPracticeProb * 5.5;
		studentTotalScore += studentPracticeProbScore;
	}

	//method to caluculate the lab score. 
	private void calculateStudentLabScore(int studentLabs){
		studentLabsScore = studentLabs * (16/7);
		studentTotalScore += studentLabsScore;
	}

	//method to calculate the student midterm score
	private void calculateStudentMidTermScore(double studentMidterm){
		studentMidtermScore = (studentMidterm/100) * 10;
		studentTotalScore += studentMidtermScore;

	}
	//method to calculate the students final score
	private void calculateStudentFinalScore(double studentFinal){
		studentFinalExamScore = (studentFinal/100) * finalExamScore;
		studentTotalScore += studentFinalExamScore;

	}
	//toString method to print out info and finds the letter grade appropriate for the student base on their score
	public String toString(){
		char letter;

		if(studentTotalScore >= 90){
			letter = 'A';
		}else if(studentTotalScore >= 80){
			letter = 'B';
		}
		else if(studentTotalScore >= 70){
			letter = 'C';
		}
		else if(studentTotalScore >= 60){
			letter = 'D';
		}else{
			letter = 'F';
		}

		return name +" scored a " + studentTotalScore + ". Letter Grade: " + letter + ". " +scoreForGrade();
	}

	//finds the points needed for a better grade
	private String scoreForGrade(){
			double num = studentTotalScore / totalScore;

			return "\nYou need to score: \n" + (90-num) + " more points for a A\n" + 
					(80-num) + " more points for a B\n" + 
					(70-num) + " more points for a C\n" + 
					(60-num) + " more points for a D\n";

	}




}