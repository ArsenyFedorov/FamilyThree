import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyThree<E extends Essence> implements Serializable, Iterable<E> {
    List<E> essence;

    public FamilyThree() {
        essence = new ArrayList<>();
    }

    public void addEssence(E essence) {
        if (this.essence.contains(essence)) {
            System.out.println("Эта сущность уже существует");
        } else {
            this.essence.add(essence);
        }
    }

    @Override
    public String toString() {
        for (E e : this.essence) {
            System.out.println(e.toString());
        }
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new EssenceIterator(this.essence);
    }

    public void nameSorted() {
        List<String> name_list = new ArrayList<>();
        for (E e: this.essence) {
            name_list.add(e.essenceName());
        }
        List<E> new_essence = new ArrayList<>();
        Collections.sort(name_list);
        for (String name : name_list) {
            for (E e : this.essence) {
                if (e.essenceName().equals(name)) {
                    new_essence.add(e);
                }
            }
        }
        this.essence = new_essence;
    }

    public void ageSorted() {
        List<LocalDate> age_list = new ArrayList<>();
        for (E e : this.essence) {
            age_list.add(e.ageEssence());
        }
        List<E> new_essence = new ArrayList<>();
        Collections.sort(age_list);
        for (LocalDate date : age_list) {
            for (E e : this.essence) {
                if (e.ageEssence().equals(date)) {
                    new_essence.add(e);
                }
            }
        }
        this.essence = new_essence;
    }
}
