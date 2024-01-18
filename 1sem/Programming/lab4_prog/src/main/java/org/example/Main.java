package org.example;

import org.example.animals.Horse;
import org.example.exceptions.InvalidLanguage;
import org.example.exceptions.MyNullPointerException;
import org.example.people.*;
import org.example.places.House;
import org.example.places.Places;
import org.example.places.Town;
import org.example.things.Doorstep;
import org.example.things.Money;
import org.example.things.Table;

import java.util.Scanner;

class Main{
    public static void main(String[] args) throws MyNullPointerException, InvalidLanguage {
        StringBuilder sb = new StringBuilder();

        // anonymous class
        Person doctor = new Person("Doctor", 60, Gender.MAN, Places.TOWN) {
        };

        UncleUlius uncleUlius = new UncleUlius("Uncle Ulius", 45, Gender.MAN, Places.HOTEL);
        // UncleUlius uncleUlius = null;
        // if (uncleUlius == null) throw new MyNullPointerException("NullPointerException: неверная инициализация переменной");

        Father father = new Father("Father", 35, Gender.MAN, Places.HOUSE);
        Town town = new Town("Town");
        House house = new House("House");
        Money money = new Money("money", "iron");
        Swatensons swatensons = new Swatensons("Swatensons");
        YoungMan youngMan = new YoungMan("Young Man", 25, Gender.MAN, Places.HOUSE);
        Storyteller storyteller = new Storyteller("Storyteller", 22, Gender.WOMAN, Places.HOUSE);
        GroupOfPeople groupOfPeople = new GroupOfPeople();
        UncleUlius.Eye uncleUliusEye = uncleUlius.new Eye("eye", "blue");
        Horse horse = new Horse("horse", 10);
        Bosse bosse = new Bosse("Bosse", 10, Gender.MAN, Places.HOUSE);
        Betan betan = new Betan("Betan", 10, Gender.MAN, Places.HOUSE);
        Table table = new Table("table", "wood");

        Mother mother = new Mother("Mother", 35, Gender.WOMAN, Places.HOUSE);
        Doorstep doorstep = new Doorstep("doorstep", "wood");
        Baby baby = new Baby("Baby", 5, Gender.MAN, Places.HOUSE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите язык: ru & en");
        if (scanner.hasNextLine()) {
            String language = scanner.nextLine();
            if (language.equals("en")){
                sb.append(uncleUlius).append(uncleUlius.beRelative(father)).append(". ").append(uncleUlius).append(uncleUlius.go(town)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.consult(doctor)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.remain(house)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.resist()).append("and ").append(uncleUlius).append(uncleUlius.remain(town.buildHotel())).append(".\n")
                        .append(uncleUlius).append(uncleUlius.have(money)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.resist()).append(" and ").append(uncleUlius.spent(money)).append(".\n")
                        .append(swatensons).append(swatensons.cry(uncleUlius)).append(".\n")

                        .append(youngMan).append(youngMan.beRelative(uncleUlius)).append(".\n")
                        .append(storyteller).append(storyteller.regret(uncleUlius)).append(".\n")
                        .append(groupOfPeople.group(youngMan, storyteller)).append(groupOfPeople.beKind(uncleUlius)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.remain(house)).append(" and ").append(uncleUlius).append(uncleUlius.torment(groupOfPeople.group(bosse, betan))).append(".\n")
                        .append(uncleUlius).append(uncleUlius.picky(table)).append(" and ").append(uncleUlius).append(uncleUlius.cry()).append(".\n")
                        .append(mother.foldAppear()).append(mother).append(mother.foreheadAppear()).append(".\n")
                        .append(mother).append(mother.silent()).append(" and ").append(mother.tense()).append(".\n")
                        .append(father).append(father.silent()).append(father).append(father.tense()).append(".\n")
                        .append(uncleUlius).append(uncleUlius.step(doorstep)).append(" ").append(house).append(groupOfPeople.group(bosse, betan)).append(groupOfPeople.avoid(uncleUliusEye.affiliation())).append(".\n")
                        .append(groupOfPeople.group(bosse, betan)).append(groupOfPeople.escape(house)).append(" when ").append(uncleUlius).append(uncleUlius.visit(house)).append(".\n")

                        .append(baby).append(baby.beKind(uncleUlius)).append(".\n")
                        .append(baby).append(baby.annoy()).append(".\n")
                        .append(baby).append(baby.draw(horse)).append(".\n")
                        .append(uncleUlius).append(uncleUlius.say("Bad Horse"));

                String finalText = sb.toString();

                System.out.println(finalText);
            }
            else{
                throw new InvalidLanguage("Язвк введён некорректно");
            }
        }
        else {
            throw new InvalidLanguage("Ввод не является строкой");
        }

    }
}