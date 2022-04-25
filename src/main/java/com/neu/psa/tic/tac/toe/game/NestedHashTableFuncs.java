/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

/**
 *
 * @author dalal
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class NestedHashTableFuncs {



    //for both insert and update
        public void insertPointsToHashTable(List<Integer[]> states, Integer[] positions, Hashtable<Integer[], Hashtable<Integer, Integer>> ht, String s, List<Integer> ranks){

        Hashtable<Integer, Integer> ht2 = new Hashtable<>();
        for(int i=0;i<states.size();i++){
            if(s=="win") {
                ht2 = ht.get(states.get(i));
                ht2.put(ranks.get(i), ht2.get(ranks.get(i)) + 3);
            }
            if(s=="loss") {
                    ht2 = ht.get(states.get(i));
                ht2.put(ranks.get(i), ht2.get(ranks.get(i)) + -1);
            }
            
            // write Hash Table to object file

//            writeToExcel(i+1,ht.get(state.get(i)));
//        } else {
//                Hashtable<Integer, Integer> ht1 = new Hashtable<>();
//                ht1.put(0, 0);
//                ht1.put(1, 0);
//                ht1.put(2, 0);
//                ht1.put(3, 0);
//                ht1.put(4, 0);
//                ht1.put(5, 0);
//                ht1.put(6, 0);
//                ht1.put(7, 0);
//                ht1.put(8, 0);
//                //adding or subtracting value
//                if(s=="win") ht1 = updateHashTable(ht.get(state.get(i)),positions.get(i),3);
//                if(s=="loss") ht1 = updateHashTable(ht.get(state.get(i)), positions.get(i),-1);
//
//                writeToExcel(i+1,ht.get(state.get(i)));
//            }
        
        }
        }

    public void writeToExcel(int moveNumber, Hashtable<Integer, Integer> ht) {
        for (int i = 0; i < 9; i++) {
            System.out.println(ht.get(i).intValue());
            Excelutil.writeData(moveNumber, i+1, ht.get(i).intValue());

        }
    }

    public Hashtable<Integer, Integer> updateHashTable(Hashtable<Integer, Integer> ht, Integer position, Integer points) {
            int totalPoints = points + ht.get(position);
            ht.put(position, totalPoints);
        return ht;
    }


   public void populateHashTable(){
       Hashtable<List<Integer>, Hashtable<Integer, Integer>> ht = new Hashtable<>();
       // how do we store the states from excel [1,2,3,4,5,6,7,8,9]
       
       
   }


    public Hashtable<Integer, Integer> readStatesFromExcel(Hashtable<Integer, Integer> ht, int moveNumber) {
        for (int i = 0; i < 9; i++) {
            
            int d = (int) Excelutil.getData(moveNumber, i + 1);

            ht.put(i, d);
        }
        return ht;
    }
    }




