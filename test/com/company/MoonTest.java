package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    void orbitalTo() {

        Moon moon = new Moon("Moon", 27, 1737,"Earth");
        assertEquals("Earth", moon.getBelongingPlanet());

    }


}