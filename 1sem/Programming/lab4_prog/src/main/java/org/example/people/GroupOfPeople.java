package org.example.people;

import org.example.places.Place;

public class GroupOfPeople{
    public String group(Person person1, Person person2){
        return person1 + " and " + person2;
    }

    public String beKind(Person person){
        return " be kind to " + person;
    }

    public String avoid(Person person){
        return " avoid" + person;
    }

    public String avoid(String person){
        return " avoid" + person;
    }

    public String escape(Place place){
        return " escape " + place;
    }

    public String escape(String place){
        return " escape " + place;
    }
}
