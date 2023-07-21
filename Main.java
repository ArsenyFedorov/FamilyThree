import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human mather = new Human("Maria", LocalDate.of(1984, 5, 28),Gender.Woman);
        Human father = new Human("Aleksandr", LocalDate.of(1982,5, 1),
                LocalDate.of(2021,10, 18), Gender.Man);
        Human me = new Human("Arseny", LocalDate.of(2007, 10, 26), Gender.Man);
        me.addParents(mather, father);
        System.out.println(me.parentsHuman());
        me.addSpouse(mather);
        me.addChildren(mather);
        me.childrenHuman();
        System.out.println(me.spouseHuman());
        me.addParents(mather, father);
    }
}
