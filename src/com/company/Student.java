package com.company;
import java.util.ArrayList;
public class Student {
   public int [][] mark;

    public Student(int [][] mark) throws Exception{
        if(!CorrectMark(mark)) {
            mark = null;
            throw new Exception("Invalid marks!");
        }
        this.mark = mark;
    }
    private   boolean CorrectMark(int [][] mark){
        for( int i=0; i<mark.length;i++) {
            for (int j = 0; j < mark[i].length; j++) {
                if(mark[i][j]>5 | mark[i][j]<2){
                    return  false;
                }
            }
        }
        return true;
    }
    public double AverageAll() {
        if (mark == null) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (int i = 0; i < mark.length; i++) {
            for (int j = 0; j < mark[i].length; j++) {
                sum += mark[i][j];
                count++;
            }
        }
        double average = sum / count;
        return average;

    }
    public ArrayList<Double> AverageSem() {
        if (mark == null) {
            return null;
        }
        double sum = 0;
        int count = 0;
        ArrayList<Double> Averagesem = new ArrayList<>();
        for (int i = 0; i < mark.length; i++) {
            for (int j = 0; j < mark[i].length; j++) {
                sum += mark[i][j];
                count++;
            }
            Averagesem.add(sum / count);
            sum = 0;
            count = 0;
        }

        return Averagesem;
    }
}
