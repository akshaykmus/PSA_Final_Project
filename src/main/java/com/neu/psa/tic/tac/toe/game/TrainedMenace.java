/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import javax.swing.JButton;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author akshaykumthimatad
 */
public class TrainedMenace {

    HashTableFunctions h = new HashTableFunctions();
    Hashtable<Integer, Integer> ht1 = h.crateNewHash();
    Hashtable<Integer, Integer> ht2 = h.crateNewHash();
    Hashtable<Integer, Integer> ht3 = h.crateNewHash();
    Hashtable<Integer, Integer> ht4 = h.crateNewHash();
    Hashtable<Integer, Integer> ht5 = h.crateNewHash();

    public void init() {
        ht1 = h.readFromExcel(ht1, 1);
        ht2 = h.readFromExcel(ht2, 2);
        ht3 = h.readFromExcel(ht3, 3);
        ht4 = h.readFromExcel(ht4, 4);
        ht5 = h.readFromExcel(ht5, 5);

    }
    
    
    

    public int menacemove(JButton[] buttons,int move,List<Integer> empty) {
        int key=-1;
        init();
        
        
        if(move==1){
             key = h.getMaxValueFromHashTable(ht1,empty);
             System.out.println(key);
            
        }
        else if(move==2){
             key = h.getMaxValueFromHashTable(ht2,empty);
            
            
        }
        else if(move==3){
             key = h.getMaxValueFromHashTable(ht3,empty);
           
            
        }
        else if(move==4){
             key = h.getMaxValueFromHashTable(ht4,empty);
           
            
        }
        else if(move==5){
             key = h.getMaxValueFromHashTable(ht5,empty);
           
        }
        
        
        return key;

    }

//    public int menacemove(JButton[] buttons, int move, List<Integer> emptySpaces) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}
