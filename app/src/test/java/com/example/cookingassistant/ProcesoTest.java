package com.example.cookingassistant;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class ProcesoTest extends TestCase {

    private Proceso proceso;

    @Before
    public void setUp()
    {
        proceso = new Proceso();
    }

    @Test
    public void procesoNotNull()
    {
        assertNotNull(proceso);
    }

    @Test
    public void testSepararDatos() {
        assertEquals(2, proceso.SepararDatos("dato1|dato2","\\|"));
    }
}