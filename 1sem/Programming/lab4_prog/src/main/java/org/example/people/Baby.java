package org.example.people;

import org.example.animals.Animal;
import org.example.places.Places;

public class Baby extends Person implements BabyActions{
    public Baby(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    @Override
    public String beKind(Person person){
        return " be kind to " + person;
    }

    @Override
    public String annoy(){
        return " annoy";
    }

    @Override
    public String draw(Animal animal){
        return " draw " + animal;
    }
}
