package com.company;

public class Moon extends orbitalObject {





















    String belongingPlanet;

    public Moon(String name, double lengthOfYear, int size, String belongingPlanet) {
        super(name, lengthOfYear, size);
        this.belongingPlanet = belongingPlanet;
    }

    public void orbitalTo(){

    }

    public String getBelongingPlanet() {
        return belongingPlanet;
    }

    public void setBelongingPlanet(String belongingPlanet) {
        this.belongingPlanet = belongingPlanet;
    }



}
