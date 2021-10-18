package com.company;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1=Integer.parseInt(scan.nextLine());
        int n2=Integer.parseInt(scan.nextLine());
        String operator=scan.nextLine();
        double sum=0;
        String evenOrOdd="";

        switch (operator){
            case "+":
                sum=n1+n2;
                if (sum%2==0){
                    evenOrOdd="even";
                }else {
                    evenOrOdd="odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,sum,evenOrOdd);
                break;
            case "-":
                sum=n1-n2;
                if (sum%2==0){
                    evenOrOdd="even";
                }else {
                    evenOrOdd="odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,sum,evenOrOdd);
                break;
            case "*":
                sum=n1*n2*1.0;
                if (sum%2==0){
                    evenOrOdd="even";
                }else {
                    evenOrOdd="odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,sum,evenOrOdd);
                break;
            case "/":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }else{
                    sum=n1*1.0/n2;

                System.out.printf("%d %s %d = %.2f ",n1,operator,n2,sum);}
                break;
            case "%":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }else{
                    sum=n1*1.0%n2;

                System.out.printf("%d %s %d = %.0f ",n1,operator,n2,sum);}
                break;
        }

    }
}
