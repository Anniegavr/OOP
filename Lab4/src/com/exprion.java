package com;
/* Program to check whether the expression is valid or not */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class exprion {
    public static void main(String[] args) throws FileNotFoundException {
        Stack<Character> stack = new Stack<Character>();
        File file =
                new File("N:\\MINE\\OOP\\Lab4\\three_expressions.txt");
        Scanner sc = new Scanner(file);
        String lion;
        Boolean wei;
        while (sc.hasNextLine()){
            lion = sc.nextLine();
            wei = true;
            for (int i = 0; i < lion.length(); i++) {
                if (lion.charAt(i) == '(') {
                    stack.push(lion.charAt(i));
                } else if (lion.charAt(i) == ')' && (!stack.isEmpty())) {
                    stack.pop();
                }
                else if (lion.charAt(i) == ')' && (stack.isEmpty())){
                    wei = false;
                    break;
                }
//                System.out.println(stack);
            }
        if (stack.isEmpty() && wei == true){
            System.out.println("The parentheses are alright!");
        }
        else {
            System.out.println("Noooo! God, please, no!");
        }
        }


//        System.out.println(stack);
    }
}
