package ru.netology.stats.StatsProgram.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void findSumSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 180;
        int actual = count.sumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 15;
        int actual = count.averageSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 8;
        int actual = count.maxSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 9;
        int actual = count.minSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findBelowAverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 5;
        int actual = count.belowAverageSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAboveAverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService count = new StatsService();

        int expected = 5;
        int actual = count.aboveAverageSales(arr);

        Assertions.assertEquals(expected, actual);
    }

}
