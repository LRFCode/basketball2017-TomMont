package com.arkansascodingacademy;

public class Dice
{
    private Die die1;
    private Die die2;
    private Die die3;

    public Dice()
    {
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
    }

    public void roll()
    {
        die1.roll();
        die2.roll();
        die3.roll();
    }

    public int getTotalValue()
    {
        return die1.getValue() + die2.getValue() + die3.getValue();
    }
}
