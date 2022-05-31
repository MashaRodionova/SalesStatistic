package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatServiceTest {
    @Test
    public void shouldFindMinSale() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 7, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(statistic);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSale() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 15, 17, 20, 20, 20, 7, 14, 14, 18};
        int actual = service.maxSales(statistic);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumSale() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(statistic);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMidSumSaleInMonth() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.midSumInMonth(statistic);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18)/12;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfMonthIsLessMidSumSale() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberOfMonthIsLessMidSumSale(statistic);
        long expected = 5;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldNumberOfMonthMoreMidSumSale() {
        StatsService service = new StatsService();
        long [] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberOfMonthIsLessMidSumSale(statistic);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
