/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author dalal
 */

public class HashTableFunctions {

    // this func creates and initialises a new HashTable.
    // Note: HashTable values (0-8) are initialised to 0.
    public Hashtable<Integer, Integer> crateNewHash() {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        ht1.put(0, 0);
        ht1.put(1, 0);
        ht1.put(2, 0);
        ht1.put(3, 0);
        ht1.put(4, 0);
        ht1.put(5, 0);
        ht1.put(6, 0);
        ht1.put(7, 0);
        ht1.put(8, 0);
        return ht1;
    }

    public Hashtable<Integer, Integer> updateHashTable(Hashtable<Integer, Integer> ht, List<Integer> positions, Integer points) {
        for (int i = 0; i < positions.size(); i++) {
            int totalPoints = points + ht.get(positions.get(i));
            ht.put(positions.get(i), totalPoints);
        }
        return ht;
    }

    public Integer getMaxValueFromHashTable(Hashtable<Integer, Integer> ht) {
        int max = ht.get(0);
        int key = 0;

        for (int i = 1; i < 9; i++) {
            if (ht.get(i) > max) {
                max = ht.get(i);
                key = i;
            }
        }
        return key;
    }

    public void writeToExcel(int moveNumber, Hashtable<Integer, Integer> ht) {
        for (int i = 0; i < 9; i++) {
            Excelutil.writeData(moveNumber, i, ht.get(i));

        }
    }

    public Hashtable<Integer, Integer> readFromExcel(Hashtable<Integer, Integer> ht, int moveNumber) {
        for (int i = 0; i < 9; i++) {
            int d = (int) Excelutil.getData(moveNumber, i + 1);

            ht.put(i, d);
        }
        return ht;
    }
}
