package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long sum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long midSumInMonth(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long midSumInMon = sum / sales.length;
        return midSumInMon;
    }

    public long numberOfMonthIsLessMidSumSale(long[] sales) {

        long mid = midSumInMonth(sales); //используем предыдущий метод для подсчета среднемесячной суммы продаж
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mid) {
                count = count + 1;
            }
        }
        return count;
    }

    public long numberOfMonthMoreMidSumSale(long[] sales) {

        long mid = midSumInMonth(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mid) {
                count = count + 1;
            }
        }
        return count;
    }


}
