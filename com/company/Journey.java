package com.company;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget=Double.parseDouble(scan.nextLine());
        String season=scan.nextLine();
        String destination="";
        String type="";

        if(budget<=100){
            destination="Bulgaria";
            switch (season) {
                case  "summer":
                    type="Camp";
                    budget=budget*0.3;
                    break;
                case "winter":
                    type="Hotel";
                    budget=budget*0.7;
                    break;
            }
        }else if(budget<=1000){
            destination="Balkans";
            switch (season) {
                case  "summer":
                    type="Camp";
                    budget=budget*0.4;
                    break;
                case "winter":
                    type="Hotel";
                    budget=budget*0.8;
                    break;
            }

        }else if(budget>1000){
          destination="Europe";
             type="Hotel";
            budget=budget*0.9;
        }

        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",type,budget);

    }
}
