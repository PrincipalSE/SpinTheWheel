package com.PrincipalSE.SpinTheWheel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpinnerTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createSpinnerTest()
    {
        Spinner spinner2 = new Spinner(0);
        assertNotNull(spinner2);
    }
    
    @Test
    public void testReveal() {
        Spinner spin = new Spinner(1);
        
    }

    @Test
    public void testSpin(){
        Spinner spin = new Spinner(2);
        
    }
}
