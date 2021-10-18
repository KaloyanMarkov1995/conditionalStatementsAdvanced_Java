package com.company;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x =Double.parseDouble(scan.nextLine());

        if(x>=-100 && x<=100 && x!=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
