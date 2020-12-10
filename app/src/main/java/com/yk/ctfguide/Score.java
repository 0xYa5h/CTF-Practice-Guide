package com.yk.ctfguide;

import android.os.Bundle;

public class Score {
    static int score = 0;

    public void Calculate(int sc){
        score += sc;
    }
    public int updateScoreboard(){

        return score;

    }
}
