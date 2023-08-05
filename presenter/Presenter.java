package presenter;

import modeel.Essence.Essence;
import modeel.Essence.Gender;
import modeel.Essence.Human;
import modeel.FamilyTree.FamilyThree;
import view.View;

import java.time.LocalDate;

public class Presenter<E extends Essence> {
    private View view;
    private FamilyThree familyThree;

    public Presenter(View view) {
        this.view = view;
        this.familyThree = new FamilyThree();
    }

    public void addEssence(String name, LocalDate date, Gender gender) {
        Human essence = new Human(name, date, gender);
        this.familyThree.addEssence(essence);
    }

    public void listEssence() {
        familyThree.toString();
    }

    public void dateSorted() {
        familyThree.ageSorted();
    }

    public void nameSorted() {
        familyThree.nameSorted();
    }
}

