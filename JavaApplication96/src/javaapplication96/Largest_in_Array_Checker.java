/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication96;




public class Largest_in_Array_Checker {

    public static void main(String[] args) {



        int numbers[] = { 12 , 22 , 32 ,39 , 2};
        
        int largest = numbers[0];
        
        
        
        
        for (int i = 0; i < numbers.length; i++){
            
            if ( numbers[i] > largest){
                
                largest = numbers[i];
            }
             
        }
       System.out.println( largest);
    }
}