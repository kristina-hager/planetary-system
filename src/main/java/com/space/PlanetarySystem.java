package com.space;

import com.example.HelloPlanet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class PlanetarySystem {

    String name;
    List<HelloPlanet> planets = new ArrayList<HelloPlanet>();

    /**
     *
     */
    public PlanetarySystem(String name) {
        this.name = name;
    }

    public String getName() { 
        return new String(name);
    }

    public void addPlanet(String planetName) {
        planets.add(new HelloPlanet(planetName));
    }

    public Iterator<String> getPlanetNames() {
        List<String> names = new ArrayList<String>();
        for (int i = 0; i < planets.size(); i++) {
            names.add(planets.get(i).getName());
        }
        return names.iterator();
    }

    public static void main(String[] args) {
        PlanetarySystem p = new PlanetarySystem("solar");

        p.addPlanet("mercury");
        p.addPlanet("venus");
        p.addPlanet("earth");
        p.addPlanet("mars");
        p.addPlanet("jupiter");
        p.addPlanet("saturn");
        p.addPlanet("uranus");
        p.addPlanet("neptune");
        p.addPlanet("?pluto?");

        System.out.println("Planetary System:");
        System.out.println(p.getName());
        System.out.println("Has these planets:");
        Iterator<String> planetNamesIter = p.getPlanetNames();
        while (planetNamesIter.hasNext()) {
            System.out.println(planetNamesIter.next());
        }
    }

}
