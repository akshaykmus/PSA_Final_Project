package com.neu.psa.tic.tac.toe.gui;

import com.neu.psa.tic.tac.toe.game.Board;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {

        initUI();
    }

    private void initUI() {

        Game game = new Game(new Board());
        add(game, BorderLayout.CENTER);

        JPanel commands = new JPanel(new BorderLayout());
        add(commands, BorderLayout.SOUTH);

        JButton btnHard = new JButton("Hard");
        btnHard.addActionListener(e -> game.newGame());
        commands.add(btnHard, BorderLayout.WEST);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setSize(new Dimension(Game.SCREEN_WIDTH + 20, Game.SCREEN_HEIGHT + 80));


        JButton btnEasy = new JButton("Easy");
        btnEasy.addActionListener(e -> game.newGame());
        commands.add(btnEasy, BorderLayout.EAST);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setSize(new Dimension(Game.SCREEN_WIDTH + 20, Game.SCREEN_HEIGHT + 80));


    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}
