package com.company;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowers=scan.nextLine();
        int numFlowers=Integer.parseInt(scan.nextLine());
        int budget=Integer.parseInt(scan.nextLine());
        double price=0.0;

        switch(flowers){
            case"Roses":
                price=numFlowers*5.00;
                if(numFlowers>80){
                    price=price*0.90;
                }

                break;
            case"Dahlias":
                price=numFlowers*3.80;
                if(numFlowers>90){
                    price=price*0.85;
                }
                break;
            case"Tulips":
                price=numFlowers*2.80;
                if(numFlowers>80){
                    price=price*0.85;
                }
                break;
            case"Narcissus":
                price=numFlowers*3.00;
                if(numFlowers<120){
                    price=price*1.15;
                }
                break;
            case"Gladiolus":
                price=numFlowers*2.50;
                if(numFlowers<80){
                    price=price*1.20;
                }
                break;
        }
if(budget >= price){
    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numFlowers,flowers,budget-price);
} else{
    System.out.printf("Not enough money, you need %.2f leva more.",price-budget);
}

    }
}
