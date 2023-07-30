import java.util.List;
import java.util.Scanner;

public class View {
    protected int event() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите сделать:\n" +
                "1.Вывести список древа\n" +
                "2.Вывести имена родителей\n" +
                "3.Вывести детей\n" +
                "4.Закончить");
        System.out.println("Введите число действия: ");
        int event = scanner.nextInt();
        return event;
    }

    protected int essenceParents(List<Essence> essences) {
       int index = 1;
       Scanner scanner = new Scanner(System.in);
        for (Essence e : essences){
            System.out.println(index + ": " + e.toString());
            index++;
        }
        System.out.println("Введите номер сущности которая вас интересует:");
        int essence_index = scanner.nextInt();
        return essence_index - 1;
    }
    protected int essenceChildren(List<Essence> essences){
        int index = 1;
        Scanner scanner = new Scanner(System.in);
        for (Essence e : essences){
            System.out.println(index + ": " + e.toString());
            index++;
        }
        System.out.println("Введите номер сущности которая вас интересует:");
        int essence_index = scanner.nextInt();
        return essence_index - 1;
    }
}
