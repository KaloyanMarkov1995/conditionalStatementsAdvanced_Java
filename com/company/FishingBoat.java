package com.company;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget=Integer.parseInt(scan.nextLine());
        String season=scan.nextLine();
        int numFishermen=Integer.parseInt(scan.nextLine());
        double price=0.0;

        switch (season){
            case"Spring":
                price=3000;
                break;
            case"Summer":
            case"Autumn":
                price=4200;
                break;
            case"Winter":
                price=2600;
                break;
        }

        if(numFishermen<=6){
          price=price*0.9;
        }else if(numFishermen>6 && numFishermen<=11){
            price=price*0.85;
        }else if(numFishermen>11){
            price=price*0.75;
        }

       if(numFishermen%2==0 && (season.equals("Spring")||season.equals("Summer")||season.equals("Winter")))
        {
            price=price*0.95;
        }

        if(budget >= price){
            System.out.printf("Yes! You have %.2f leva left.",budget-price);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",price-budget);
        }

    }
}
