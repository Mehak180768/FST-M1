package com.ibm.activities;

public class Activity5 {
    public static void main(String[] args) {

        MyBook newNovel = new MyBook();

        newNovel.setTitle("title");

        System.out.println("The title is: " + newNovel.getTitle());
    }
}

abstract class Book{

    String title;

    abstract void setTitle(String value);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    void setTitle(String value){
        title = value;
    }
}