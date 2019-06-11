package com.company;

import java.util.*;

public class Welcome {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<Team> teamList = new ArrayList<>();

    public static void WelcomePrompt() throws InterruptedException {

        /*
        todo - Create two methods for the teamName and stadiumName that return the Strings
        aswell as the print statements. Then you can insert the method Names into the objects.
        Then can have the arrayLists in the bulk of the class, so a viewSquad method would
        then be able to see these... what could go wrong.
        */

        System.out.println("Welcome to Football Manager - 5 a side version\n");
        System.out.println("Please Enter Your Team Name: ");
        String myTeamName = input.nextLine();
        System.out.println("Please Enter Your Stadium Name: ");
        String myStadiumName = input.nextLine();

        System.out.println("Thank You, You're in the Top Division - Week " + Main.weekNumber);
        Thread.sleep(1000);

         Stadium theOrchard = new Stadium("The Orchard", 5000);
         Stadium theBeehive = new Stadium("The Beehive", 8000);
         Stadium theOldShipyard = new Stadium("The Old Shipyard", 1912);
         Stadium myStadium = new Stadium(myStadiumName, 3000);

        Random rand = new Random();
        int rNum = rand.nextInt(10) + 1;

        String[] playerFName = {"David", "John", "Paul", "Mark", "James", "Andrew", "Scott", "Steven", "Ryan", "Phil"};
        String[] playerSName = {"Jenkins", "Allan", "Cooper", "Davies", "Hughes", "Maxwell", "Sinclair", "Wainwright", "West", "Jones"};

        ArrayList<Players> pListApple = new ArrayList<>();
        ArrayList<Players> pListBee = new ArrayList<>();
        ArrayList<Players> pListSea = new ArrayList<>();
        ArrayList<Players> pListYourTeam = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            pListApple.add(new Players(i, playerFName[rNum] + " " + playerSName[rNum], rNum, rNum, rNum, rNum));
        }

        for (int i = 5; i < 10; i++) {
            pListBee.add(new Players(i, playerFName[rNum] + " " + playerSName[rNum], rNum, rNum, rNum, rNum));
        }

        for (int i = 10; i < 15; i++) {
            pListSea.add(new Players(i, playerFName[rNum] + " " + playerSName[rNum], rNum, rNum, rNum, rNum));
        }

        for (int i = 15; i < 20; i++) {
            pListYourTeam.add(new Players(i, playerFName[rNum] + " " + playerSName[rNum], rNum, rNum, rNum, rNum));
        }

         Team appleFC = new Team("Apple F.C", 1, theOrchard, 0, 0, 0, 0, 0, pListApple);
         Team beeFC = new Team("Bee F.C", 2, theBeehive, 0, 0, 0, 0, 0, pListBee);
         Team seaFC = new Team("Sea F.C", 3, theOldShipyard, 0, 0, 0, 0, 0, pListSea);
         Team myTeam = new Team(myTeamName, 3, myStadium, 0, 0, 0, 0, 0, pListYourTeam);

        teamList.add(appleFC);
        teamList.add(beeFC);
        teamList.add(seaFC);
        teamList.add(myTeam);

    }

    public static void DisplayLeague(){

        //todo Sort and Format League
        System.out.println("\n" + "Team  |  GP  |  GW  | GL | GD | P" );
        for(int i =0; i < teamList.size(); i++){
            System.out.println(teamList.get(i).getTeamName() + " " + teamList.get(i).getGamesPlayed() + " " + teamList.get(i).getGamesWon() +
            " " + teamList.get(i).getGamesLost() + " " + teamList.get(i).getGamesDrawn() + " " + teamList.get(i).getTeamPoints());
        }
    }

    public static void fixturesAdmin() throws InterruptedException {
        System.out.println();
        switch (Main.weekNumber){
            case 1:
                System.out.println("Week " + Main.weekNumber);
                System.out.println(teamList.get(0).getTeamName() + " vs " + teamList.get(1).getTeamName());
                System.out.println(teamList.get(2).getTeamName() + " vs " + teamList.get(3).getTeamName());
                break;
            case 2:
                System.out.println("Week " + Main.weekNumber);
                System.out.println(teamList.get(1).getTeamName() + " vs " + teamList.get(2).getTeamName());
                System.out.println(teamList.get(3).getTeamName() + " vs " + teamList.get(0).getTeamName());
                break;
            case 3:
                System.out.println("Week " + Main.weekNumber);
                System.out.println(teamList.get(2).getTeamName() + " vs " + teamList.get(0).getTeamName());
                System.out.println(teamList.get(3).getTeamName() + " vs " + teamList.get(1).getTeamName());
                break;
            default:
                System.out.println("No Fixtures To Show + Week: " + Main.weekNumber);
        }
            Thread.sleep(1000);
    }

    public static void mainMenu() throws InterruptedException {
        System.out.println("\nMain Menu - Choose an Option: \n1:View League\n2:View Fixtures\n3:View/Change Squad\n4:Play Game");
        int menuChoice = input.nextInt();
        if(menuChoice == 1){
            DisplayLeague();
            mainMenu();
        } else if(menuChoice == 2){
            fixturesAdmin();
            mainMenu();
        } else if(menuChoice == 3) {
            System.out.println("Squad Functionality Not Yet Ready");
            mainMenu();
        } else if(menuChoice == 4){
            System.out.println("Game Functionality Not Yet Ready");
            mainMenu();
        } else {
            System.out.println("Something Went Wrong, Try Again!");
            mainMenu();
        }
    }

    public static void viewSquad() throws InterruptedException {


    }




}
