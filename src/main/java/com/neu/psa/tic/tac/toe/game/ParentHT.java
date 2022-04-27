/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author dalal
 */
public class ParentHT {
    TrainedMenace tm = new TrainedMenace();
      
    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht1 =  tm.readObjectFromFile(1);
    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht2 =  tm.readObjectFromFile(2);
    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht3 = tm.readObjectFromFile(3);
    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht4 = tm.readObjectFromFile(4);
    public int index=-99;
    
    public int move = 1;
   public  Integer[] playedPos = new Integer[9];
   public  List<Integer[]> states = new ArrayList<>();
  public  List<Integer> ranks = new ArrayList<>();
    
}
