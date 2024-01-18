package org.example.people;

import org.example.places.Places;

public class Father extends Person{
    public Father(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    public String silent(){
        return " silent ";
    }
    public String tense(){
        return " tense ";
    }
}
