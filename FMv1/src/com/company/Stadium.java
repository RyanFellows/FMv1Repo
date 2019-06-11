package com.company;

public class Stadium {

    private String stadiumName;
    private int stadiumCapacity;

    public Stadium(String stadiumName, int stadiumCapacity) {
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }
}
