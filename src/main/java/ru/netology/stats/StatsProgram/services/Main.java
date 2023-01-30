package ru.netology.stats.StatsProgram.services;


public class Main {
    public static void main(String[] args) {

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println("Общая сумма продаж в год: " + service.sumSales(arr)); //1 метод
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSales(arr)); // 2 метод
        System.out.println("Месяц максимальных продаж: " + service.maxSales(arr)); // 3 метод
        System.out.println("Месяц минимальных продаж: " + service.minSales(arr)); // 4 метод
        System.out.println("Месяцы продаж ниже среднего: " + service.belowAverageSales(arr)); //5 метод
        System.out.println("Месяцы продаж выше среднего: " + service.aboveAverageSales(arr)); //6 метод
    }
}