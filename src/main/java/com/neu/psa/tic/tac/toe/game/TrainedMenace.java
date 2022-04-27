/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JButton;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akshaykumthimatad
 */
public class TrainedMenace implements Serializable {

//    public static void main (String[] args){
//        HashTableFunctions h = new HashTableFunctions();
//        Hashtable<Integer, Integer> ht1 = h.crateNewHash();
//        h.writeToExcel(1, ht1);
//        
//    }
    HashTableFunctions h = new HashTableFunctions();
//    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht1 = h.createNewHashOfHash();
//    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht2 = h.createNewHashOfHash();
//    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht3 = h.createNewHashOfHash();
//    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht4 = h.createNewHashOfHash();
//    public Hashtable<Integer[], Hashtable<Integer, Integer>> ht5 = h.createNewHashOfHash();

    public void init() {
        
//        writeObjectToFile(1,new Score());
//        writeObjectToFile(2,new Score());
//        writeObjectToFile(3,new Score());
//        writeObjectToFile(4,new Score());

//        ht1 = readObjectFromFile(1);
//        ht2 = readObjectFromFile(2);
//        ht3 = readObjectFromFile(3);
//        ht4 = readObjectFromFile(4);
//      ht5 = readObjectFromFile(5);

    }
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
    // not working

    public Hashtable<String, Hashtable<Integer, Integer>> checkState(int moveNumber, Hashtable<String, Hashtable<Integer, Integer>> ht, String state) {

        // if Key doesnot exist return new new hashTable with all 0 zeros
        if (ht.containsKey(state) == false) {
            System.out.println("Adding a new state on check state!!!");
            System.out.print(state);
            
            HashTableFunctions h = new HashTableFunctions();
            Hashtable<Integer, Integer> newHash = h.crateNewHash();
            ht.put(state, newHash);
            Score obj = new Score();
            obj = convertHTtoObj(ht);
            writeObjectToFile(moveNumber, obj);
        }

        return ht;
    }

    public int getMaxValuefromInner(Hashtable<String, Hashtable<Integer, Integer>> ht, String state, List<Integer> emptySpaces) {
        Hashtable<Integer, Integer> innerHash = ht.get(state);
        HashTableFunctions h = new HashTableFunctions();
        return h.getMaxValueFromHashTable(innerHash, emptySpaces);
    }

    public ParentHT menacemove(ParentHT pHT, JButton[] buttons, int move, List<Integer> empty,Integer[] playedPos) {
//        ParentHT pHT = new ParentHT();
        int key = -1;
//        init(); // read from file
//       pHT.ht1 = readObjectFromFile(1);
//        pHT.ht2 = readObjectFromFile(2);
//        pHT.ht3 = readObjectFromFile(3);
//        pHT.ht4 = readObjectFromFile(4);
        if (move == 1) {
            pHT.ht1 = checkState(1, pHT.ht1, pHT.states.get(0));
            key = getMaxValuefromInner(pHT.ht1, pHT.states.get(0), empty);
        } else if (move == 2) {
            pHT.ht2 = checkState(2, pHT.ht2, pHT.states.get(1));
            key = getMaxValuefromInner(pHT.ht2, pHT.states.get(1), empty);
        } else if (move == 3) {
            pHT.ht3 = checkState(3, pHT.ht3, pHT.states.get(2));
            key = getMaxValuefromInner(pHT.ht3, pHT.states.get(2), empty);
        } else if (move == 4) {
            pHT.ht4 = checkState(4, pHT.ht4, pHT.states.get(3));
            key = getMaxValuefromInner(pHT.ht4, pHT.states.get(3), empty);
        } 
pHT.index=key;
        return pHT;

    }

    public void verifyHashTables(Hashtable<String, Hashtable<Integer, Integer>> ht) {
        Set<String> keys = ht.keySet();
        for (String key : keys) {
            System.out.println();
            System.out.println("KEY= ");
                System.out.print(key);
            
            System.out.println();
            Hashtable<Integer, Integer> ht2 = ht.get(key);
            System.out.println("The points given to this state is");
            for (int k = 0; k < 9; k++) {
                System.out.println(ht2.get(k));
            }
        }
    }

    public void insertRewards(ParentHT pHT,String s, List<Integer> ranks, List<String> states) {
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

//        pHT.ht1 = readObjectFromFile(1);
//        pHT.ht2 = readObjectFromFile(2);
//        pHT.ht3 = readObjectFromFile(3);
//        pHT.ht4 = readObjectFromFile(4);
        insertPointsToHashTable(1, states.get(0), pHT.ht1, s, ranks.get(0));
        insertPointsToHashTable(2, states.get(1), pHT.ht2, s, ranks.get(1));
        if (states.size() >= 3) {
            System.out.println("HASTABLE 3");
            insertPointsToHashTable(3, states.get(2), pHT.ht3, s, ranks.get(2));
            verifyHashTables(pHT.ht3);
        }
        
        System.out.println("HASTABLE 1");
        verifyHashTables(pHT.ht1);
        System.out.println("HASTABLE 2");
        verifyHashTables(pHT.ht2);
//        System.out.println("HASTABLE 3");
//        verifyHashTables(pHT.ht3);
        if (states.size() >= 4) {
            System.out.println("HASTABLE 4");
            insertPointsToHashTable(4, states.get(3), pHT.ht4, s, ranks.get(3));
            verifyHashTables(pHT.ht4);
        }
//        if (states.size() >= 5) {
//            System.out.println("HASTABLE 5");
//            insertPointsToHashTable(5, states.get(4), ht5, s, ranks.get(4));
//            verifyHashTables(ht5);
//        }

    }

    public void writeObjectToFile(int moveNumber, Score obj) {
        String filePath = "./src/main/java/com/neu/psa/tic/tac/toe/";
        if (moveNumber == 1) {
            filePath = filePath + "ht1.tmp";
        } else if (moveNumber == 2) {
            filePath = filePath + "ht2.tmp";
        } else if (moveNumber == 3) {
            filePath = filePath + "ht3.tmp";
        } else if (moveNumber == 4) {
            filePath = filePath + "ht4.tmp";
        } else if (moveNumber == 5) {
            filePath = filePath + "ht5.tmp";
        }
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrainedMenace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrainedMenace.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Hashtable<String, Hashtable<Integer, Integer>> readObjectFromFile(int moveNumber) {
        String filePath = "./src/main/java/com/neu/psa/tic/tac/toe/";

        if (moveNumber == 1) {
            filePath = filePath + "ht1.tmp";
        } else if (moveNumber == 2) {
            filePath = filePath + "ht2.tmp";
        } else if (moveNumber == 3) {
            filePath = filePath + "ht3.tmp";
        } else if (moveNumber == 4) {
            filePath = filePath + "ht4.tmp";
        } else if (moveNumber == 5) {
            filePath = filePath + "ht5.tmp";
        }

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Score obj = (Score) objectIn.readObject();
            objectIn.close();
            Hashtable<String, Hashtable<Integer, Integer>> hasht = convertObjToHashTable(obj);
            return hasht;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrainedMenace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrainedMenace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return null;
    }

    //for both insert and update
    public void insertPointsToHashTable(int moveNumber, String state, Hashtable<String, Hashtable<Integer, Integer>> ht, String s, Integer rank) {
       
        //System.out.println(state[3]);
//        if (ht.containsKey(state) == false) {
//            System.out.println("ADDING A NEW STATE");
//            Hashtable<Integer, Integer> newHash = h.crateNewHash();
//            ht.put(state, newHash);
//            System.out.println("***Verifying hashtable"+moveNumber);
//            verifyHashTables(ht);
//        }

        //TODO can be removed later
//        Hashtable<Integer[], Hashtable<Integer, Integer>> readht = new Hashtable<>();
//        if (moveNumber == 1) {
//            readht = readObjectFromFile(1);
//
//        } else if (moveNumber == 2) {
//            readht = readObjectFromFile(2);
//
//        } else if (moveNumber == 3) {
//            readht = readObjectFromFile(3);
//
//        } else if (moveNumber == 4) {
//            readht = readObjectFromFile(4);
//        }
        if (s == "win") {
            Hashtable<Integer, Integer> ht123 = ht.get(state);
            ht123.put(rank, ht123.get(rank) + 3);
            ht.put(state, ht123);
            Score obj = new Score();
            obj = convertHTtoObj(ht);
            writeObjectToFile(moveNumber, obj);
        }
        if (s == "loss") {
            verifyHashTables(ht);
            Hashtable<Integer, Integer> ht123 = ht.get(state);
            
            System.out.println("rank=" + rank + " Innerhash points=" + ht123.get(rank));
//            Hashtable<Integer, Integer> htabc = ht.get(state);

            ht123.put(rank, ht123.get(rank) + -1);
            ht.put(state, ht123);
            Score obj = new Score();
            obj = convertHTtoObj(ht);

            writeObjectToFile(moveNumber, obj);
        }

        // write Hash Table to object file
    }
    
    
       // convert obj to HT
    public Hashtable<String, Hashtable<Integer, Integer>> convertObjToHashTable(Score obj){
        List<String> lStates = obj.states;
        List<Integer[]> lScores = obj.scores;

        Hashtable<String, Hashtable<Integer, Integer>> ht = new Hashtable<>();
        // add all the states to hash table
    for(int i=0;i< lStates.size();i++){
    // create a inner new HT
    Hashtable<Integer, Integer> ht2 = new Hashtable<>();

    // add the respective score to that HT
    Integer[] tempScore = lScores.get(i);

    for(int j=0;j<9;j++){
        ht2.put(j,tempScore[j]);
    }
    ht.put(lStates.get(i),ht2);
    }
       return ht;
    }


    // convert HT to obj
    public Score convertHTtoObj(Hashtable<String, Hashtable<Integer, Integer>> ht){
        Score sc = new Score();
        List<String> lStates = new ArrayList<>();
        List<Integer[]> lScores =  new ArrayList<>();

        Set<String> keys = ht.keySet();
        for(String key: keys){
            lStates.add(key);
            Hashtable<Integer, Integer> ht2 =  ht.get(key);
            Integer[] tempScore = new Integer[9];
            for(int j=0;j<9;j++){
                tempScore[j] = ht2.get(j);
            }
            lScores.add(tempScore);
        }
        sc.states = lStates;
        sc.scores = lScores;
        return sc;
    }


//    public int menacemove(JButton[] buttons, int move, List<Integer> emptySpaces) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
