package StudentGradeTracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	StudentGrade sg=new StudentGrade();//object of student grade class
	
	int num;//number of grades
	double grade;// value of grade
	char ans;//want to play more
	System.out.println("\n**********STUDENT GRADE TRACKER********** ");
	do {
		System.out.println("\nEnter number of grades to track:--");
		num=sc.nextInt();
		
		//for loop to enter the grade value
		for(int i=0;i<num;i++) {
		System.out.println("Enter grade "+(i+1)+" :--");
		grade=sc.nextDouble();
		sg.addgrade(grade);
		}
		
		//print all the value of grade 
		System.out.println("Average Grade:- " + sg.average());
	    System.out.println("Highest Grade:- " + sg.highestgrade());
	    System.out.println("Lowest Grade:- " + sg.lowestgrade());
		
		System.out.println("\nDo you want to Track more Grade :  Y/N");
		 ans = sc.next().charAt(0); 
	}
	while(ans == 'y'|| ans =='Y');
	System.out.println("\nThank You For Coming :) :) ");
	
	sc.close();
	}
}
