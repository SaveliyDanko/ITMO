package org.example.people;

public class Swatensons{
    private String name;

    public Swatensons(String name) {
        this.name = name;
    }

    public String cry(Person person){
        return " cry to " + person;
    }

    @Override
    public String toString(){
        return name;
    }
}
