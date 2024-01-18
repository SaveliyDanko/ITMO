package org.example.exceptions;

public class MyNullPointerException extends NullPointerException{
    public MyNullPointerException(){};
    public MyNullPointerException(String message){
        super(message);
    }
}
