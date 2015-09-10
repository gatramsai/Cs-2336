package com.company;
import java.util.Scanner;
public class HW02_P1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int input = scan.nextInt();
        while(true)//always true to make sure it always checks
        {
            if (input<100 || input >=1000)//improper input
            {
                System.out.println("Invalid.");
                System.out.println("Enter another 3 digit number: ");
                input = scan.nextInt();
            }
            if (input>=100 && input <1000)//proper input
            {
                if(input / 100 == input % 10)
                    System.out.println(input + " is a palindrome.");
                else
                    System.out.println(input + " is not a palindrome.");
                System.out.println("Enter another 3 digit number: ");
                input = scan.nextInt();
            }
        }
    }
}

/*
Analysis: The input for this program is basically what the user enters fro their 3 digit number. The output is whether the number
    is a palindrome.
Design: The Scanner is initialized and used to take input. Then the input is checked whether to see if its 3 digits.
    Then the input is entered into the input / 100 == input % 10 formula to see if its a palindrome.
Testing: Test the program assuming the user will not enter symbols or alphabets. In addition, enter some palindromes to see if
    the response is valid. In addition to this, add some 4 digit and 2 digit numbers to check the robustability of the program.

 */