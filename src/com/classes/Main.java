package com.classes;

import java.util.Date;

public class Main {
    int i;

    public static void main(String[] args) {

       /* // Student details
        NewClass ravi = new NewClass();
        NewClass raju = new NewClass();
        // Ravi details
        ravi.studentId = 101;
        ravi.Address = "Kurnool";
        ravi.name = "Ravi";
        ravi.yearOfPass = 2017;
       // Raju details
        raju.studentId = 102;
        raju.Address = "Kurnool";
        raju.name = "Raju";
        raju.yearOfPass = 2017;
        // Printing Ravi Details
        System.out.println("---------> Ravi  Details <--------------");
        System.out.println(ravi.Address);
        System.out.println(ravi.name);
        System.out.println(ravi.studentId);
        System.out.println(ravi.yearOfPass);
        System.out.println(ravi.isStudentNotEligible());
        // Printing Raju details
        System.out.println("---------> Raju  Details <--------------");
        System.out.println(raju.Address);
        System.out.println(raju.name);
        System.out.println(raju.studentId);
        System.out.println(raju.yearOfPass);
        System.out.println(ravi.c);
        System.out.println(raju.c);
        System.out.println(raju.isStudentEligible());

        //--------------> Mobile Details<----------------
        var mdate = new Date(115,05,15);

//        Mobile oppo = new Mobile(mdate,"Redmi");
        Mobile oppo = new Mobile();
        System.out.println(oppo.mobileName);
        System.out.println("Age : = "+oppo.getAge());
//        System.out.println(oppo.age);
        // printing Mobile Details Through the Constructor
        /*System.out.println("--------------> Mobile Details <----------------");
        System.out.println("The launched Year is "+oppo.launchedYear);
        System.out.println("Mobile Availability Status"+oppo.phoneAvailable);
        System.out.println("The Mobile name"+oppo.mobileName);
        System.out.println("Specified Ram is : "+oppo.ram);
        System.out.println("Specified Rom is : "+oppo.rom);
*/
        //---------------------> Bank Customer Details <--------------------\
        int[] arr ={10,15,26,17,65,15,28,49,15,654,74,48,87,45,8,48,95,57,25,24,65,54};
        System.out.println(arr.length);

        int i= 0;
        for(i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even number :"+ arr[i]);
            }
            else {
                System.out.println("Odd number :"+ arr[i]);
            }
        }
    }

}

