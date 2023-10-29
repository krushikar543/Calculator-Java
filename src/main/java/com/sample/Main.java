package com.sample;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opt = 0;
        System.out.println("-------The-Calculator---------\n");
        while(1 != 0){
            System.out.println( "Choose Your Option\n" + "1.Addition\n" + "2.Substraction\n" + "3.Multiplication\n" + "4.Division\n" + "5.Exit\n");
            Scanner input = new Scanner(System.in);
            opt = input.nextInt();
            if(opt == 5){
                System.exit(0);
            }
            System.out.println("Enter operand 1: ");
            int opt1 = input.nextInt();
            System.out.println("Enter Operand 2: ");
            int opt2 = input.nextInt();  
            System.out.println("Output : ");
            switch(opt){
                case 1:
                    System.out.println(add(opt1, opt2));
                    break;
                case 2:
                    System.out.println(sub(opt1, opt2));
                    break;
                case 3:
                    System.out.println(mul(opt1, opt2));
                    break;
                case 4:     
                    if(opt2 == 0){
                        System.out.println("Invalid Input : Divisor cannot be Zero");
                    }
                    else{
                        System.out.println(div(opt1, opt2));
                    }
                    break;
                default:
                    System.out.println("Enter an valid option");
            }
        }
    }
    public static int add(int a, int b){
        return a+b;
    }   
    public static int sub(int a, int b){
        return a-b;
    }   
    public static int mul(int a, int b){
        return a*b;
    }   
    public static int div(int a, int b){
        return a/b;
    } 
}