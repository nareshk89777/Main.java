package com.classes;

import java.util.Date;

public class Student {
    int[] marks;
    int studentId;
    String name;
    Date dateOfBirth;
    double avg;
    String grade = "";
    boolean sPass_Fail ;
    public Student() {
        marks = new int[6];
    }
    public boolean StStatus(){
        if(grade != "Fail"){
            System.out.println("Failed!");
        }
        else {

          studentDetails();
        }
        return false;
    }

    //-----------> Student Detailas <----------------
    public boolean studentDetails() {
        int i;
        int total = 0;
        avg = 0;
        System.out.println("---------" + name + "---------");
        System.out.println("Hallticket number : " + studentId);
        System.out.print("Marks --> ");
        for (i = 0; i < marks.length; i++) {

            System.out.print("\t" + marks[i]);

            total = total + marks[i];

        }
        avg = total / 6;

        System.out.println("\nThe total Number of marks : " + total);
        System.out.println("The Average marks of Student : " + avg);
        System.out.println("Grade --> "+grade());

        return false;
    }

    //---------------->Grade function <------------------
    public String grade() {

        if (avg > 80 && avg <= 99) {
            grade = "A+";
        } else if (avg > 70 && avg <= 80) {
            grade = "A";
        } else if (avg > 60 && avg <= 75) {
            grade = "B+";
        } else if (avg > 50 && avg <= 65) {
            grade = "B";
        } else if (avg > 45 && avg <= 55) {
            grade = "C";
        } else if (avg > 35 && avg <= 45) {
            grade = "D";
        } else {
            grade = "Fail!";
        }
        return grade;

    }
}
