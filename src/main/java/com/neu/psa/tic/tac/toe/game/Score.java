package com.neu.psa.tic.tac.toe.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Score implements Serializable {
    public List<String> states = new ArrayList<>();
    public List<Integer[]> scores = new ArrayList<>();
}
