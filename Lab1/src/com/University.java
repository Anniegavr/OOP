package com;
import java.util.ArrayList;

public class University{
    String uName;
    int foundationYear;
    Student[] students_lst;
    //ArrayList<Student> students_lst = new ArrayList<>();


    public University(String uName, int foundationYear, Student[] students_list){
        this.uName = uName;
        this.foundationYear = foundationYear;
        this.students_lst = students_list;
    }


    public double[] getMarks(){
        double[] sMarks = new double[students_lst.length];
        for(int i = 0; i<students_lst.length; i++){
            sMarks[i] = students_lst[i].getMark();
        };
        return (sMarks);
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < students_lst.length; i++) {
            sum += getMarks()[i];
        }
        return (sum);
    }

    public int num_of_Marks(){
        int num;
        num = students_lst.length;
        return num;
    }
}
