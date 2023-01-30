package ru.netology.stats.StatsProgram.services;

public class StatsService {
    //1 метод сумма продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // 2 средние продажи в месяц
    public int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / 12;
    }

    // 3 метод максимальные продажи
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4 метод минимальные продажи
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // 5 метод количество месяцев продаж ниже среднего

    public int belowAverageSales(int[] sales) {
        int sum = 0;
        int n = 0;
        for (int sale : sales) sum = sum + sale;
        for (int belowAverage : sales) {
            if (belowAverage < (sum / 12)) {
                n = n + 1;
            }

        }
        return n;
    }

    // 6 метод количество месяцев продаж выше среднего
    public int aboveAverageSales(int[] sales) {
        int sum = 0;
        int n = 0;
        for (int sale : sales) sum = sum + sale;
        for (int aboveAverage : sales) {
            if (aboveAverage > (sum / 12)) {
                n = n + 1;
            }
        }
        return n;
    }
}
