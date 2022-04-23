package com.company;

import java.time.LocalDateTime;

public class PostOffice {

    public static final int POST_CODE = 123456;

    public String address;
    public int phoneNumber;
    public String timeOpen;
    public String timeClosed;

    public void showMyData(){ System.out.println(
            "Class Name: " +  this.getClass() + ";\n" +
                "Phone number: " +  this.phoneNumber + ";\n" +
                "Time open: " +  this.timeOpen + ";\n" +
                "Time closed: " +  this.timeClosed + ";\n" +
                "Address: " +  this.address+ ";\n"
        );
    }

}
