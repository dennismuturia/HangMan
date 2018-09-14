package com.company;

import java.util.Scanner;

public class HangMan {
    public static void hangMan(String n){
        //Create an Array of the person to draw
        String[] person = {"|","|", "0", "/", "|", "/", "\\", "|", "/", "\\"};
        int correctCount = 0;
        String[] newN = n.split("");
        for (int j = 0; j < newN.length; j++) {
            //Fill in with Dashes
            System.out.print("-");
        }

        int errorCount = 0;//Check the number of entries entered
        Scanner sc = new Scanner(System.in);//Allows users to enter stuff
        while (true){

            char inputtedChar = sc.next().charAt(0);
            //Checking out the index

            int theIndex = n.indexOf(inputtedChar);
            try {
                if (theIndex <= n.length()){
                    if (n.charAt(theIndex) == inputtedChar){
                        correctCount+=1;
                        System.out.println("Good continue");
                        if(correctCount == n.length()){
                            System.out.println("Congratulations. You did it");
                            break;
                        }
                    }else {
                        System.out.println("hello");
                    }
                }
            }catch (Exception e){
                try {
                    for (int i = 0; i < person.length; i++){
                        errorCount+=1;
                        System.out.println(person[i + errorCount]);
                        break;
                    }
                }catch (Exception m){
                    System.out.println("Game Over");
                    break;
                }

            }


        }
    }
}