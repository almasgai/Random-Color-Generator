package com.company;

import java.util.Random;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
	// write your code here
        Random randGen = new Random();
        
        int limit = 1000;

        for(int i = 0; i < limit; i++){
            System.out.println();
            for(int j = 0; j < limit; j++){
                int colorNum = randGen.nextInt(8) + 1;
                switch (colorNum){
                    case 1:
                        System.out.print("■" + ANSI_BLACK);
                        break;

                    case 2:
                        System.out.print("■" + ANSI_RED);
                        break;

                    case 3:
                        System.out.print("■" + ANSI_GREEN);
                        break;

                    case 4:
                        System.out.print("■" + ANSI_YELLOW);
                        break;

                    case 5:
                        System.out.print("■" + ANSI_BLUE);
                        break;

                    case 6:
                        System.out.print("■" + ANSI_PURPLE);
                        break;

                    case 7:
                        System.out.print("■" + ANSI_CYAN );
                        break;

                    case 8:
                        System.out.print("■" + ANSI_WHITE);
                        break;

                    default:
                        System.out.println("An error has occurred");
                        break;
                }
            }
        }
    }
}
