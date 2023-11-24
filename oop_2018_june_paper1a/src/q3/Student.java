package q3;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private float []marks;
	private int noOfSubjects;
	
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public float inputMarks(int index) throws MarksException{
		Scanner userInput = new Scanner(System.in);
		float mark = 0;
		
		try {
			System.out.println("Enter marks for subject " + index + " : ");
			mark = userInput.nextFloat();
			if(mark < 0 || mark > 100) {
				throw new MarksException(mark);
			}	
		}
		
		catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid mark.");
			return inputMarks(index);
		}
		
		return mark;
	}
	
	
	
	
	public void input(){
		Scanner userInput = new Scanner(System.in);
		
		boolean validNoOfSubjects = false;
		while(!validNoOfSubjects) {
			try {
				System.out.println("Enter no of subjects : ");
				this.noOfSubjects = userInput.nextInt();
				validNoOfSubjects = true;
			} catch (Exception e) {
				System.out.println("Enter a possible number");
			}
		}
		
		this.marks = new float[noOfSubjects];
		
		for (int i = 0; i < this.noOfSubjects; i++) {
			boolean valid = false;
			while (!valid) {
				try {
					this.marks[i] =	 this.inputMarks(i);
					valid = true;
				} 
				catch (MarksException e) {
					System.out.println("marks not in valid range. Please enter a valid mark between 0 abd 100.");	
				}
			}
			
			
		}
	}
	
	
	
	
	public float getAverage() {
		float total = 0;
		float average = 0;
		
		for (int i = 0; i < this.noOfSubjects; i++) {
			total += marks[i];
		}
		
		try {
			average = total / this.noOfSubjects;
		} catch (ArithmeticException e) {
			System.out.println("There are no marks entered");
		}
		
		return average;
	}
	
	
	
}
