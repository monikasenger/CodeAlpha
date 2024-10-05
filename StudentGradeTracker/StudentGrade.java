package StudentGradeTracker;

import java.util.ArrayList;

public class StudentGrade {
	
private ArrayList<Double> grade;//arraylist of grade variable

//constructor of class to initialize a grade variable in arraylist
public StudentGrade() {
	grade= new ArrayList<>();
}

//method to add grade value
public void addgrade(double g) {
	grade.add(g);
}

//method to calculate average
public double average() {
	double sum=0;
	double avg;
	for(double g:grade) {
		sum+=g;
	}
	avg=sum/grade.size();
	return avg;
}

//method to find highest value among grades
public double highestgrade() {
	double high=grade.get(0);
	for(double g:grade) {
		if(g>high) {
			high=g;
		}
	}
	return high;
}

//method to find lowest value among grades
public double lowestgrade() {
	double low=grade.get(0);
	for(double g:grade) {
		if(g<low) {
			low=g;
		}
	}
	return low;
}
}
