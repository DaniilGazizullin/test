import java.util.Scanner;
public class Zadanie_TEST {
    public static void main(String[] args) {
        double kursUSD = 91.45;
        double kursCNY = 11.91;
        double kursKZT = 0.19;
        double kursTRY = 2.69;
        double kursRUB = 1.00;

        double bankUSD = 0;
        double bankCNY = 0;
        double bankKZT = 0;
        double bankTRY = 0;
        double bankRUB = 0;
        Scanner scanner = new Scanner(System.in);
        double summa=0;
        while (true) {

            System.out.println("Какую операцию вы бы хотели совершить");
            System.out.println("1)Внести");
            System.out.println("2)Баланс");
            System.out.println("3)Снять");
            System.out.println("4)Обмен");
            System.out.println("5)выход");
            String s = scanner.nextLine();
            switch (s) {
                case "Внести":
                case "1":
                case "внести":
                    System.out.println("Введите сумму и валюту для пополнения (USD,CNY,KZT,TRY,RUB), например 10.50 USD ");
                    String input = scanner.nextLine();
                    String[] parts = input.split(" ");
                    if (parts.length != 2) {
                        System.out.println("Неправильный формат ввода! Введите:сумма пробел валюта");
                        break;
                    }
                    try {
                        summa = Double.parseDouble(parts[0]);
                        switch (parts[1]) {
                            case "USD":
                            case "usd":
                                bankUSD = bankUSD + summa;
                                System.out.println("Баланс USD:" + String.format("%.2f", bankUSD));
                                break;
                            case "CNY":
                            case "cny":
                                bankCNY = bankCNY + summa;
                                System.out.println("Баланс SNY:" + String.format("%.2f", bankCNY));
                                break;
                            case "KZT":
                            case "kzt":
                                bankKZT = bankKZT + summa;
                                System.out.println("Баланс KZT:" + String.format("%.2f", bankKZT));
                                break;
                            case "TRY":
                            case "try":
                                bankTRY = bankTRY + summa;
                                System.out.println("Баланс TRY:" + String.format("%.2f", bankTRY));
                                break;
                            case "RUB":
                            case "rub":
                                bankRUB = bankRUB + summa;
                                System.out.println("Баланс RUB:" + String.format("%.2f", bankRUB));
                                break;
                            default:
                                System.out.println("Неизвестная валюта");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода суммы.");
                    }

                    break;
                case "Баланс":
                case "баланс":
                case "2":
                    System.out.println("Ваш баланс:");
                    System.out.println("USD: " + String.format("%.2f", bankUSD));
                    System.out.println("CNY: " + String.format("%.2f", bankCNY));
                    System.out.println("KZT: " + String.format("%.2f", bankKZT));
                    System.out.println("TRY: " + String.format("%.2f", bankTRY));
                    System.out.println("RUB: " + String.format("%.2f", bankRUB));
                    break;
                case "Снять":
                case "снять":
                case "3":
                    System.out.println("Введите сумму и валюту для снятия (USD,CNY,KZT,TRY,RUB), например 10.50 USD ");
                    String input1 = scanner.nextLine();
                    String[] parts1 = input1.split(" ");
                    if (parts1.length != 2) {
                        System.out.println("Неправильный формат ввода! Введите:сумма пробел валюта");
                        break;
                    }
                    try {
                        summa = Double.parseDouble(parts1[0]);
                        switch (parts1[1]) {
                            case "USD":
                            case "usd":
                                if (bankUSD > summa) {
                                    bankUSD = bankUSD - summa;
                                    System.out.println("Баланс USD:" + String.format("%.2f", bankUSD));
                                    break;
                                } else {
                                    System.out.println("Недостаточно денег, на балансе ");
                                    break;
                                }
                            case "CNY":
                            case "cny":
                                if (bankCNY > summa) {
                                    bankCNY = bankCNY - summa;
                                    System.out.println("Баланс CNY :" + String.format("%.2f", bankCNY));
                                    break;
                                } else {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                            case "KZT":
                            case "kzt":
                                if (bankKZT > summa) {
                                    bankKZT = bankKZT - summa;
                                    System.out.println("Баланс KZT :" + String.format("%.2f", bankKZT));
                                    break;
                                } else {
                                    System.out.println("Недостаточно денег на балансе ");
                                    break;
                                }
                            case "TRY":
                            case "try":
                                if (bankTRY > summa) {
                                    bankTRY = bankTRY - summa;
                                    System.out.println("Баланс TRY :" + String.format("%.2f", bankTRY));
                                    break;
                                } else {
                                    System.out.println("Недостаточно денег, на балансе ");
                                    break;
                                }
                            case "RUB":
                            case "rub":
                                if (bankRUB > summa) {
                                    bankRUB = bankRUB - summa;
                                    System.out.println("Баланс RUB :" + String.format("%.2f", bankRUB));
                                    break;
                                } else {
                                    System.out.println("Недостаточно денег, на балансе ");
                                    break;
                                }
                            default:
                                System.out.println("Неизвестная валюта");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода суммы.");
                    }
                    break;

                case "Обмен":
                case "обмен":
                case "4":
                    System.out.println("Введите валюту для обмена, сумму, валюту для получения  (USD,CNY,KZT,TRY,RUB), например TRY 10.50 USD ");
                    String input2 = scanner.nextLine();
                    String[] parts2 = input2.split(" ");
                    if (parts2.length != 3) {
                        System.out.println("Неправильный формат ввода! Введите:валюта пробел сумма пробел валюта");
                        break;
                    }
                    try {
                        summa = Double.parseDouble(parts2[1]);
                        double kurs1 = 0;
                        double kurs2 = 0;
                        switch (parts2[0]) {
                            case "USD":
                            case "usd":
                                kurs1 = kursUSD;
                                if (bankUSD < summa) {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                                bankUSD = bankUSD - summa;
                                break;
                            case "CNY":
                            case "cny":
                                kurs1 = kursCNY;
                                if (bankCNY < summa) {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                                break;
                            case "KZT":
                            case "kzt":
                                kurs1 = kursKZT;
                                if (bankKZT < summa) {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                                break;
                            case "TRY":
                            case "try":
                                kurs1 = kursTRY;
                                if (bankTRY < summa) {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                                break;
                            case "RUB":
                            case "rub":
                                kurs1 = kursRUB;
                                if (bankRUB < summa) {
                                    System.out.println("Недостаточно денег на балансе");
                                    break;
                                }
                                break;
                            default:
                                System.out.println("Неизвестная валюта для получения");
                                break;
                        }
                        switch (parts2[2]) {
                            case "USD":
                            case "usd":
                                kurs2 = kursUSD;
                                bankUSD = bankUSD + summa * kurs1 / kurs2;
                                break;
                            case "cny":
                            case "CNY":
                                kurs2 = kursCNY;
                                bankCNY = bankCNY + summa * kurs1 / kurs2;
                                break;
                            case "KZT":
                            case "kzt":
                                kurs2 = kursKZT;
                                bankKZT = bankKZT + summa * kurs1 / kurs2;
                                break;
                            case "TRY":
                            case "try":
                                kurs2 = kursTRY;
                                bankTRY = bankTRY + summa * kurs1 / kurs2;
                                break;
                            case "RUB":
                            case "rub":
                                kurs2 = kursRUB;
                                bankRUB = bankRUB + summa * kurs1 / kurs2;
                                break;
                            default:
                                System.out.println("Неизвестная валюта для получения");
                                break;
                        }
                        summa = summa * kurs1 / kurs2;
                        System.out.println("Получено " + String.format("%.2f", summa) + " " + parts2[2]);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода суммы.");
                    }
                    break;
                case "выход":
                case "Выход":
                case"5":
                    System.out.println("До свидания");
                    return;
                default:
                    System.out.println("Неизвестная операция");
                    break;


            }

        }
    }
}
