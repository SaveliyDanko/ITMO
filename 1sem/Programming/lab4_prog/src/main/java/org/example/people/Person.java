package org.example.people;

import org.example.places.Places;

public abstract class Person {
    private String name;
    private int age;
    private Gender gender;
    private Places places;

    protected Person(String name, int age, Gender gender, Places places){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return name;
    }
}

