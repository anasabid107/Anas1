/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author asada
 */
import java.util.Scanner;
public class ComputeAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1");
        int no1=input.nextInt();
        System.out.println("Enter number2");
        int no2=input.nextInt();
        System.out.println("Enter number 3");
        int no3=input.nextInt();
        double avg=(no1+no2+no3)/3;
        System.out.println("Average of three num is="+avg);
                
        // TODO code application logic here
    }
    
}
