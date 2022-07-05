package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    double[] sales = {
            12, 13, 10, 14.3, 17, 20, 19, 20.7, 8, 14, 14, 18
    };

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        System.out.println(service.calcSum(sales));
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        System.out.println(service.calcAverage(sales));
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        System.out.println(service.minSales(sales));
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();
        System.out.println(service.maxSales(sales));
    }

    @Test
    public void shouldFindLessThanAverageSales() {
        StatsService service = new StatsService();
        System.out.println(service.lessThanAverage(sales));
    }

    @Test
    public void shouldFindMoreThanAverageSales() {
        StatsService service = new StatsService();
        System.out.println(service.moreThanAverage(sales));
    }
}