package com.revature.d2dbs.Team;
package com.revature.d2dbs.Player;

public class Team {

    private Player[5] players;

    public Team(int[5] players) {
        for (int i = 0; i < 5; i++) {
            this.players[i] = new Player(players[i]);
        }
    }

    //TODO: display team info, find previous matches including all 5 players as a team, and display common hero combos
}