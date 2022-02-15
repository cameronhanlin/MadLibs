package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*
	Mad Libs
Create a new project named MadLibs
Create a new repo in Github named MadLibs
In InteliJ create a new project named MadLibs
In Terminal navigate to your MadLibs project location
In terminal, use git init
Copy the Github SSH key for your new Github repo
In Terminal Setup the git remote named origin by using the Github SSH key you copied earlier
Stage and commit the init changes to your local repo
Push changes to Github
Create 3 size 5 arrays
One array should have 5 single word strings, each of which is a noun.
One array should have 5 single word strings, each of which is an adjective.
One array should have 5 single word strings, each of which is a verb.
The Java Util class Random has a nextInt() method that can be used to get a random number from the range of zero to the
number passed in as a parameter.
Write a small story that randomly gets words from each array to fill in blank points in the story based on the word type.
Don’t forget to stage and commit changes in git as you go along
Bonus: Get the words to fill each array by asking the user to supply them.


	 */
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String[] noun = {"scale","throne","island","cactus","bucket"};
        String[] nouns = {"playgrounds","visitors","donkeys","feasts","cannons"}; // plural noun words
        String[] adjective = {"tasteless","purple","juicy","dusty","adorable"};
        String[] verb = {"knit","jump","kick","swim","visit"};
        String[] verbing = {"advising","choosing","excusing","losing","objecting"}; // verbs ending in -ing
        String[] verbPast = {"imagined","gathered","jumped","untied","yawned"}; // past tense of verbs
        String[] input = new String[5];
        int place = 0;



        System.out.print("Please enter a type of bird: "); //bird
        input[place] = scan.next();
        place++;
        System.out.print("Please enter a room of a house: "); //room in house
        input[place] = scan.next();
        place++;
        System.out.print("Please enter the name of a relative (one word): " ); // relative name
        input[place] = scan.next();
        place++;
        System.out.print("Please enter a liquid: "); // liquid
        input[place] = scan.next();
        place++;
        System.out.print("Please enter a part of the body (plural): "); //part of body
        input[place] = scan.next();
        System.out.println("\b");





        System.out.println("It was a "+adjective[rand.nextInt(5)]+", cold February day.");
        System.out.println("I woke up to the "+adjective[rand.nextInt(5)]+" smell of "+input[0]+" roasting in the "+input[1]+" downstairs.");
        System.out.println("I "+verbPast[rand.nextInt(5)]+" down the stairs to see if I could help "+verb[rand.nextInt(5)]+" the dinner.");
        System.out.println("My mom said,'See if "+input[2]+" needs a fresh "+noun[rand.nextInt(5)]+"'.");
        System.out.println("So I carried a tray of glasses full of "+input[3]+" into the room");
        System.out.println("When I got there, I couldn’t believe my "+input[4]+"!");
        System.out.println("There were "+nouns[rand.nextInt(5)]+" "+verbing[rand.nextInt(5)]+" on the "+noun[rand.nextInt(5)]+"!");





    }
}
