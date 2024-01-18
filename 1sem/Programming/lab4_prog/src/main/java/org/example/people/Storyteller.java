package org.example.people;

import org.example.places.Places;

public class Storyteller extends Person{
    public Storyteller(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }
    public String regret(Person person){
        return " regret " + person;
    }
    public String beKind(Person person){
        return " be kind to " + person;
    }
}
