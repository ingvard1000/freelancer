package ru.netology.services;


public class VacationService {
    public int calc(int income, int expenses, int threshold, int amount) {
        int cost = 0;
        int month = 1;
        for (month = 1; month <= 12; month++){
            if (amount >= threshold) {
                cost++;
                amount = (amount - expenses) / 3;
            } else {
                amount = amount + income - expenses;
            }

        }
        return cost;
    }

}
