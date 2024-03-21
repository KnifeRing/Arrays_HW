package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void statSaleSum() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statSaleSum(sale);

        // Задаём контрольное значение
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void statSaleAvgMonth(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        double actual = (double) service.statSaleAvgMonth(sale);

        // Задаём контрольное значение
        double expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void statSaleMax(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statSaleMax(sale);

        // Задаём контрольное значение
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void statSaleMin(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statSaleMin(sale);

        // Задаём контрольное значение
        long expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statMonthUnderAvg(sale);

        // Задаём контрольное значение
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statMonthOverAvg(sale);

        // Задаём контрольное значение
        long expected = 5;
        assertEquals(expected, actual);
    }
}