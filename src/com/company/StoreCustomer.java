package com.company;

public class StoreCustomer {

    public static final int CLIENT_ID = 654321;

    private String name;
    private String registrationDate;
    private int discount;


    public void showMyData() {
        System.out.println(
                "Class name" + this.getClass() + ";\n" +
                        "Registration on date" + this.registrationDate + ";\n" +
                        "Discount" + this.discount + ";\n"
        );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
