package com.arkansascodingacademy;

//BRONZE See below COMPLETE
//SILVER Add a team name to the constructor for team and use the team name when printing out game info COMPLETE
//SILVER Add a third die and your own additional points based on it COMPLETE
//GOLD If both teams "win" on the same turn with the same score go into
//     overtime...next score wins
//GOLD If a team scores a foul shot let them have another turn
public class BasketballGame
{
    private Dice dice = new Dice();
    private Team home = new Team("Tacos");
    private Team visitor = new Team("Burgers");

    public void play()
    {
        boolean gameOver = false;

        while (!gameOver)
        {
            playRound();

            if (home.getPoints() >= 21)
            {
                gameOver = true;
                System.out.println(home.getTeam() + " Team Wins!");
            }
            else if (visitor.getPoints() >= 21)
            {
                gameOver = true;
                System.out.println(visitor.getTeam() + " Team Wins!");
            }


            //TODO BRONZE Code the visitor team COMPLETE?

        }
    }

    private void playRound()
    {
        dice.roll();
        System.out.println(dice.getTotalValue() + " is " + home.getTeam() + " roll");

        //TODO BRONZE Print out the dice rolls  COMPLETE

        int homePoints = getPoints(dice.getTotalValue());

        home.scorePoints(homePoints);

        dice.roll();
        System.out.println(dice.getTotalValue() + " is " + visitor.getTeam() + " roll");

        int visitorPoints = getPoints(dice.getTotalValue());

        visitor.scorePoints(visitorPoints);

        //TODO BRONZE Code the visitor team COMPLETE

    }

    //Given a number return the correct number of points to add
    //TODO BRONZE Translate other values  COMPLETE
    //TODO BRONZE Print out the description of the play result for each outcome  COMPLETE
    private int getPoints(int number)
    {
        int points = 0;

        if (number == 2 || number == 10 || number == 12)
        {
            points = 3;
            System.out.println("scored a 3 pointer yo!");
        }
        else if (number == 4 || number == 6 || number == 8) //4, 6, 8
        {
            points = 2;
            System.out.println("scored a 2 poiiiiints with the assist.");
        }
        else if (number == 5) //5
        {
            points = 1;
            System.out.println("scored a solitary point.");
        }
        else if (number == 3 || number == 7 || number == 9 || number == 11 ) //3, 7, 9, 11 are all lose ball
        {
            points = 0;
            System.out.println("Turnover!");
        }
        else if (number == 13 || number == 14 || number == 15 || number == 16 || number == 17 || number ==18 )
        {
            points = 4;
            System.out.println("You did the impossible!  4 points!");
        }

        return points;
    }

}
