package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
   @CsvFileSource(files = "src/test/resources/vacation.csv")

    public void calcVacationincome(int income, int expenses, int threshold, int amount) {
        VacationService service = new VacationService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int amount = 0;
        int boss = service.calc(income, expenses, threshold, amount);
        System.out.println(boss);
    }

//    @Test
//    public void calcVacationincome10() {
//        VacationService service = new VacationService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int amount = 0;
//        int boss = service.calc(income, expenses, threshold, amount);
//        System.out.println(boss);
//    }
//
//
}