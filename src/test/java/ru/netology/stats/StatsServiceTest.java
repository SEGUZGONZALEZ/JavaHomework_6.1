package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverageSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthOfSalesUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countMonthOfSalesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthOfSalesUpperAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countMonthOfSalesUpperAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}