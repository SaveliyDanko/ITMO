package org.example.things;

import org.example.bodypart.BodyPart;

public class Fold extends Thing{
    public Fold(String name, String material) {
        super(name, material);
    }

    public String appear(BodyPart bodyPart){
        return " appear on the " + bodyPart;
    }
}
