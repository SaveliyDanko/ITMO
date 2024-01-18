package org.example.people;

import org.example.places.Places;

public class YoungMan extends Person implements YoungManActions{
    public YoungMan(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    @Override
    public String beRelative(Person person){
        return "be a relative" + person;
    }

    @Override
    public String beKind(Person person){
        return "be kind to " + person;
    }
}
