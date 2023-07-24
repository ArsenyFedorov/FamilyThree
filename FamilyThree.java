import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyThree implements Serializable, Iterable<Human> {
    List<Human> humans;

    public FamilyThree() {
        humans = new ArrayList<>();
    }

    public void addHuman(Human human) {
        if (humans.contains(human)) {
            System.out.println("Этот человек уже существует");
        } else {
            humans.add(human);
        }
    }

    @Override
    public String toString() {
        for (Human human : humans) {
            System.out.println(human.toString());
        }
        return null;
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(this.humans);
    }

    public void nameSorted() {
        List<String> name_list = new ArrayList<>();
        for (Human human : humans) {
            name_list.add(human.humanName());
        }
        List<Human> new_human = new ArrayList<>();
        Collections.sort(name_list);
        for (String name : name_list) {
            for (Human human : humans) {
                if (human.humanName().equals(name)) {
                    new_human.add(human);
                }
            }
        }
        this.humans = new_human;
    }

    public void ageSorted() {
        List<LocalDate> age_list = new ArrayList<>();
        for (Human human : humans) {
            age_list.add(human.ageHuman());
        }
        List<Human> new_human = new ArrayList<>();
        Collections.sort(age_list);
        for (LocalDate date : age_list) {
            for (Human human : humans) {
                if (human.ageHuman().equals(date)) {
                    new_human.add(human);
                }
            }
        }
        this.humans = new_human;
    }
}
