package org.example.bodypart;

import org.example.people.Person;

public abstract class BodyPart {
    private String name;
    public BodyPart(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
    public String affiliation(Person person){
        return person + " " + name;
    }
}
