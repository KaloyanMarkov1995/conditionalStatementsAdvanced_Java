package com.company;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String leapOrNormal=scan.nextLine();
        int numCelebration=Integer.parseInt(scan.nextLine());
        int weekendsInHometown=Integer.parseInt(scan.nextLine());

        int weekendsInSofia=48-weekendsInHometown;
        double saturdayGamesInSofia=weekendsInSofia*3.0/4;
        double celebrationGamesInSofia=numCelebration*2.0/3;
        double totalGames=weekendsInHometown+saturdayGamesInSofia+celebrationGamesInSofia;

        if(leapOrNormal.equals("leap")){
            totalGames=totalGames*1.15;
        }

        System.out.printf("%.0f",Math.floor(totalGames));
    }
}
