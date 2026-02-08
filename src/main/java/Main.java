import ru.netology.services.VacationService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
VacationService service = new VacationService();
int income = 10_000;
int expenses = 3_000;
int threshold = 20_000;
int amount = 0;

int web = service.calc(income, expenses, threshold, amount);
        System.out.println(web);
    }
}
