package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        List<String> nounNew = new ArrayList<>();
        List<String> nounsNew = new ArrayList<>();
        List<String> adjectiveNew = new ArrayList<>();
        List<String> verbNew = new ArrayList<>();
        List<String> verbingNew = new ArrayList<>();
        List<String> verbPastNew = new ArrayList<>();
        List<String> input = new ArrayList<>();

        String[] noun = {"scale","throne","island","cactus","bucket"};
        String[] nouns = {"playgrounds","visitors","donkeys","feasts","cannons"}; // plural noun words
        String[] adjective = {"tasteless","purple","juicy","dusty","adorable"};
        String[] verb = {"knit","jump","kick","swim","visit"};
        String[] verbing = {"advising","choosing","excusing","losing","objecting"}; // verbs ending in -ing
        String[] verbPast = {"imagined","gathered","jumped","untied","yawned"}; // past tense of verbs
        int place = 0;

        //here I didnt want to remake my Arrays, so I just converted them to ListArrays
        for(int i=0; i < noun.length; i++) // noun
            nounNew.add(noun[1]);
        for(int i=0; i < nouns.length; i++) // nouns
            nounsNew.add(nouns[1]);
        for(int i=0; i < adjective.length; i++) //adjective
            adjectiveNew.add(adjective[1]);
        for(int i=0; i < verb.length; i++) // verb
            verbNew.add(verb[1]);
        for(int i=0; i < verbing.length; i++) //verbing
            verbingNew.add(verbing[1]);
        for(int i=0; i < verbPast.length; i++) // verbPast
            verbPastNew.add(verbPast[1]);

        System.out.print("Please enter a type of bird: "); //bird
        input.add(scan.nextLine().toLowerCase());
        System.out.print("Please enter a room of a house: "); //room in house
        input.add(scan.nextLine().toLowerCase());
        System.out.print("Please enter the name of a relative: "); // relative name
        input.add(scan.nextLine());
        System.out.print("Please enter a liquid: "); // liquid
        input.add(scan.nextLine().toLowerCase());
        System.out.print("Please enter a part of the body (plural): "); //part of body
        input.add(scan.nextLine().toLowerCase());
        System.out.println("\b");


        //main output
        System.out.println("It was a "+adjectiveNew.get(rand.nextInt(5))+", cold February day.");
        System.out.println("I woke up to the "+adjectiveNew.get(rand.nextInt(5))+" smell of "+input.get(0)+" roasting in the "+input.get(1)+" downstairs.");
        System.out.println("I "+verbPastNew.get(rand.nextInt(5))+" down the stairs to see if I could help "+verbNew.get(rand.nextInt(5))+" the dinner.");
        System.out.println("My mom said,'See if "+input.get(2)+" needs a fresh "+nounNew.get(rand.nextInt(5))+"'.");
        System.out.println("So I carried a tray of glasses full of "+input.get(3)+" into the room");
        System.out.println("When I got there, I couldn’t believe my "+input.get(4)+"!");
        System.out.println("There were "+nounsNew.get(rand.nextInt(5))+" "+verbingNew.get(rand.nextInt(5))+" on the "+nounNew.get(rand.nextInt(5))+"!");



    }

}


