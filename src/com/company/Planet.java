package com.company;

public class Planet extends orbitalObject {



    public void addPlanets(){

        Planet Earth = new Planet("Earth", 365, 6371, "Sun");
        Planet Mercury = new Planet("Mercury", 88,2439, "Sun" );
        Planet Venus = new Planet("Venus", 225, 6051, "Sun");
        Planet Mars = new Planet("Mars", 687, 3389, "Sun");


    }





















  String belongingSun;

    public Planet(String name, double lengthOfYear, int size, String belongingSun) {
        super(name, lengthOfYear, size);
        this.belongingSun = belongingSun;
    }

    // Planet earth = new Planet("Earth", 365.25, 6371);

    public void testPlanet(){

    }


}
