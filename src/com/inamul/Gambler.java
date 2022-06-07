package com.inamul;

public class Gambler {
    static int dailyStake = 100;
    static int perBet = 1;

    public static void DailyGamble(){
        int initialBet = 1;
        int check = (int) (Math.floor(Math.random()*10)%2+1);
        if (check == 1) {
            initialBet += 1;
            System.out.println("Win");
            System.out.println("Amount: " + initialBet);
        } else {
                initialBet-=1;
                if (initialBet == 0){
                    System.out.println("No money to play.");
                } else {
                    System.out.println("Amount: "+initialBet);
                }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambler's club.");
        DailyGamble();
    }
}
