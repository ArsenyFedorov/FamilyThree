import java.time.LocalDate;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Human mather = new Human("Maria", LocalDate.of(1984, 5, 28), Gender.Woman);
        Human father = new Human("Aleksandr", LocalDate.of(1982, 5, 1),
                LocalDate.of(2021, 10, 18), Gender.Man);
        Human me = new Human("Arseny", LocalDate.of(2007, 10, 26), Gender.Man);
        me.addParents(mather, father);
        FamilyThree my_family = new FamilyThree();
        my_family.addHuman(mather);
        my_family.addHuman(father);
        my_family.addHuman(me);
        my_family.toString();
        System.out.println();
        my_family.ageSorted();
        my_family.toString();
        System.out.println();
        my_family.nameSorted();
        my_family.toString();
    }
}
