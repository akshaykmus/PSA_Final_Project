/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;
import java.util.Random;
import javax.swing.JButton;
/**
 *
 * @author akshaykumthimatad
 */
public class EasyMenace {
    
    
    
    public int easyMove(JButton[] buttons){
        
        Random ran = new Random();
        // check if place is empty;if true then return index of empty space.
        // TODO: check for Draw
        int a = ran.nextInt(9);
        while(buttons[a].getText()!=""){
        a = ran.nextInt(9);
        }
        return a;
   
       
        
    }
    
}
