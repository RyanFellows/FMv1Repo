package com.company;

import java.util.Random;

public class Main {

    public static int weekNumber =0;

    public static void main(String[] args) throws InterruptedException {

        Welcome.WelcomePrompt(); //Start Menu, takes your team name and stadium, populates teams
        Welcome.DisplayLeague();
        Welcome.fixturesAdmin();
        weekNumber++;
        Welcome.mainMenu();




    }
}
