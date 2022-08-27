import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Графигин коргунуз келген жума кунун жазыныз (Дуйшомбу - Жекшемби): ");
        String day = scanner.nextLine();
        switch (day) {
            case "Дуйшомбу" -> System.out.println(DaysOfTheWeek.MONDAY.getDaysInKyrgyz() + " - Жава (Техннический сабак)!");
            case "Шейшемби" -> System.out.println(DaysOfTheWeek.TUESDAY.getDaysInKyrgyz() + " - Жава (Практический сабак)!");
            case "Шаршемби" -> System.out.println(DaysOfTheWeek.THIRSDAY.getDaysInKyrgyz() + " - Жава (Техннический сабак)!");
            case "Бейшемби" -> System.out.println(DaysOfTheWeek.WEDNESDAY.getDaysInKyrgyz() + " - Жава (Практический сабак)!");
            case "Жума" -> System.out.println(DaysOfTheWeek.FRIDAY.getDaysInKyrgyz() + " - Жава (Техннический сабак)!");
            case "Ишемби" -> System.out.println(DaysOfTheWeek.SATURDAY.getDaysInKyrgyz() + " - Эс алуу куну! ");
            case "Жекшемби" -> System.out.println(DaysOfTheWeek.SUNDAY.getDaysInKyrgyz() + " - Эс алуу куну!");
            default -> System.out.println("Жума кунун туура эмес жаздыныз!!!");
        }
    }
}