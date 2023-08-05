package view;

import modeel.Essence.Gender;
import presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean flag;

    public ConsoleUI() {
        this.presenter = new Presenter(this);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать");
        flag = true;
        while (flag) {
            System.out.println("Меню:\n" +
                    "1.Добавить сущность\n" +
                    "2.Вывести список сущностей\n" +
                    "3.Отсортировать по дате\n" +
                    "4.Отсортировать по алфавиту\n" +
                    "5.Закончить");
            String event = scanner.nextLine();
            switch (event) {
                case "1":
                    addEssence();
                    break;
                case "2":
                    listEssence();
                    break;
                case "3":
                    dateSorted();
                    break;
                case "4":
                    nameSorted();
                    break;
                case "5":
                    exit();
                default:
                    inputError();

            }
        }
    }

    private void exit() {
        System.out.println("До встречи");
        flag = false;
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    private void inputError() {
        printAnswer("Вы ввели что то не то (\n" +
                "Попробуйте ещё раз )");
    }

    private void addEssence() {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1.Мальчик\n" +
                "2.Девочка\n" +
                "Выберите гендер:");
        String num = scanner.nextLine();
        switch (num) {
            case "1":
                Gender gender = Gender.Man;
                presenter.addEssence(name, LocalDate.of(year, month, day), gender);
                break;
            case "2":
                Gender gender1 = Gender.Woman;
                presenter.addEssence(name, LocalDate.of(year, month, day), gender1);
                break;
            default:
                inputError();
        }
    }

    private void listEssence() {
        presenter.listEssence();
    }

    private void dateSorted() {
        presenter.dateSorted();
    }

    private void nameSorted() {
        presenter.nameSorted();
    }
}
