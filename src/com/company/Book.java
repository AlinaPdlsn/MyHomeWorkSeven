package com.company;

public class Book {

    public static final String HAVE = "Your need have the  book this writer";

        public String name;
        public int pages;
        public String writer;

        public void showMyData(){
            System.out.println(
                    "Class Name: " + this.getClass() + ";\n" +
                    "Book name: " + this.name + ";\n" +
                    "Book page: " + this.pages + ";\n" +
                    "Book writer: " + this.writer  + ";\n");
        }

    }

