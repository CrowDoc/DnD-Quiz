/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;
/**
 * Hendrik Wilfing
 * 4/15/26
 * Main interface and home of the Main Method for users to interact with
 * @author hendr
 */
import java.util.Scanner;

public class center {
    static Scanner scan = new Scanner(System.in);
    //the main UI and runner of the quiz
    public static void main(String[] args) {
        boolean quit = false;
        int input; 
        System.out.println("Welcome to the DND personality quiz! Please select an option below");
        while(!quit) {
            System.out.println("[0] Quit [1] Run [2] Print Results");
            input = scan.nextInt();
            switch(input) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    questions.Runner();
                    break;
                case 2: 
                    System.out.println("Your class is: ");
                    quiz.classResult();
                    System.out.println("Your species is: ");
                    quiz.speciesResult();
                    break;
                default:
                    System.out.println("Err: not an option");
                    break;
            }
        }
    }
}
