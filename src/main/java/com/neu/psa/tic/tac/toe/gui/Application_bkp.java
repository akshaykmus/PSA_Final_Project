package com.neu.psa.tic.tac.toe.gui;

import com.neu.psa.tic.tac.toe.game.Board;
import com.neu.psa.tic.tac.toe.game.EasyMenace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class Application extends JFrame implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JPanel game_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    JButton btnHard = new JButton("Hard");
    JButton btnEasy = new JButton("Easy");
    boolean player1_turn=true;


    public Application() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        textfield.setBackground(new Color(150, 150, 150));
        textfield.setForeground(new Color(0, 0, 255));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        btnEasy.setSize(100, 100);
        btnHard.setSize(100, 1 - 0);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        btnHard.addActionListener(e->newGame());
        btnEasy.addActionListener(e->newGame());
        title_panel.add(textfield);
        game_panel.add(btnEasy);
        game_panel.add(btnHard);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
        frame.add(game_panel, BorderLayout.AFTER_LAST_LINE);
        firstTurn();
    }

    public static void main(String[] args) {

        Application ex = new Application();

    }

    public boolean check() {
        //check X win conditions
        if ((buttons[0].getText() == "X")
                && (buttons[1].getText() == "X")
                && (buttons[2].getText() == "X")) {
            xWins(0, 1, 2);
            return true;
        }
        if ((buttons[3].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[5].getText() == "X")) {
            xWins(3, 4, 5);
            return true;
        }
        if ((buttons[6].getText() == "X")
                && (buttons[7].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(6, 7, 8);
            return true;
        }
        if ((buttons[0].getText() == "X")
                && (buttons[3].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(0, 3, 6);
            return true;
        }
        if ((buttons[1].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[7].getText() == "X")) {
            xWins(1, 4, 7);
            return true;
        }
        if ((buttons[2].getText() == "X")
                && (buttons[5].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(2, 5, 8);
            return true;
        }
        if ((buttons[0].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(0, 4, 8);
            return true;
        }
        if ((buttons[2].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(2, 4, 6);
            return true;
        }
        //check O win conditions
        if ((buttons[0].getText() == "O")
                && (buttons[1].getText() == "O")
                && (buttons[2].getText() == "O")) {
            oWins(0, 1, 2);
            return true;
        }
        if ((buttons[3].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[5].getText() == "O")) {
            oWins(3, 4, 5);
            return true;
        }
        if ((buttons[6].getText() == "O")
                && (buttons[7].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(6, 7, 8);
            return true;
        }
        if ((buttons[0].getText() == "O")
                && (buttons[3].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(0, 3, 6);
            return true;
        }
        if ((buttons[1].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[7].getText() == "O")) {
            oWins(1, 4, 7);
            return true;
        }
        if ((buttons[2].getText() == "O")
                && (buttons[5].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
            return true;
        }
        if ((buttons[0].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
            return true;
        }
        if ((buttons[2].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(2, 4, 6);
            return true;
        } else {
            return false;
        }
    }

    public void checkfordraw() {
        if ((buttons[0].getText() != "")
                && (buttons[1].getText() != "")
                && (buttons[2].getText() != "")
                && (buttons[3].getText() != "")
                && (buttons[4].getText() != "")
                && (buttons[5].getText() != "")
                && (buttons[6].getText() != "")
                && (buttons[7].getText() != "")
                && (buttons[8].getText() != "")
                && (check() == false)) {

            itsdraw();
        }
    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("O wins");
    }

    public void itsdraw() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("Its a Draw");
    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        if (random.nextInt(2) == 0) {
//            player1_turn = true;
//            textfield.setText("X turn");
//        } else {
//            player1_turn = false;
//            textfield.setText("O turn");
//        }
    }

//    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        
        for (int i = 0; i < 9; i++) {
            
            if (e.getSource() == buttons[i] ) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                        checkfordraw();
                    }
//                } else {

                    EasyMenace eM = new EasyMenace();
                    int index = eM.easyMove(buttons);
                    if (buttons[index].getText() == "") {
                        buttons[index].setForeground(new Color(0, 0, 255));
                        buttons[index].setText("O");
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                        checkfordraw();
                    }
                }
            }
        }
    }

    public void newGame() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        textfield.setText("Tic-Tac-Toe");
    }

    
}
