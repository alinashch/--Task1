package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	int [][]mark1={{2,4,3,5},{3,5,4,4},{5,4,3,4}};
	Student s1=new Student(mark1);
	System.out.println(s1.AverageAll());
		ArrayList<Double> Averagesem1 = new ArrayList<>();
		Averagesem1=s1.AverageSem();
		for(int i=0; i<Averagesem1.size();i++){
			System.out.print(Averagesem1.get(i)+" ");
		}
		System.out.println();


		int [][]mark3={{3,4,3,5,5,3,4},{3,5,4,4},{5,4,3,4,5,4,5,3,4,4,5,3},{3,4,5}};
		Student s3=new Student(mark3);
		System.out.println(s3.AverageAll());
		s3.AverageSem();
		ArrayList<Double> Averagesem3 = new ArrayList<>();
		Averagesem3=s3.AverageSem();
		for(int i=0; i<Averagesem1.size();i++){
			System.out.print(Averagesem3.get(i)+" ");
		}
		System.out.println();



		int [][]mark2={{1,4,3,5},{3,5,4,4},{5,4,3,4}};
		Student s2=new Student(mark2);
		s2.AverageAll();
		s2.AverageSem();
	}
}
