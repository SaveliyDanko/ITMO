package org.example.people;

import org.example.places.Places;

public class Mother extends Person{
    public Mother(String name, int age, Gender gender, Places places) {
        super(name, age, gender, places);
    }

    public String foreheadAppear(){
        class Forehead{
            private final String name;

            public Forehead(String name){
                this.name = name;
            }
        }
        Forehead forehead = new Forehead("forehead");

        return " " + forehead.name;
    }

    public String foldAppear(){
        class Fold{
            private final String name;

            public Fold(String name){
                this.name = name;
            }
        }
        Fold fold = new Fold("fold");

        return fold.name + " appear on ";
    }

    public String silent(){
        return " silent ";
    }
    public String tense(){
        return " tense ";
    }
}
