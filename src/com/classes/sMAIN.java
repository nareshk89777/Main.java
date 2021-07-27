package com.classes;

public class sMAIN {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();
        s1.name = "Ramu";
        s1.studentId =101;
        s1.marks = new int[]{10, 34, 57,57,48,53};
        s2.name = "Rajesh";
        s2.marks = new int[]{35,76,58,34,39,69};
        s3.name = "mahesh";
        s3.marks = new int[]{43,67,59,40,38,67};
        s4.name = "Anadand";
        s4.marks = new int[]{48,59,30,52,34,56};
        s5.name = "Madhu";
        s5.marks = new int[]{47,58,40,59,73,61};
        s6.name = "Balu";
        s6.marks = new int[]{85,65,85,78,35,47};
        s7.name = "Naresh";
        s7.marks =new int[]{11,14,10,9,6,4};



//      s1.studentDetails();
        System.out.println(s2.studentDetails());


    }


}
