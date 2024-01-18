package org.example.people;

import org.example.bodypart.BodyPart;
import org.example.places.Places;
import org.example.things.Thing;

public class Betan extends  Person{
    public Betan(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    public String escape(Thing thing){
        return "escape" + " " + thing;
    }
    public String avoid(Person person){
        return "avoid" + " " + person;
    }

    public String avoid(BodyPart bodyPart){
        return "avoid" + " " + bodyPart;
    }
    public String avoid(String string){
        return "avoid" + " " + string;
    }
}
