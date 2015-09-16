package com.space;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlanetarySystemTest {
    @Test
    public void canConstructAndGetName() {
        PlanetarySystem earthly = new PlanetarySystem("earthly");
        assertEquals("earthly", earthly.getName());

        PlanetarySystem x = new PlanetarySystem("earthly");
        assertEquals("earthly", earthly.getName());
    }

    @Test
    public void canAddPlanets() {
        PlanetarySystem solar = new PlanetarySystem("our solar system");
        List<String> planets = new ArrayList<String>();
        planets.add("earth");
        planets.add("mars");
        //just do two to test
        solar.addPlanet(planets.get(0));
        solar.addPlanet(planets.get(1));
        Iterator<String> planetNamesIter = solar.getPlanetNames();
        int numNames = 0;
        while (planetNamesIter.hasNext()) {
            assertEquals(planets.get(numNames), planetNamesIter.next());
            numNames++;
        }
        assertEquals(2, numNames);
    }
}
