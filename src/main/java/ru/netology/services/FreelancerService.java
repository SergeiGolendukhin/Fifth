package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {

                money = money - expenses;
                count++;
                money /= 3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
