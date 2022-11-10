package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

import java.rmi.UnexpectedException;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void findYearlySales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.yearlySales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSumm() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSumm(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinSales() {
        StatsService service = new StatsService();
        int expectedMnth = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expectedMnth, actual);
    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthesBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
