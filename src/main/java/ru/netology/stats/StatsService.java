package ru.netology.stats;

public class StatsService {
    double sum = 0;
    double average = 0;

    // Сумма всех продаж за 12 месяцев
    public double calcSum(double[] sales) {
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public double calcAverage(double[] sales) {
        sum = calcSum(sales);
        average = sum / sales.length;
        return average;
    }

    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(double[] sales) {
        int minMonth = 0; // ячейка номера месяца с мин. прибылью
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (double sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSales(double[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (double sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего
    public int lessThanAverage(double[] sales) {
        average = calcAverage(sales);
        int sumMonths = 0;

        for (double sale : sales) {
            if (sale < average) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public int moreThanAverage(double[] sales) {
        average = calcAverage(sales);
        int sumMonths = 0;

        for (double sale : sales) {
            if (sale > average) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }
}