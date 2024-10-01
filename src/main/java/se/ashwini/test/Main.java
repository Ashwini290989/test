package se.ashwini.test;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //reading name & playerID of player 1

        System.out.println("Enter the name  & playerId for player 1 ");
        String player1Name = sc.nextLine();
        int player1Id = sc.nextInt();

        // reading name & playerID of player2

        System.out.println("Enter the name & playerId for player 2 ");
        String player2name = sc.next();
        int player2ID = sc.nextInt();

        Player player1 = new Player(player1Name, player1Id);

        Player player2 = new Player(player2name, player2ID);


        //player 1 rolling chance

        int player1roll1 = rand.nextInt(6) + 1;
        System.out.println(player1.getName()+" "+player1.getPlayerID()+"roll the dice" +" "+player1roll1);

        int player1roll2 = rand.nextInt(6) + 1;
        System.out.println(player1.getName()+" " +player1.getPlayerID()+ "roll the dice"+" "+player1roll2);

        int sum = player1roll1 + player1roll2;

        System.out.println(player1.getName()+"get"+ sum);


        // player 2 rolling chance

        int player2roll1 = rand.nextInt(6) + 1;
        System.out.println(player2.getName()+" "+player2.getPlayerID() + "roll the dice" +" "+  player2roll1);

        int player2roll2 = rand.nextInt(6) + 1;
        System.out.println(player2.getName() +" "+player2.getPlayerID()+ "roll the dice" +" "+  player2roll2);

        int sum1 = player2roll1+player2roll2;
       System.out.println(player2.getName()+"get"+" "+ sum1);


       // deciding the winner

       if (sum > sum1) {

           System.out.println(player1.getName()+ "wins");

       }
        else if (sum1>sum) {

            System.out.println(player2.getName()+"wins");


       }
        else{
           System.out.println("it`s a tie");
       }
        sc.close();
    }

}




