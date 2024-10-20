/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication96;

/**
 *
 * @author kentr
 */
import java.util.Scanner;
public class Palindrome_Checker {
    
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Type the word you want  to check ");
        String word = scan.nextLine();
        
        String rev = new StringBuilder(word).reverse().toString();
        
        if (word.contentEquals(rev)){
            
            System.out.println("The word " + word + " is a palindrome");
        }else{
              System.out.println("The word " + word + " is not a palindrome");
        }
        
    }
    
}
