package ru.netology.staaa;

public class StatsService {
    public int Sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {

        return Sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

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

    public int salessAverage(int[] sales) {
        int averageAmount = 15;
        int month = 0;
        int count = 0;
        for (int sale : sales) {

            if (sale < averageAmount) {
                count++;
            }
            month = month + 1;
        }
        return count;
    }

    public int salesAverage(int[] sales) {
        int averageAmount = 15;
        int month = 0;
        int count = 0;
        for (int sale : sales) {

            if (sale > averageAmount) {
                count++;
            }
            month = month + 1;
        }
        return count;
    }
}

