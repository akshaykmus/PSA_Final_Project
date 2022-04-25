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
    Hashtable<Integer[], Hashtable<Integer, Integer>> ht1 = h.createNewHashOfHash();
    Hashtable<Integer[], Hashtable<Integer, Integer>> ht2 = h.createNewHashOfHash();
    Hashtable<Integer[], Hashtable<Integer, Integer>> ht3 = h.createNewHashOfHash();
    Hashtable<Integer[], Hashtable<Integer, Integer>> ht4 = h.createNewHashOfHash();
    Hashtable<Integer[], Hashtable<Integer, Integer>> ht5 = h.createNewHashOfHash();

//    public void init() {
//        ht1 = h.readFromExcel(ht1, 1);
//        ht2 = h.readFromExcel(ht2, 2);
//        ht3 = h.readFromExcel(ht3, 3);
//        ht4 = h.readFromExcel(ht4, 4);
//        ht5 = h.readFromExcel(ht5, 5);
//
//    }
//    public void reward(List<Integer> playedPos){
//
//             ht1.put(playedPos.get(0), ht1.get(playedPos.get(0))+3);
//             ht2.put(playedPos.get(1), ht2.get(playedPos.get(1))+3);
//             ht3.put(playedPos.get(2), ht3.get(playedPos.get(2))+3);
//            if(playedPos.size()>3) ht4.put(playedPos.get(3), ht4.get(playedPos.get(3))+3);
//            if(playedPos.size()>4) ht5.put(playedPos.get(4), ht5.get(playedPos.get(4))+3);
//       h.writeToExcel(1, ht1);
//       h.writeToExcel(2, ht2);
//       h.writeToExcel(3, ht3);
//       h.writeToExcel(4, ht4);
//       h.writeToExcel(5, ht5);
//       System.out.println("Positions played");
//       for(int i=0;i<playedPos.size();i++){
//           
//           System.out.println(playedPos.get(i));
//       }
//                                //update either hashtable or excel sheet
//        
//    }
//    
//     public void punish(List<Integer> playedPos){
//
//             ht1.put(playedPos.get(0), ht1.get(playedPos.get(0))-1);
//             ht2.put(playedPos.get(1), ht2.get(playedPos.get(1))-1);
//             ht3.put(playedPos.get(2), ht3.get(playedPos.get(2))-1);
//            if(playedPos.size()>3) ht4.put(playedPos.get(3), ht4.get(playedPos.get(3))-1);
//            if(playedPos.size()>4) ht5.put(playedPos.get(4), ht5.get(playedPos.get(4))-1);
//       h.writeToExcel(1, ht1);
//       h.writeToExcel(2, ht2);
//       h.writeToExcel(3, ht3);
//       h.writeToExcel(4, ht4);
//       h.writeToExcel(5, ht5);
//       System.out.println("Positions played");
//       for(int i=0;i<playedPos.size();i++){
//           
//           System.out.println(playedPos.get(i));
//       }
//                                //update either hashtable or excel sheet
//        
//    }
    public Hashtable<Integer[], Hashtable<Integer, Integer>> checkState(Hashtable<Integer[], Hashtable<Integer, Integer>> ht, Integer[] playedPos) {
        if (ht.containsKey(playedPos)) {
            return ht;
        }
        // if Key doesnot exist return new new hashTable with all 0 zeros
        HashTableFunctions h = new HashTableFunctions();
        Hashtable<Integer, Integer> newHash = h.crateNewHash();
        ht.put(playedPos, newHash);
        return ht;
    }

    public int getMaxValuefromInner(Hashtable<Integer[], Hashtable<Integer, Integer>> ht, Integer[] playedPos, List<Integer> emptySpaces) {
        Hashtable<Integer, Integer> innerHash = ht.get(playedPos);
        HashTableFunctions h = new HashTableFunctions();
        return h.getMaxValueFromHashTable(innerHash, emptySpaces);
    }

    public int menacemove(JButton[] buttons, int move, List<Integer> empty, Integer[] playedPos) {

        int key = -1;
        //init(); read from excel

        if (move == 1) {
            ht1 = checkState(ht1, playedPos);
            key = getMaxValuefromInner(ht1, playedPos, empty);
        } else if (move == 2) {
            ht2 = checkState(ht2, playedPos);
            key = getMaxValuefromInner(ht2, playedPos, empty);
        } else if (move == 3) {
            ht3 = checkState(ht3, playedPos);
            key = getMaxValuefromInner(ht3, playedPos, empty);
        } else if (move == 4) {
            ht4 = checkState(ht4, playedPos);
            key = getMaxValuefromInner(ht4, playedPos, empty);
        } else if (move == 5) {
            ht5 = checkState(ht5, playedPos);
            key = getMaxValuefromInner(ht5, playedPos, empty);
        }

        return key;

    }

    public void insertRewards(String s, List<Integer> ranks, List<Integer[]> states) {
//        System.out.println(s);
//        for (int i = 0; i < ranks.size(); i++) {
//            System.out.println(ranks.get(i));
//        }
//        for (int i = 0; i < states.size(); i++) {
//            Integer[] x = states.get(i);
//            //System.out.println(states.get(i));
//            for (int j = 0; j < x.length; j++) {
//                System.out.print(x[j]);
//            }
//        }
        insertPointsToHashTable(states.get(0), ht1, s, ranks.get(0));
        insertPointsToHashTable(states.get(1), ht2, s, ranks.get(1));
        insertPointsToHashTable(states.get(2), ht3, s, ranks.get(2));
        if (states.size() >= 4) {
            insertPointsToHashTable(states.get(3), ht4, s, ranks.get(3));
        }
        if (states.size() >= 5) {
            insertPointsToHashTable(states.get(4), ht5, s, ranks.get(4));
        }

    }

    //for both insert and update
    public void insertPointsToHashTable(Integer[] state, Hashtable<Integer[], Hashtable<Integer, Integer>> ht, String s, Integer rank) {
        for (int i = 0; i < state.length; i++) {
            System.out.println(state[i]);
        }
        //System.out.println(state[3]);

        if (s == "win") {
            Hashtable<Integer, Integer> ht2 = ht.get(state);
            ht2.put(rank, ht2.get(rank) + 3);
            ht.put(state, ht2);
        }
        if (s == "loss") {
            Hashtable<Integer, Integer> ht2 = ht.get(state);
            ht2.put(rank, ht2.get(rank) + -1);
            ht.put(state, ht2);
        }

        // write Hash Table to object file
    }

//    public int menacemove(JButton[] buttons, int move, List<Integer> emptySpaces) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
