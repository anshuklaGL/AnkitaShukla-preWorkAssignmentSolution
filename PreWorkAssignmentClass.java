package GreatLearning;

import java.util.Scanner;

public class PreWorkAssignmentClass {


    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome

    public void checkPalindrome()  {
        System.out.println("Enter Number for Palindrome Check");
        int n= sc.nextInt();
        int n1=n;
        int a=0, rev=0;

        while(n>0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }

        if (n1==rev){
            System.out.println(n+ " is Palindrome");
        }
        else{
            System.out.println(n+ " is not Palindrome");
        }
    }

    //function to printPattern

    public void printPattern() {

        System.out.println("Enter Number of rows for printing pattern");

        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    //function to check no is prime or not

    public void checkPrimeNumber() {

        System.out.println("Enter number to check Prime Number");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1, c=0;
        System.out.println("Enter range for Fibonacci");
        int n=sc.nextInt();
        System.out.print(first + " " + second);

        for(int i=2;i<=n;i++){
            c=first+second;
            first=second;
            second=c;
            System.out.print(" "+ c);
        }
    }

//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();

            choice = sc.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;
                    break;



                case 1: {

                    obj.checkPalindrome();

                }
                break;



                case 2: {

                    obj.printPattern();

                }
                break;



                case 3: {

                    obj.checkPrimeNumber();
                }
                break;



                case 4: {

                    obj.printFibonacciSeries();
                }
                break;



                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }



        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }
}
