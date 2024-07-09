package com.revature.d2dbs.Match;
package com.revature.d2dbs.Player;

public class Match {

    private int matchID;
    private Player[5] radiantTeam;
    private Player[5] direTeam;


    private int radiantDeaths;
    private int direDeaths;

    private int winFlag; //0 for radiant, 1 for dire, 2+ for.... panic?

    //I'm not sure if I should pull the matchID and connect it to the API Wrapper or connect to the API Wrapper and pull
    //the full match statistics. TODO
    public Match(int matchID, /*int[5] radiantTeam, int[5]direTeam,*/) {
        this.matchID = matchID;
        //TODO call the API and pull data
    }

    public String displayWinner() {
        if (this.winFlag == 0) {
            return "Radiant";
        } else if (this.winFlag == 1) {
            return "Dire";
        }
        return "Panic mode activated"; //THIS SHOULD NEVER HAPPEN
    }

    //TODO: implement player value calculations
    public int getMVP() {
        return -1;
    }

    
}