package com.company;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.name = "The Fellowship Of The Ring";
        book.pages = 429;
        book.writer = "Tolkien JohnRonald Reuel";

        book.showMyData();

        PostOffice postOffice = new PostOffice();
        postOffice.address = "Andreevskaya Street";
        postOffice.phoneNumber = 13243567;
        postOffice.timeOpen = "9.00";
        postOffice.timeClosed = "18.00";

        postOffice.showMyData();


        StoreCustomer storeCustomer = new StoreCustomer();
        storeCustomer.setDiscount(50);
        storeCustomer.setName("Ivanna");
        storeCustomer.setRegistrationDate("25.07");

        storeCustomer.showMyData();

    }
}
