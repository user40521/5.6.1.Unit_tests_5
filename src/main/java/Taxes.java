import java.util.Scanner;

public class Taxes {
    //            public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            int earnings = 0; // доходы
//            int spendings = 0; // расходы
//
//            while (true) {
//                System.out.println("Выбрете операцию и введите её номер: ");
//                System.out.println("1. Добавить новый расход");
//                System.out.println("2. Добавить новый расход");
//                System.out.println("3. Выбрать систему налогооблажения");
//
//
//                String input = scanner.nextLine();
//                if ("end".equals(input)) {
//                    System.out.println("Программа завершена!");
//                    break;
//                }
//
//                int operation = Integer.parseInt(input);
//                switch (operation) {
//                    case 1:
//                        System.out.println("Введите сумму дохода");
//                        String moneyStr = scanner.nextLine();
//                        int money = Integer.parseInt(moneyStr);
//                        earnings += money;
//                        break;
//                    case 2:
//                        System.out.println("Введите сумму расхода");
//                        String rashodStr = scanner.nextLine();
//                        int rashod = Integer.parseInt(rashodStr);
//                        spendings += rashod;
//                        break;
//                    case 3:
//
//                        int six = taxEarningsSixPerCents(earnings);
//                        int percent = taxEarningsMinusSpendings(earnings, spendings);
//
//                        if (six < percent) {
//                            System.out.println("Мы советуем вам УСН доходы минус расходы");
//                            System.out.println("Ваш налог составит " + percent + "рублей");
//                            System.out.println("Ваш налог на другой системе составит " + six + "рублей");
//                            System.out.println("Экономия: " + (six - percent) + "рублей");
//                        } else if (percent < six) {
//                            System.out.println("Мы советуем вам УСН доходы ");
//                            System.out.println("Ваш налог составит " + six + "рублей");
//                            System.out.println("Ваш налог на другой системе составит " + percent + "рублей");
//                            System.out.println("Экономия: " + (percent - six) + "рублей");
//                            break;
//                        } else {
//                        }
//                    default:
//                        System.out.println("Такой операции нет");
//                }
//            }
//        }
    public int taxEarningsSixPerCents(int earnings) {
        int tax1 = earnings * 6 / 100;

        if (tax1 >= 0) {
            return tax1;
        } else {
            return 0;
        }
    }

    public int taxEarningsMinusSpendings(int earnings, int spendings) {

        int tax2 = (earnings - spendings) * 15 / 100;

        if (tax2 >= 0) {
            return tax2;

        } else {
            return 0;
        }
    }

    public boolean notEquals(int a, int b) {
        if (taxEarningsSixPerCents(a) <= taxEarningsMinusSpendings(a, b)) {
            return true;
        } else return false;
    }


}



