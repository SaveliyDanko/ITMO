package org.example.exceptions;

public class InvalidLanguage extends Exception{
    public InvalidLanguage(){}
    public InvalidLanguage(String message){
        super(message);
    }
}
