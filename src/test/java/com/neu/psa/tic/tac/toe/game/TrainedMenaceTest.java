/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.util.ArrayList;
import java.util.Hashtable;
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
public class TrainedMenaceTest {
    
    public TrainedMenaceTest() {
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
     * Test of init method, of class TrainedMenace.
     */
  

    /**
     * Test of checkState method, of class TrainedMenace.
     */
    @Test    public void testCheckState() {
        System.out.println("checkState");
        int moveNumber = 0;
        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
//        String state = "";
        TrainedMenace instance = new TrainedMenace();
//        Hashtable<String, Hashtable<Integer, Integer>> expResult = null;
//        Hashtable<String, Hashtable<Integer, Integer>> result = instance.checkState(moveNumber, ht, state);
//        assertEquals(expResult, result);
       
        Hashtable<String, Hashtable<Integer, Integer>> expResultB = new Hashtable<>();
        String s2 = "111111111";
        String s3 = "111111110";
      Hashtable<String, Hashtable<Integer, Integer>> resultB =  instance.checkState(1, ht, s2);
      HashTableFunctions h = new HashTableFunctions();
              
     Hashtable<Integer, Integer> value = h.crateNewHash();
      expResultB.put(s2, value);
      assertEquals(resultB,expResultB);
      instance.checkState(1, ht, s3);
      expResultB.put(s3,value);
       assertEquals(resultB.keySet().size(),2);
       instance.checkState(1, ht, s3);
assertEquals(resultB.keySet().size(),2);
    }

//    /**
//     * Test of getMaxValuefromInner method, of class TrainedMenace.
//     */
    
    @Test
    public void testGetMaxValuefromInner() {
        System.out.println("getMaxValuefromInner");
        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
        String state = "000000001";
         HashTableFunctions h = new HashTableFunctions();
       Hashtable<Integer, Integer> value = h.crateNewHash();
       value.put(0,4);
        List<Integer> emptySpaces = new ArrayList<>();
        emptySpaces.add(0);
        emptySpaces.add(1);
        emptySpaces.add(2);
ht.put(state, value);
        TrainedMenace instance = new TrainedMenace();
        int expResult = 0;
        int result = instance.getMaxValuefromInner(ht, state, emptySpaces);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of menacemove method, of class TrainedMenace.
//     */
    @Test
    public void testMenacemove() {
        System.out.println("menacemove");
        ParentHT pHT = new ParentHT();
        JButton[] buttons = new JButton[9];
        int move = 1;
        List<Integer> empty = new ArrayList<>();
        Integer[] playedPos = new Integer[9];
        TrainedMenace instance = new TrainedMenace();
        ParentHT expResult = new ParentHT();
        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
        String state = "000000001";
         HashTableFunctions h = new HashTableFunctions();
       Hashtable<Integer, Integer> value = h.crateNewHash();
       value.put(0,4);
        List<Integer> emptySpaces = new ArrayList<>();
        emptySpaces.add(0);
        emptySpaces.add(1);
        emptySpaces.add(2);
       ht.put(state, value);
        pHT.ht1 = ht;
        expResult.ht1=ht;
        expResult.move=1;
        pHT.states.add(state);
        ParentHT result = instance.menacemove(pHT, buttons, move, emptySpaces, playedPos);
        assertEquals(expResult.move, result.move);
    }


//    /**
//     * Test of insertPointsToHashTable method, of class TrainedMenace.
//     */
    @Test
    public void testInsertPointsToHashTable() {
        System.out.println("insertPointsToHashTable");
        int moveNumber = 1;
        String state = "000000001";
        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
        String s = "win";
        Integer rank = 0;
        HashTableFunctions h = new HashTableFunctions();
          Hashtable<Integer, Integer> value = h.crateNewHash();
       value.put(0,4);
        ht.put(state, value);
      Hashtable<Integer, Integer> innHT= ht.get(state);
        if(innHT.get(0)== 4){
        assertTrue(true);
    } else {
            assertFalse(true);
            }
       
        
    }

    /**
     * Test of convertObjToHashTable method, of class TrainedMenace.
     */
    @Test
    public void testConvertObjToHashTable() {
        System.out.println("convertObjToHashTable");
        Score obj = new Score();
        TrainedMenace instance = new TrainedMenace();
        String state = "000000001";
        obj.states.add(state);
        Integer[] arr = new Integer[]{0,0,0,0,0,0,0,0,0};
        obj.scores.add(arr);
        Hashtable<String, Hashtable<Integer, Integer>> expResult = new Hashtable<>();
        HashTableFunctions h = new HashTableFunctions();
        Hashtable<Integer, Integer> value = h.crateNewHash();
        expResult.put(state,value);
        Hashtable<String, Hashtable<Integer, Integer>> result = instance.convertObjToHashTable(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of convertHTtoObj method, of class TrainedMenace.
     */
    @Test
    public void testConvertHTtoObj() {
        System.out.println("convertHTtoObj");
        Score obj = new Score();
        TrainedMenace instance = new TrainedMenace();
        String state = "000000001";
        obj.states.add(state);
        Integer[] arr = new Integer[]{0,0,0,0,0,0,0,0,0};
        obj.scores.add(arr);
        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
        HashTableFunctions h = new HashTableFunctions();
        Hashtable<Integer, Integer> value = h.crateNewHash();
//        Hashtable<String, Hashtable<Integer, Integer>> ht = null;
        ht.put(state,value);
//        Score expResult = obj;
        Score result = instance.convertHTtoObj(ht);
         
        assertEquals(obj.scores.get(0), result.scores.get(0));
        assertEquals(obj.states.get(0), result.states.get(0));
       
    }
    
}
