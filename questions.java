/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 * Hendrik Wilfing
 * 4/15/26
 * Contains the quiz itself and influences the arrays through the questions
 * @author hendr
 */

import java.util.Scanner;

public class questions {
    static int[] Classes = new int[12];
    static int[] Species = new int[9];
    static Scanner scan = new Scanner(System.in);  
    //Will contain the questions and retreive answers from the user currently just a test
    public static void Runner() {
        //this is just a test
        Classes[0] = 1;
        Species[1] = 1;
    }
    //looks at classes array determines which int is biggest then gives answer
    public static int Ccal() {
        int greatest = 0, greatLC = -1;
        for (int i = 0; i < Classes.length; i++) {
            if (greatest <= Classes[i]) {    
                greatest = Classes[i];
                greatLC = i;
            }
        }
        return greatLC;
    }
    //looks at species array determines which int is biggest then gives answer
    public static int Scal() {
        int greatest = 0, greatLS = -1;
        for (int i = 0; i < Species.length; i++) {
            if (greatest <= Species[i]) {
                greatest = Species[i];
                greatLS = i;
            }
        }
        return greatLS;
    }
}
