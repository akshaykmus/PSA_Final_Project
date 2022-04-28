/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.neu.psa.tic.tac.toe.gui;

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
public class TrainerTest {
    
    public TrainerTest() {
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
    
//    @After
//    public    }

    /**
     * Test of check method, of class Trainer.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Trainer instance = new Trainer();
        for(int i=0;i<3;i++) instance.buttons[i].setText("X");
        boolean expResult = true;
        boolean result = instance.check();
        assertEquals(expResult, result);
        
        for(int i=0;i<3;i++) instance.buttons[i].setText(" ");
       boolean expResult2 = false;
         boolean result2 = instance.check();
         assertEquals(expResult2, result2);
     
    }

    /**
     * Test of checkfordraw method, of class Trainer.
     */
    @Test
    public void testCheckfordraw() {
        System.out.println("checkfordraw");
        Trainer instance = new Trainer();
        for(int i=0;i<3;i++) instance.buttons[i].setText(" ");
        boolean expResult = false;
        boolean result = instance.checkfordraw();
        assertEquals(expResult, result);
        instance.buttons[0].setText("X");
        instance.buttons[1].setText("O");
        instance.buttons[2].setText("X");
        instance.buttons[3].setText("X");
        instance.buttons[4].setText("O");
        instance.buttons[5].setText("X");
        instance.buttons[6].setText("O");
        instance.buttons[7].setText("X");
        instance.buttons[8].setText("O");
        boolean expResult2 = true;
        boolean result2 = instance.checkfordraw();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of boardFull method, of class Trainer.
     */
    @Test
    public void testBoardFull() {
        System.out.println("boardFull");
        Trainer instance = new Trainer();
        boolean expResult = true;
        for(int i=0;i<9;i++) instance.buttons[i].setText("X");
        boolean result = instance.boardFull();
        assertEquals(expResult, result);
        Trainer instance2 = new Trainer();
        
        boolean result2 = instance2.boardFull();
        assertEquals(false, result2);
        
}
}
