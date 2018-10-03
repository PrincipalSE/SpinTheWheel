package com.PrincipalSE.SpinTheWheel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

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

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void coinCreatedTest()
    {
        Coin coin1 = new Coin();
        assertNotNull(coin1.getSide());
    }

    @Test
    public void coinConstructorTest(){
        Coin coin = new Coin(1);
        assertEquals(1, coin.getSide());
        assertEquals("HEADS", coin.getSideString());
    }
    
    @Test
    public void coinSideTest()
    {
        Coin coin = new Coin();
        coin.setSide(1);
        assertTrue(coin.getSide() == 1);
    }



    //Exception Testing
    @Test
    public void exceptionCoinTooBig(){
        thrown.expect(IllegalArgumentException.class);
        Coin coin = new Coin(2);
    }

    @Test
    public void exceptionCoinTooSmall(){
        thrown.expect(IllegalArgumentException.class);
        Coin coin = new Coin(-1);
    }
    @Test
    public void coinFlipTest(){
        Coin coin = new Coin();
        coin.setSide(1); // set the side to HEADS
        coin.flip(); // flip the coin
        assertTrue(coin.getSide() != 1); // passes if coin is not Head after flip
    }
    
}
