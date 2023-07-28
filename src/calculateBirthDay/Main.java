package calculateBirthDay;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth whit this format : yyyy-MM-dd");
        String a = scanner.nextLine();
        LocalDate localDateTime = LocalDate.now();
        LocalDate birthDay = LocalDate.parse(a);
        Period time = Period.between(birthDay, localDateTime);
        System.out.println("You have: " + time.getYears() +
                " years, " + time.getMonths() + " Months, " + time.getDays() +
                " Days ");
    }
}
