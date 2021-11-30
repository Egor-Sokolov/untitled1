package com.company;

public class Main {

    public static void main(String[] args) {
	int streak = 4;
    int minStreak = 3;
    int addMMRStreak = 10;
    int ApMMRWithStreak = 30;
    int ApMMPWithoutStreak =30;
    int totalWithStreakMMR = 0;
    int    totalWithoutStreakMMR =0;
    for(int game = 1; game <= streak; game++){
        totalWithoutStreakMMR +=ApMMPWithoutStreak;
        if(game <= minStreak){
            totalWithStreakMMR+= ApMMRWithStreak;
        } else
            totalWithStreakMMR+= ApMMRWithStreak +addMMRStreak*(game-minStreak);
    }
        System.out.println(totalWithStreakMMR + " - ММР с действием стрика ");

        System.out.println(totalWithoutStreakMMR + " - ММР без действия стрика");
    }
}
