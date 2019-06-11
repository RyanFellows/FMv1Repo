package com.company;

public class Players {
    public int getPlayerId() {
        return playerId;
    }

    private int playerId;
    private String playerName;
    private int defence;
    private int attack;
    private int passing;
    private int fitness;

    public Players(){

    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public Players(int playerId, String playerName, int defence, int attack, int passing, int fitness) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.defence = defence;
        this.attack = attack;
        this.passing = passing;
        this.fitness = fitness;
    }

}
