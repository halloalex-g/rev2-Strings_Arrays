package ru.netology.stats;

public class StatsService {

    public int yearlySales(long[] sales) { //Сумма всех продаж
        int salesSumm = 0;
        for (long mnthlSale : sales) {
            salesSumm += mnthlSale;
        }
        return salesSumm;
    }

    public int averageSumm(long[] sales) { //Средняя сумма продаж в месяц
        int averageS = yearlySales(sales) / 12;
        return averageS;
    }


    public int maxSales(long[] sales) { //Номер месяца, в котором был пик продаж
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

    public int minSales(long[] sales) { //Номер месяца, в котором был минимум продаж
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

    public int monthesBelowAverage(long[] sales) { //Количество месяцев, в которых продажи были ниже среднего
        int monthesBeAvrg = 0;
        int averageS = averageSumm(sales);
        for (long sale : sales) {
            if (sale < averageS) {
                monthesBeAvrg += 1;
            }
        }
        return monthesBeAvrg;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int monthesAboveAverage(long[] sales) {
        int monthesAbAvrg = 0;
        int averageS = averageSumm(sales);
        for (long sale : sales) {
            if (sale > averageS) {
                monthesAbAvrg += 1;
            }
        }
        return monthesAbAvrg;
    }


}
