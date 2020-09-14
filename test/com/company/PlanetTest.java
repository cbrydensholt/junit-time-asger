package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void testPlanet() {

        Planet earth = new Planet("Earth", 365.25, 6371, "vores");
        assertEquals("Earth", earth.getName());
        assertEquals(365.25, earth.getLengthOfYear());
        assertEquals(6371, earth.getSize());

    }

    @Test
    void numberOfMoons(){
        Planet Earth = new Planet("Earth", 365, 6371, "Sun");
        Planet Mercury = new Planet("Mercury", 88,2439, "Sun" );
        Planet Venus = new Planet("Venus", 225, 6051, "Sun");
        Planet Mars = new Planet("Mars", 687, 3389, "Sun");





    }
}