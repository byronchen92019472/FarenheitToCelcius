/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.*;

/**
 *
 * @author 92019472
 */
public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit");
        
        float number = scanner.nextFloat();
        
        System.out.println((number - 32) * 5/9);
                
    }
    
}
