package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(73, 67, 38, 33);
		
		List<Integer> gradingStudents = gradingStudents(list);
		System.out.println("res :: "+gradingStudents);
		
	}

	public static List<Integer> gradingStudents(List<Integer> grades) 
	{
        for(int i=0;i<grades.size();i++)
        {
        	int grade=grades.get(i);
        	int gradeMod=grade%5;
        	int gradeLastDigit=grade%10;
        	int marksToBeAdded=0;
    		
        	if(grade>=38 && (gradeMod>2))
        	{
        		 if(gradeLastDigit>5)
        		 {
        			 marksToBeAdded=10-gradeLastDigit;
        		 }
        		 else
        		 {
        			 marksToBeAdded=5-gradeLastDigit;
        		 }
                 System.out.println("grade :: "+grade+"       grade mod :: "+gradeMod+"     gradeLatDigit :: "+gradeLastDigit+"     marks added :: "+marksToBeAdded);
        	}
        	
        	grades.set(i,grades.get(i)+marksToBeAdded);
        }
		
		
		System.out.println(grades);
		return grades;
	}

}
