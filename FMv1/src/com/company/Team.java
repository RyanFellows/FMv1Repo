package com.company;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private int teamId;
    private Stadium stadium;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesDrawn;
    private int gamesLost;
    private int teamPoints;
    ArrayList<Players> playerList;

    public Team(){}

    public Team(String teamName, int teamId, Stadium stadium, int gamesPlayed, int gamesWon, int gamesDrawn, int gamesLost, int teamPoints, ArrayList<Players> playerList) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.stadium = stadium;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesDrawn = gamesDrawn;
        this.gamesLost = gamesLost;
        this.teamPoints = teamPoints;
        this.playerList = playerList;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public void setGamesDrawn(int gamesDrawn) {
        this.gamesDrawn = gamesDrawn;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getTeamPoints() {
        return teamPoints;
    }

    public void setTeamPoints(int teamPoints) {
        this.teamPoints = teamPoints;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public ArrayList<Players> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Players> playerList) {
        this.playerList = playerList;
    }


}
