//This program is to display the Welcome message to Gambling Simulation Program.
//Use Case 1 is that As a Gambler, would start with a stake of $100 every day and bet $1 every game.
//Use Case 2 is that As a Gambler make $1 bet so either win or loose $1.
//Use Case 3 is that As a calculative Gambler if won or lost 50% of the stake, would resign for the day.
//Use Case 4 is that After 20 days of playing every day would like to know the total amount won or lost.
//Use Case 5 is that Each month would like to know the days won and lost and by how much
package com.gambling.simulation;

import java.util.Random;

public class GamblingSimulationProblem {
    //Default Constructor
    public GamblingSimulationProblem() {
        System.out.println("Welcome to Gambling Simulation Program");
        System.out.println();
        System.out.println("Gambler starts the game...");
    }

    //Declaring constants
    private final static int betMoney = 1;
    private final static int stakePerDay = 100;
    private final static double percentage = 0.5;   //as it is given 50%
    private final static  int count = 0;

    public static void main(String[] args) {

        //Initialize the object.
        GamblingSimulationProblem gambling = new GamblingSimulationProblem();
        System.out.println();
        System.out.println("Initial stake of Gambler is : "+stakePerDay);
        System.out.println("Initial betting money in gambling is : "+betMoney);
        System.out.println();
        startsGambling(gambling);

    }

    //Method for starting the game.
    public static void startsGambling(GamblingSimulationProblem gambling) {
        //Declaring variables
        Random random = new Random();
        int highestStake = (int) (stakePerDay + (stakePerDay * percentage));
        int lowestStake = (int) (stakePerDay - (stakePerDay * percentage));

        //Checking randomly if win or loose with the condition for 20 days for all month.
        checkForMonth(highestStake,lowestStake,random);
    }

    public static void checkForMonth(int highestStake, int lowestStake, Random random) {
        String s;
        int maxDays;
        for (int i = 1; i <= 12; i++)
        {
            if (i == 1)
            {
                s = "January";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s,maxDays);
            }
            else if (i == 2)
            {
                s = "February";
                maxDays = 28;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 3)
            {
                s = "March";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 4)
            {
                s = "April";
                maxDays = 30;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 5)
            {
                s = "May";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 6)
            {
                s = "June";
                maxDays = 30;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 7)
            {
                s = "July";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 8)
            {
                s = "August";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 9)
            {
                s = "September";
                maxDays = 30;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 10)
            {
                s = "October";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else if (i == 11)
            {
                s = "November";
                maxDays = 30;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
            else
            {
                s = "December";
                maxDays = 31;
                System.out.println("\n");
                System.out.println("For "+s+" :- ");
                System.out.println();
                checkingCondition(highestStake,lowestStake,random,s, maxDays);
            }
        }
    }

    public static void checkingCondition(int highestStake, int lowestStake, Random random, String s, int maxDays) {
        //Declaring few more variables.
        int totalWon = 0,totalLost = 0,totalDollars = 0;
        int maxProfit = 0,maxLoss = 0;
        for (int i = 1; i <= maxDays; i++) {
            int totalStake = stakePerDay;
            while (totalStake != highestStake && totalStake != lowestStake) {
                int bet = random.nextInt(2);
                switch (bet) {
                    case 1:
                        //Gambler Won
                        totalStake = totalStake + betMoney;
                        totalDollars = highestStake - stakePerDay;
                        maxProfit++;
                        break;
                    default:
                        //Gambler Lost
                        totalStake = totalStake - betMoney;
                        totalDollars = stakePerDay - lowestStake;
                        maxLoss++;
                        break;
                }
            }
            System.out.println("Gambler resigns for the day " +i+" for month "+s);
            System.out.println("Amount remaining at Gambler is : " + totalStake);
            System.out.println("Total won count by Gambler : "+maxProfit+" for day "+i+" for month "+s);
            System.out.println("Total lost count by Gambler : "+maxLoss+" for day "+i+" for month "+s);
            if (totalStake == highestStake)
            {
                System.out.println("Gambler won by $" +totalDollars+" for the day "+i+" for month "+s);
                totalWon = totalWon + totalDollars;
            }
            else if (totalStake == lowestStake)
            {
                System.out.println("Gambler lost by $" +totalDollars+" for the day "+i+" for month "+s);
                totalLost = totalLost + totalDollars;
            }
            System.out.println();
            maxProfit = count;
            maxLoss = count;
        }
        if (totalWon == totalLost)
        {
            System.out.println("Gambler neither having total won or total lost in month "+s);
        }
        else if(totalWon > totalLost)
        {
            int total = totalWon - totalLost;
            System.out.println("Gambler having overall total won $"+total+" in month "+s);
        }
        else if (totalLost > totalWon)
        {
            int total = totalLost - totalWon;
            System.out.println("Gambler having overall total lost $"+total+" in month "+s);
        }
    }
}