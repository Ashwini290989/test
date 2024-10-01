package se.ashwini.test;

import java.util.Scanner;

public class Player {


    private String name;
    private int playerID;


    // Constructors to initialize player

    public Player(String name, int playerID) {
        this.name = name;
        this.playerID = playerID;

    }


    public String getName() {
        return name;
    }


    public int getPlayerID() {
        return playerID;
    }

    }



