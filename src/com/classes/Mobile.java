package com.classes;

import java.util.Date;

public class Mobile {
    int modelNumber = 5001;
    String mobileName = "Nokia";
    String ram = "20GB";
    String rom;
    int launchedYear;
    boolean phoneAvailable;
    Date manDate;
    private int age = 20;

    public Mobile(){
        System.out.println("Mobile.Mobile");

        System.out.println("----"+age);

        modelNumber = 29845;
        mobileName = "Redmi";
        ram = "4gb";
        rom = "64gb";
        launchedYear = 2015;
        //isPhoneAvailable();
    }

    public int getAge() {
        return age;
    }


    public Mobile(Date dateOfBirth, String _mName ) {
//        System.out.println("Mobile.Mobile with arg : "+ dateOfBirth);
        System.out.println("dateOfBirth = " + dateOfBirth + ", _mName = " + _mName);
        age = new Date().getYear() - dateOfBirth.getYear();
        mobileName = _mName;
    }

    public boolean isPhoneAvailable(){
        System.out.println("isPhoneAvailable called");
        return phoneAvailable ;
    }
}
