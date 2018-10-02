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
    public void testCircularArray() {
        Spinner spinner = new Spinner(4);
        int ind0 = spinner.reveal(0);
        int ind1 = spinner.reveal(4);
        assertEquals(ind0,ind1);
    }

    @Test
    public void testSpin(){
        Spinner spinner = new Spinner(2);
        spinner.spin(Integer.MAX_VALUE);
        spinner.spin(-1);
        spinner.spin(0);
    }
    @Test
    public void testSpinOnce(){
        for(int i = 0; i < 100; i ++){
            Spinner spinner = new Spinner(2);
            int ind0 = spinner.reveal(0);
            int ind1 = spinner.reveal(1);
            spinner.spin(1);
            assertEquals(ind0, spinner.reveal(1));
            assertEquals(ind1, spinner.reveal(0));
        }
    }
}
