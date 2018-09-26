package com.PrincipalSE.SpinTheWheel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {
    /**
     * Default constructor for test class CoinTest
     */
    public CoinTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void coinCreatedTest()
    {
        Coin coin1 = new Coin();
        assertNotNull(coin1.getSide());
    }
    @Test
    public void coinSideTest()
    {
        Coin coin = new Coin();
        coin.setSide(Coin.TypeOfSide.HEAD);
    }
}
