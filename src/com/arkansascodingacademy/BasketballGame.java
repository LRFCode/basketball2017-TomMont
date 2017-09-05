package com.arkansascodingacademy;

//BRONZE See below
//SILVER Add a team name to the constructor for team and use the team name when printing out game info
//SILVER Add a third die and your own additional points based on it
//GOLD If both teams "win" on the same turn with the same score go into
//     overtime...next score wins
//GOLD If a team scores a foul shot let them have another turn
public class BasketballGame
{
    private Dice dice = new Dice();
    private Team home = new Team();
    private Team visitor = new Team();

    public void play()
    {
        boolean gameOver = false;

        while (!gameOver)
        {
            playRound();

            if (home.getPoints() >= 21)
            {
                gameOver = true;
                System.out.println("Home Team Wins!");
            }

            //TODO BRONZE Code the visitor team

        }
    }

    private void playRound()
    {
        dice.roll();

        //TODO BRONZE Print out the dice rolls

        int points = getPoints(dice.getTotalValue());

        home.scorePoints(points);

        //TODO BRONZE Code the visitor team

    }

    //Given a number return the correct number of points to add
    //TODO BRONZE Translate other values
    //TODO BRONZE Print out the description of the play result for each outcome
    private int getPoints(int number)
    {
        int points = 0;

        if (number == 2)
        {
            points = 3;
        }

        return points;
    }

}
