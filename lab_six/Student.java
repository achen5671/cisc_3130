import java.util.*;

public class Student{
	//instance vars
	private final int practiceProbScore = 44;
	private final int labsScore = 16;
	private final int midtermScore = 20; 
	private final int finalExamScore = 20;
	private final int totalScore = 100;


	private double studentTotalScore = 0;

	private double studentPracticeProbScore = 0;
	private double studentLabsScore = 0;
	private double studentMidtermScore = 0; 
	private double studentFinalExamScore = 0;
	

	//contructor
	public Student(int studentPracticeProb, int studentLabs, int studentMidterm1, int studentMidterm2, int studentFinalScore){
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

	private void calculateStudentLabScore(int studentLabs){
		studentLabsScore = studentLabs * (16/7);
		studentTotalScore += studentLabsScore;
	}

	private void calculateStudentMidTermScore(int studentMidterm){
		studentMidtermScore = (studentMidterm/100) * 10;
		studentTotalScore += studentMidtermScore;

	}

	private void calculateStudentFinalScore(int studentFinal){
		studentFinalExamScore = (studentFinal/100) * 20;
		studentTotalScore += studentFinalExamScore;

	}

	public String toString(){
		return "Student Scored a " + studentTotalScore;
	}




}