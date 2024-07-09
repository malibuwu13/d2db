package com.revature.d2dbs.Player;

public class Player {

    private int steamID;
    private int matchCount;
    private int winCount;
    private int lossCount;
    private float winrate;

    private int primaryRole;
    private int secondaryRole;

    private int[10] topTenHeroes;

    //I think I want to intake steamID and call the API
    public Player(int steamID) {
        this.steamID = steamID;
        //TODO: call the API wrapper
    }

    public int getMatchCount() { return matchCount; }

    public void addMatch() { matchCount++; } //TODO include match ID and increment win/loss?

    public int getWinCount( return winCount; )

    public int getLossCount( return lossCount; )

    public float getWinrate( return winrate; )

    public int getPrimaryRole( return primaryRole; )

}
