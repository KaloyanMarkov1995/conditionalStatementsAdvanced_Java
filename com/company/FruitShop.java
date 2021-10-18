package com.company;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit=scan.nextLine();
        String day=scan.nextLine();
        double amount=Double.parseDouble(scan.nextLine());
        double price;

        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday"))
        {
            if(fruit.equals("banana")){
                price=amount*2.50;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("apple")){
                price=amount*1.20;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("orange")){
                price=amount*0.85;
                System.out.printf("%.2f",price);
            }else if(fruit.equals("grapefruit")){
                price=amount*1.45;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("kiwi")){
                price=amount*2.70;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("pineapple")){
                price=amount*5.50;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapes")){
                price=amount*3.85;
                System.out.printf("%.2f",price);
            } else {
                System.out.println("error");
            }
        } else if(day.equals("Saturday")||day.equals("Sunday"))
        {
            if(fruit.equals("banana")){
                price=amount*2.70;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("apple")){
                price=amount*1.25;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("orange")){
                price=amount*0.90;
                System.out.printf("%.2f",price);
            }else if(fruit.equals("grapefruit")){
                price=amount*1.60;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("kiwi")){
                price=amount*3.0;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("pineapple")){
                price=amount*5.60;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapes")){
                price=amount*4.20;
                System.out.printf("%.2f",price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
