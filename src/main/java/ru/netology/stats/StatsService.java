package ru.netology.stats;

public class StatsService {
    public long statSaleSum(int[] sale) {
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public double statSaleAvgMonth(int[] sale) {
        int numberSale = sale.length;
        double sum = statSaleSum (sale);
        double avgMonth = sum / numberSale;
        return avgMonth;
    }

    public long statSaleMax(int[] sale) {
        int saleMax = sale[0];

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;
    }

    public long statSaleMin(int[] sale) {
        int saleMin = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public int statMonthUnderAvg(int[] sale) {
        long avgSum = (long) statSaleAvgMonth(sale);
        int numberUnderAvg = 0;

        // Запускаем цикл от 0 до длины массива sale
        for (int i = 0; i < sale.length; i++) {
            // если значение из массива меньше среднего, то увеличиваем счётчик numberUnderAverage на 1
            if (sale[i] < avgSum) {
                numberUnderAvg = numberUnderAvg + 1;
            }
        }
        return numberUnderAvg;
    }

    public int statMonthOverAvg(int[] sale) {
        int averageSum = (int) statSaleAvgMonth(sale);
        int numberOverAverage = 0;

        // Запускаем цикл от 0 до длины массива sale
        for (int i = 0; i < sale.length; i++) {
            // если значение из массива больше среднего, то увеличиваем счётчик numberUnderAverage на 1
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }

}