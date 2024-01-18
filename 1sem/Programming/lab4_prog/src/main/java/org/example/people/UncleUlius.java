package org.example.people;

import org.example.places.Place;
import org.example.places.Places;
import org.example.things.Thing;

public class UncleUlius extends Person implements UncleUliusActions{
    public UncleUlius(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    public class Eye{
        private String name;
        private String color;

        public Eye(String name, String color){
            this.name = name;
            this.color = color;
        }

        public String affiliation(){
            return " " + UncleUlius.this.getName() + " " + name;
        }
    }

    @Override
    public String beRelative(Person person){
        return " be a relative to " + person;
    }

    @Override
    public String remain(Place place){
        return " remain in " + place;
    }

    @Override
    public String remain(String place){
        return " remain in " + place;
    }

    @Override
    public String torment(Person person){
        return " torment a " + person;
    }

    @Override
    public String torment(String person){
        return " torment a " + person;
    }
    @Override
    public String cry(){
        return " cry";
    }
    @Override
    public String step(Thing thing){
        return " step on the " + thing;
    }

    @Override
    public String picky(Thing thing){
        return " picky on the " + thing;
    }

    @Override
    public String visit(Place place){
        return " visit a " + place;
    }

    @Override
    public String have(Thing thing){
        return " have a " + thing;
    }

    @Override
    public String spent(Thing thing){
        return " spent a " + thing;
    }

    @Override
    public String go(Place place){
        return " go to " + place;
    }

    @Override
    public String resist(){
        return " resist ";
    }

    @Override
    public String say(String message){
        return " say " + message;
    }

    @Override
    public String consult(Person person){
        return " consult to a " + person;
    }

}
