package ru.netology.javaqa;


import ru.netology.stats.StatsService;

public class Main {
    static StatsService statsService = new StatsService();

    public static void main(String[] args) {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        statsService.sumArray(arr);

        System.out.println(statsService.sumArray(arr));

        System.out.println(statsService.averageArray(arr));

        System.out.println(statsService.maxArray(arr));

        System.out.println(statsService.minArray(arr));

        System.out.println(statsService.amountBelowAverageArray(arr));

        System.out.println(statsService.amountAboveAverageArray(arr));

    }
}