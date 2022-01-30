package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public int calculateAvg(int[] sales) {

        return calculateSum(sales) / sales.length;


    }

    // 3. Месяц с максимумом продаж
    public int calculateMaxSales(int[] sales) {

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

    // 4. Месяц с минимумом продаж
    public int calculateMinSales(int[] sales) {

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

    // 5. Количество месяцев с продажами ниже среднего
    public int calculateUnderAvg(int[] sales) {


        int month = 0;

        for (int sale : sales) {
            if (sale < calculateAvg(sales)) {

                month = month + 1;
            }

        }
        return month;

    }

    // . Количество месяцев с продажами выше среднего
    public int calculateOverAvg(int[] sales) {

        int month = 0;

        for (int sale : sales) {
            if (sale > calculateAvg(sales)) {

                month = month + 1;
            }

        }
        return month;
    }
}

