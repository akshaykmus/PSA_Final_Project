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
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HumanStrategy {
    // empty space =-1, Human play=1, Trained bot play=0;
    public List<Integer> getAllEmptySpacesOnBoard(Integer[] matrix){
        List<Integer> emptySpaces = new ArrayList<>();
        for(int i=0;i<9;i++){
            if (matrix[i] == -1) {
                emptySpaces.add(i);
            }
        }
        return emptySpaces;
    }

    public boolean checkCentre(List<Integer> emptySpaces){
        for(int i=0;i<emptySpaces.size();i++){
            if(emptySpaces.get(i)==4){
                return true;
            }
        }
        return false;
    }


    public List<Integer> checkCorners(List<Integer> emptySpaces){
        List<Integer> corners = new ArrayList<>();
        for(int i=0;i<emptySpaces.size();i++){
            if(emptySpaces.get(i)==0 || emptySpaces.get(i)==2 || emptySpaces.get(i)==6 || emptySpaces.get(i)==8){
                corners.add(emptySpaces.get(i));
            }
        }
        return corners;
    }

    public List<Integer> checkEdges(List<Integer> emptySpaces){
        List<Integer> edges = new ArrayList<>();
        for(int i=0;i<emptySpaces.size();i++){
            if(emptySpaces.get(i)==1 || emptySpaces.get(i)==3 || emptySpaces.get(i)==5 || emptySpaces.get(i)==7){
                edges.add(emptySpaces.get(i));
            }
        }
        return edges;
    }

    public int chooseRandomPosition(List<Integer> lst){
        if(lst.size()==0) return -99;
        if(lst.size()==1) return lst.get(0);
        Random rand = new Random();
        int randomElement = lst.get(rand.nextInt(lst.size()));
        return randomElement;
    }

    public boolean isBoardFull(Integer[] matrix){
        for(int i=0;i<9;i++){
            if (matrix[i] == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinner(Integer cp[], int type){
        // check rows
        if(cp[0]== type && cp[1]== type && cp[2]== type || cp[3]== type && cp[4]== type && cp[5]== type || cp[6]== type && cp[7]== type && cp[8]== type) return true;
        // check columns
        if(cp[0]== type && cp[3]== type && cp[6]== type || cp[1]== type && cp[4]== type && cp[7]== type || cp[2]== type && cp[5]== type && cp[8]== type) return true;
        // check diagonals
        if(cp[0]== type && cp[4]== type && cp[8]== type || cp[2]== type && cp[4]== type && cp[6]== type) return true;

        // finally - if nothing matches then
        return false;
    }

    public Integer[] getNewBoard(){
        Integer[] board = new Integer[9];
        for(int i=0;i<9;i++) board[i]=-1;
        return board;
    }

    public Integer[] copyBoard(Integer[] board){
        Integer[] cp = new Integer[9];
        for(int i=0;i<board.length;i++) cp[i] = board[i];
        return cp;
    }


    public void humanBotMove(Integer[] board){
        int fillPosition=-99;
        List<Integer> emptySpaces = getAllEmptySpacesOnBoard(board);
        System.out.println("Empty spaces are: ");
        for(int i=0;i<emptySpaces.size();i++) System.out.print(emptySpaces.get(i)+ ", ");
        System.out.println();
        //check if its a winning move
        for(int i=0;i<emptySpaces.size();i++){
            Integer[] cp = copyBoard(board);
            cp[emptySpaces.get(i)]=1;

            if(isWinner(cp, 1) == true){
                fillPosition = emptySpaces.get(i);
            }
        }

        if(fillPosition!=-99){
            board[fillPosition]=1;
            return;
        }
        emptySpaces = getAllEmptySpacesOnBoard(board);

        //check for blocking opponent
        for(int i=0;i<emptySpaces.size();i++){
            Integer[] cp = copyBoard(board);
            cp[emptySpaces.get(i)]=0;
            if(isWinner(cp, 0) == true){
                fillPosition = emptySpaces.get(i);
            }
        }

        if(fillPosition!=-99){
            board[fillPosition]=1;
            return;
        }

        // play centre
        if(board[4]!=0 && board[4]==-1){
            board[4]=1;
            return;
        }
        emptySpaces = getAllEmptySpacesOnBoard(board);
        printList(emptySpaces,"Empty spaces in before corners");

        //play corners
        List<Integer> corners = new ArrayList<>();
        corners = checkCorners(emptySpaces);
        printList(corners, "corners");
        fillPosition = chooseRandomPosition(corners);
        if(fillPosition!=-99) {
            board[fillPosition] = 1;
            return;
        }
        emptySpaces = getAllEmptySpacesOnBoard(board);
        printList(emptySpaces,"Empty spaces in after corners");

        // play edges
        List<Integer> edges = checkEdges(emptySpaces);
        printList(edges, "edges");
        fillPosition = chooseRandomPosition(edges);
        if(fillPosition!=-99) {
            board[fillPosition] = 1;
            return;
        }
        emptySpaces = getAllEmptySpacesOnBoard(board);
    }

    public void realPlayerMove(Integer[] board){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your move (0-9)");
        int a= sc.nextInt();
        board[a]=0;
    }

    public void printBoard(Integer[] board){
        for(int i=0;i<3;i++){
            System.out.print(board[i] + " | ");
        }

        System.out.println();
        System.out.println("-----------");
        for(int i=3;i<6;i++){
            System.out.print(board[i]+ " | ");
        }
        System.out.println();
        System.out.println("-----------");
        for(int i=6;i<9;i++){
            System.out.print(board[i]+ " | ");
        }
        System.out.println();
        System.out.println("-----------");
    }

    public void trainedBotMove(){

    }

    public void printList(List<Integer> list, String type){
        System.out.println("Printing available " + type);
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.println();
    }

    public List<Integer> removeFromList(List<Integer> list, int x){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x) list.remove(i);
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println("Lets play Menace!");
        HumanStrategy h = new HumanStrategy();
        Integer[] board = h.getNewBoard();

        while(true){


            h.realPlayerMove(board);
            if(h.isWinner(board, 0)==true){
                System.out.println("Real player Won!");
                return;
            }
            if(h.isBoardFull(board)==true){
                System.out.println("TIE game!");
                return;
            }
            h.printBoard(board);



            System.out.println("Human bot has played:");
            h.humanBotMove(board);
            if(h.isWinner(board, 1)==true){
                System.out.println("Human bot Won!");
                return;
            }
            if(h.isBoardFull(board)==true){
                System.out.println("TIE game!");
                return;
            }
            h.printBoard(board);
        }
    }
}
