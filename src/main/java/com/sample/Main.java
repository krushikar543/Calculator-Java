package com.sample;
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Main {
    // private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // System.out.println("My first Java based Calculator");
        // logger.info("Start of Execution");
        int opt = 0;
        while(1 != 0){
            System.out.println("-------The--Calculator---------\n" + "Choose Your Option\n" + "1.Addition\n" + "2.Substraction\n" + "3.Multiplication\n" + "4.Division\n" + "5.Exit\n");
            Scanner input = new Scanner(System.in);
            opt = input.nextInt();
            if(opt == 5){
                // logger.info("End of Execution");
                System.exit(0);
            }
            System.out.println("Enter operand 1: ");
            int opt1 = input.nextInt();
            System.out.println("Enter Operand 2: ");
            int opt2 = input.nextInt();  

            switch(opt){
                case 1:
                    // logger.info("Inside ADDITION operation\n");
                    System.out.println(add(opt1, opt2));
                    // logger.info("Addition operation finished");
                    break;
                case 2:
                    // logger.info("Inside SUBSTRACTION operation\n");
                    System.out.println(sub(opt1, opt2));
                    // logger.info("substraction operation finished");
                    break;
                case 3:
                    // logger.info("Inside MULTIPLICATION operation\n");
                    System.out.println(mul(opt1, opt2));
                    // logger.info("multiplication operation finished");
                    break;
                case 4:     
                    // logger.info("Inside DIVISION operation\n");
                    System.out.println(div(opt1, opt2));
                    // logger.info("Add operation finished");
                    break;
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