package com.space;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetarySystemTest {
    @Test
    public void canConstructAndGetName() {
        PlanetarySystem earthly = new PlanetarySystem("earthly");
        assertEquals("earthly", earthly.getName());

        PlanetarySystem x = new PlanetarySystem("earthly");
        assertEquals("earthly", earthly.getName());
    }
}
