package com.company;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam=Integer.parseInt(scan.nextLine());
        int minExam=Integer.parseInt(scan.nextLine());
        int hourArrival=Integer.parseInt(scan.nextLine());
        int minArrival=Integer.parseInt(scan.nextLine());

        int sumMinExam=hourExam*60+minExam;
        int sumMinArrival=hourArrival*60+minArrival;

        int diff=sumMinExam-sumMinArrival;

       if (diff==0) {
           System.out.println("On time");
       }
       else if (diff>0 && diff<=30)
        {
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
        }else if (diff>30){
            System.out.println("Early");
            if (diff<60 ) {
                System.out.printf("%d minutes before the start", diff);
            } else{
                int hours=diff/60;
                int minutes=diff%60;
                System.out.printf("%d:%02d hours before the start",hours,minutes);
            }
        }else if(diff<0){
            System.out.println("Late");
           if (diff>-60) {
               System.out.printf("%d minutes after the start",Math.abs(diff));
           } else{
               int hours=diff/60;
               int minutes=diff%60;
               System.out.printf("%d:%02d hours after the start",Math.abs(hours),Math.abs(minutes));
           }
        }


    }
}
