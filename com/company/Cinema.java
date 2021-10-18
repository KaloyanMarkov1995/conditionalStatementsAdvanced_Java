package com.company;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection=scan.nextLine();
        int rolls =Integer.parseInt(scan.nextLine());
        int collumns =Integer.parseInt(scan.nextLine());
        double income=0.0;

        switch (projection){
            case "Premiere":
                income=rolls*collumns*12.00;
                break;
            case "Normal":
                income=rolls*collumns*7.50;
                break;
            case "Discount":
                income=rolls*collumns*5.00;
                break;
        }

        System.out.printf("%.2f",income);
    }

}
