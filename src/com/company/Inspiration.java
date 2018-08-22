package com.company;

import java.util.Random;
import java.util.Scanner;

public class Inspiration {

    public static void main(String[] args) {

        Random r = new Random();
        String response = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your career goal?");
        String goal = keyboard.nextLine();
        keyboard.close();

        int choice = 1 + r.nextInt(15);

        if(choice == 1)
            response = "the man who goes furthest is generally the one who is" +
                    "willing to do and dare.";
        else if(choice == 2)
            response = "obstacles are those frightful things you see when you " +
                    "take your eyes off your goal.";
        else if(choice == 3)
            response = "hard work pays off in the future laziness pays off " +
                    "now.";
        else if(choice == 4)
            response = "what may be done at any time will be done at no time.";
        else if(choice == 5)
            response = "you learn from your mistakes when you aren't busy " +
                    "denying them.";
        else if(choice == 6)
            response = "you will travel to many exotice places in your life.";
        else if(choice == 7)
            response = "there are no secrets to success. it is the result of " +
                    "preparation hard work and learning from failure";
        else if(choice == 8)
            response = "it is amazing what you can accomplish if you do not " +
                    "care who gets the credit";
        else if(choice == 9)
            response = "you should boom where you are planted.";
        else if(choice == 10)
            response = "all the water in the world can't sink a ship unless it " +
                    "gets inside";
        else if(choice == 11)
            response = "a winner never cheats and a cheater never wins.";
        else if(choice == 12)
            response = "People don not lack strength, they lack will.";
        else if(choice == 13)
            response = "you may be disappointed if you fail but you are " +
                    "doomed if you don't try.";
        else if(choice == 14)
            response = "Life is 10% what happens to you and 90% how you react" +
                    " to it";
        else if (choice == 15)
            response = "no one is wise by birth. wisdom results from one’s " +
                    "own efforts.";
        else
            response = "To know what you know and what you do not know, that " +
                    "is true knowledge.";

        System.out.println("Good luck with your goal: " + goal + ".");
        System.out.println("It has been said that " + response);
    }
}
