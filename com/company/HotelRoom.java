package com.company;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month= scan.nextLine();
        int numOfNights=Integer.parseInt(scan.nextLine());
        double priceStudio=0.0;
        double priceApartment=0.0;


        switch (month) {
            case "May":
            case "October":
                priceStudio=50.00;
                priceApartment=65.00;
            if(numOfNights>7 && numOfNights<=14){
                priceStudio=priceStudio*0.95;
            }else if(numOfNights>14){
                priceStudio=priceStudio*0.70;
                priceApartment=priceApartment*0.90;
            }

                break;
            case "June":
            case "September":
                priceStudio=75.20;
                priceApartment=68.70;
                if(numOfNights>14){
                    priceStudio=priceStudio*0.80;
                    priceApartment=priceApartment*0.90;
                }
                break;

            case "July":
            case "August":
                priceStudio=76.00;
                priceApartment=77.00;
                if(numOfNights>14){
                    priceApartment=priceApartment*0.90;
                }
                break;

        }

        double fullPriceApartment=priceApartment*numOfNights;
        double fullPriceStudio=priceStudio*numOfNights;

        System.out.printf("Apartment: %.2f lv.%n",fullPriceApartment);
        System.out.printf("Studio: %.2f lv.",fullPriceStudio);
    }
}
