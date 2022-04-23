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
    
//    public static void main (String[] args){
//        HashTableFunctions h = new HashTableFunctions();
//        Hashtable<Integer, Integer> ht1 = h.crateNewHash();
//        h.writeToExcel(1, ht1);
//        
//    }

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
    
    
    public void reward(List<Integer> playedPos){

             ht1.put(playedPos.get(0), ht1.get(playedPos.get(0))+3);
             ht2.put(playedPos.get(1), ht2.get(playedPos.get(1))+3);
             ht3.put(playedPos.get(2), ht3.get(playedPos.get(2))+3);
            if(playedPos.size()>3) ht4.put(playedPos.get(3), ht4.get(playedPos.get(3))+3);
            if(playedPos.size()>4) ht5.put(playedPos.get(4), ht5.get(playedPos.get(4))+3);
       h.writeToExcel(1, ht1);
       h.writeToExcel(2, ht2);
       h.writeToExcel(3, ht3);
       h.writeToExcel(4, ht4);
       h.writeToExcel(5, ht5);
       System.out.println("Positions played");
       for(int i=0;i<playedPos.size();i++){
           
           System.out.println(playedPos.get(i));
       }
                                //update either hashtable or excel sheet
        
    }
    
     public void punish(List<Integer> playedPos){

             ht1.put(playedPos.get(0), ht1.get(playedPos.get(0))-1);
             ht2.put(playedPos.get(1), ht2.get(playedPos.get(1))-1);
             ht3.put(playedPos.get(2), ht3.get(playedPos.get(2))-1);
            if(playedPos.size()>3) ht4.put(playedPos.get(3), ht4.get(playedPos.get(3))-1);
            if(playedPos.size()>4) ht5.put(playedPos.get(4), ht5.get(playedPos.get(4))-1);
       h.writeToExcel(1, ht1);
       h.writeToExcel(2, ht2);
       h.writeToExcel(3, ht3);
       h.writeToExcel(4, ht4);
       h.writeToExcel(5, ht5);
       System.out.println("Positions played");
       for(int i=0;i<playedPos.size();i++){
           
           System.out.println(playedPos.get(i));
       }
                                //update either hashtable or excel sheet
        
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
