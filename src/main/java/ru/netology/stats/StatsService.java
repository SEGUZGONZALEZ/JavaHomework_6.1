package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int findAverageSum(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMaxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month = month + 1;
        }
        return maxSalesMonth + 1;
    }

    public int findMinSalesMonth(int[] sales) {
        int minSalesMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minSalesMonth]) {
                minSalesMonth = month;
            }
            month = month + 1;
        }
        return minSalesMonth + 1;
    }

    public int countMonthOfSalesUnderAverage(int[] sales) {
        int counter = 0;
        int averageSum = findAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int countMonthOfSalesUpperAverage(int[] sales) {
        int counter = 0;
        int averageSum = findAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}