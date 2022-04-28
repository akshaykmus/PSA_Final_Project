/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dalal
 */
public class HumanStrategyTest {
    
    public HumanStrategyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllEmptySpacesOnBoard method, of class HumanStrategy.
     */
    @Test
    public void testGetAllEmptySpacesOnBoard() {
        System.out.println("getAllEmptySpacesOnBoard");
        Integer[] matrix = new Integer[]{-1,-1,-1,-1,-1,-1,-1,-1,-1};
        
        HumanStrategy instance = new HumanStrategy();
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllEmptySpacesOnBoard(matrix);
        assertTrue(9==result.size());
    }

    /**
     * Test of checkCentre method, of class HumanStrategy.
     */
    @Test
    public void testCheckCentre() {
        System.out.println("checkCentre");
        List<Integer> emptySpaces = new ArrayList<>();
        emptySpaces.add(4);
        HumanStrategy instance = new HumanStrategy();
        boolean expResult = true;
        boolean result = instance.checkCentre(emptySpaces);
        assertEquals(expResult, result);
        emptySpaces.remove(0);
        emptySpaces.add(1);
        boolean result2 = instance.checkCentre(emptySpaces);
        assertFalse(result2);
        
    }

    /**
     * Test of checkCorners method, of class HumanStrategy.
     */
    @Test
    public void testCheckCorners() {
        System.out.println("checkCorners");
        List<Integer> emptySpaces = new ArrayList<>();
        emptySpaces.add(0);
        HumanStrategy instance = new HumanStrategy();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        List<Integer> result = instance.checkCorners(emptySpaces);
        assertEquals(expResult.get(0), result.get(0));
        
    }

    /**
     * Test of checkEdges method, of class HumanStrategy.
     */
    @Test
    public void testCheckEdges() {
        System.out.println("checkEdges");
        List<Integer> emptySpaces = new ArrayList<>();
        emptySpaces.add(1);
        HumanStrategy instance = new HumanStrategy();
        List<Integer> expResult = new ArrayList<>();
        List<Integer> result = instance.checkEdges(emptySpaces);
        expResult.add(1);
        assertEquals(expResult.get(0), result.get(0));
    }


    /**
     * Test of isWinner method, of class HumanStrategy.
     */
    @Test
    public void testIsWinner() {
        System.out.println("isWinner");
        Integer[] cp = new Integer[]{-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int type = 0;
        HumanStrategy instance = new HumanStrategy();
        boolean expResult = true;
        boolean result = instance.isWinner(cp, -1);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getNewBoard method, of class HumanStrategy.
     */
    @Test
    public void testGetNewBoard() {
        System.out.println("getNewBoard");
        HumanStrategy instance = new HumanStrategy();
        Integer[] cp = new Integer[]{-1,-1,-1,-1,-1,-1,-1,-1,-1};
        
        Integer[] result = instance.getNewBoard();
        assertTrue(cp.length==result.length);    
    }

    
}
