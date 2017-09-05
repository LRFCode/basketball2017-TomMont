package com.arkansascodingacademy;

/**
 * Created by lrflr on 9/5/2017.
 */
public class Team
{
    private int points = 0;
    private final String team;

    public int getPoints()
    {
        return points;
    }

    public void scorePoints(int points)
    {
        this.points += points;
    }

    public Team(String name)
    {
        this.team = name;
    }
    public String getTeam()
    {
        return team;
    }
}
