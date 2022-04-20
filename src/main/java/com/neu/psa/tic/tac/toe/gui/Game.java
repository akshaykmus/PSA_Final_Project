package com.neu.psa.tic.tac.toe.gui;

import com.neu.psa.tic.tac.toe.game.Board;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Game extends JPanel {

    public static final int SCREEN_WIDTH = 400;
    public static final int SCREEN_HEIGHT = 400;

    private final Board board;


    private static final Random random = new Random();
    private String message;

    public Game(Board board) {
        this.board = board;
        setSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //splayerAct(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void newGame() {
        message = null;
        board.reset();
        
    }

}
