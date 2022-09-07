package com.ibm.activities;

public class Activity8 {

    public static void main(String[] args) {

        try {
            exceptionTest("Customized Exceptions");

            exceptionTest(null);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }

        }

    static void exceptionTest(String s) throws CustomException{

        if (s == null)
            throw new CustomException("String was not provided");
        else
            System.out.println("The string is: " + s);
    }
}

class CustomException extends Exception{

    String message;

    CustomException(String m){
        message = m;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
