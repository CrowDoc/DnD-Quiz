/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 * Hendrik Wilfing
 * 4/15/26
 * gives results through switch case statement based on results
 *
 * @author hendr
 */

        
public class quiz{
    //determines final answer for classes based on quiz results
    public static void classResult() {
        int pointC = questions.Ccal();
        switch (pointC) {
            case 0:
                System.out.println("Barbarian");
                break;
            case 1:
                System.out.println("Bard");
                break;
            default: 
                System.out.println("Nothing");
                break;
        }
    }
    //doess the same think as classResult but for species
    public static void speciesResult() {
        int pointS = questions.Scal();
        switch (pointS) {
            case 0:
                System.out.println("Dwarf");
                break;
            case 1:
                System.out.println("Elf");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }

}
