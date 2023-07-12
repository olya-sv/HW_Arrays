package ru.netology.stats;

public class StatsService {
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;

    }
    public int averageArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum/arr.length;

    }
    public int maxArray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr [i] >= arr[res]) {
                res=i;
            }
        }
        return res+1;

    }
    public int minArray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr [i] <= arr[res]) {
                res=i;
            }
        }
        return res+1;

    }
    public int amountBelowAverageArray(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageArray(arr)){
                amount++;
            }
        }
        return amount;

    }
    public int amountAboveAverageArray(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageArray(arr)){
                amount++;
            }
        }
        return amount;

    }
}
