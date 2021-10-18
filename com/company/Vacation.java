package com.company;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days=Integer.parseInt(scan.nextLine());
        String typeRoom=scan.nextLine();
        String grade=scan.nextLine();
        int nights=days-1;
        double price=0;

        if(typeRoom.equals("room for one person")){
            price=nights*18.00;
        } else if(typeRoom.equals("apartment")){
         if(nights<10){
            price=nights*25.00*0.70;
         }else if(nights>=10 && nights<=15){
            price=nights*25.00*0.65;
         }else if(nights>15){
            price=nights*25.00*0.50;
         }

        } else if(typeRoom.equals("president apartment")){
            if(nights<10){
                price=nights*35.00*0.90;
            }else if(nights>=10 && nights<=15){
                price=nights*35.00*0.85;
            }else if(nights>15){
                price=nights*35.00*0.80;
            }
        }
     if(grade.equals("positive")){
         price=price*1.25;
     }else if(grade.equals("negative")){
         price=price*0.9;
     }
        System.out.printf("%.2f",price);
    }
}
