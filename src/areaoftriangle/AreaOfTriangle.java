/*
 * Mouner Dabjan 
 * 20/02/2020
 * The purpose of this program is to calculate the area of a scalene triangle using either trigonometry or Heron's Formula
 */
package areaoftriangle;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // import the scanner
        Scanner input = new Scanner(System.in); 
        
        // variable for option
        int option;  
        
        // printing out the available options for the user
        System.out.println("Select between these two options"); 
        System.out.println("Option 1 : Trigonometry");
        System.out.println("Option 2 : Heron's Formula"); 
        
        // taking the user's input
        option= input.nextInt(); 
        
        // using if to decide which method the user wants to use
        if (option==1)
        {
             trigonometry(); // calls the trig method
        }
        
        else 
        {
            heronFormula();  // calls the heron formula method
        }
        
    }
    
    
    
    private static void trigonometry()
    {
        // variable needed 
        Scanner input = new Scanner(System.in); 
        double a;
        double b;
        double c; 
        double area; 
        
        
        // asking the user for the side and angle inputs
        System.out.println("Enter the first side of the triangle");
        
         a= input.nextDouble();
        
         System.out.println("Enter the second side of the tringle");
         
         b = input.nextDouble();
         
         System.out.println("Enter the value of the angle in the triangle");
         
         c = input.nextDouble(); 
         
         // calculating the area of the triangle
         area = (a+b+Math.sin(c))/2; 
         
         // printing the result to the screen
         System.out.println("The area of the triangle is " + area);
    }
    
    
    
    private static void heronFormula()
    {
        
        // variable needed
        Scanner input = new Scanner(System.in); 
        double semiPerimeter;
        double a;
        double b;
        double c;
        double area; 
        
        // asking the user for the side input
        System.out.println("Enter the first side of the triangle");
        
        a = input.nextDouble();
        
        System.out.println("Enter the second side of the triangle");
        
        b = input.nextDouble(); 
        
        System.out.println("Enter the third side of the triangle");
        
        c = input.nextDouble(); 
        
        // calculating the semi-perimeter 
        semiPerimeter = (a+b+c)/2;
        
        // using the semi-perimeter to calculate the area of the triangle 
        area = Math.sqrt((semiPerimeter)*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c)); 
        
        // printing the result to the screen 
        System.out.println("The area of the triangle is " + area);
        
        
    }
    
}
