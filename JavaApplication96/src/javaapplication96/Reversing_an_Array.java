/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication96;

/**
 *
 * @author kentr
 */

public class Reversing_an_Array {

    
    public static void main(String[] args) {


        int ages [] = {20,21,21,33,43};
        
        System.out.println("Orig");
        
        for(int i : ages){
            System.out.println(i+"");
        }
        
        System.out.println("Reversed");
        
        for (int i = ages.length - 1; i >= 0; i--) {
            
            System.out.println(ages[i] + " ");
        }



    }





    }
    

