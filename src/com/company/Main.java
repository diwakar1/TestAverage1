package com.company;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

public class Main
{

    public static void main(String[] args)
    {
	int score1;
	int score2;
	int score3;
	double average;
	String repeat=" ";
        Scanner input = new Scanner(System.in);
	do{
        System.out.println("Enter first score: ");
        score1= input.nextInt();
        System.out.println("Enter second score: ");
        score2= input.nextInt();
        System.out.println("Enter third score: ");
        score3= input.nextInt();
        average = (score1+score2+score3)/3;
        System.out.println("The average is: "+ average);
        System.out.println("Would you like to averqe"
                            + " another set of  test Scores");
        System.out.println("Enter Y for yes or N for No");
        repeat= input.next();

    }
     while(repeat.equalsIgnoreCase("y"));

    }
}
