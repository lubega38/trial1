/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.input;
import java.util.Scanner;

/**
 *
 * @author ST.EDWARDS
 */
public class Input {

    public static void main(String[] args) {
        String name = "";
        int age = 0;
    public void get_details(){
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String my_name = name.nextLine();
        System.out.println("My name is " + my_name);

        Scanner age = new Scanner(System.in);
        System.out.println("How old are you? ");
        int my_age = age.nextInt();
        System.out.println("Iam " + my_age + "old");
        }
    
        
        
        
    }
}
