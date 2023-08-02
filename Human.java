import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Essence, AddEssence<Human> {
    private String name;
    private LocalDate birth;
    private LocalDate death;
    private Gender gender;
    private List<Human> parents;
    private List<Human> children;
    private List<Human> spouse;

    public Human(String name, LocalDate birth, LocalDate death, Gender gender, Human mather, Human father) {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.spouse = new ArrayList<>();
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.gender = gender;
        if (mather != null) {
            this.parents.add(mather);
        }
        if (father != null) {
            this.parents.add(father);
        }
    }

    public Human(String name, LocalDate birth, Gender gender, Human mather, Human father) {
        this(name, birth, null, gender, mather, father);
    }

    public Human(String name, LocalDate birth, LocalDate death, Gender gender) {
        this(name, birth, death, gender, null, null);
    }

    public Human(String name, LocalDate birth, Gender gender) {
        this(name, birth, null, gender, null, null);
    }

    public String parentsEssence() {
        if (parents.size() != 0) {
            return "Родители " + name + ":\n" + parents.get(0).toString() + "\n" + parents.get(1).toString();
        } else {
            return "Родители " + name + " Неизвестны (";
        }
    }

    public String spouseEssence() {
        if (this.spouse.size() == 0) {
            return "У этой сущности нет пары (";
        } else if (this.spouse.get(0).gender == Gender.Man) {
            return "У этой сущности есть супруг:\n" + this.spouse.get(0).toString();
        } else {
            return "У этой сущности есть супруга:\n" + this.spouse.get(0).toString();
        }
    }

    public void childrenEssence() {
        if (children.size() == 0) {
            System.out.println("У этой сущности нет детей");
        } else {
            System.out.println("Дети " + this.name + ":");
            for (Essence childern : children) {
                System.out.println(childern.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Birth: " + birth + ", Death:" + death + ", Gender:" + gender;
    }

    public String essenceName() {
        return name;
    }

    public LocalDate ageEssence() {
        return birth;
    }

    public void addSpouse(Human spouse) {
        if (gender == spouse.gender) {
            System.out.println("Я против гейства !!!");
        } else if (parents.contains(spouse) || children.contains(spouse)) {
            System.out.println("Ты по моему перепутал");
        } else if (this.spouse.size() == 0) {
            this.spouse.add(spouse);
        } else {
            System.out.println("Горем это не плохо но не в нашей стране )");
        }
    }

    public void addParents(Human mom, Human dad) {
        if (parents.size() != 0) {
            System.out.println("У этой сущности уже есть родители");
        } else if (children.contains(mom) || children.contains(dad) || spouse.contains(mom) || spouse.contains(dad)) {
            System.out.println("Ты по моему перепутал");
        } else {
            parents.add(mom);
            parents.add(dad);
        }
    }

    public void addChildren(Human children) {
        if (spouse.size() == 0) {
            System.out.println("Я понимаю что ребёнок может быть из детского дома, но это глупо реализовывать если" +
                    "у меня есть поле жена или муж");
        } else if (this.children.contains(children)) {
            System.out.println("Два одинаковых ребёнка ? Это бред");
        } else if (this.spouse.contains(children) || this.parents.contains(children)) {
            System.out.println("Ты по моему перепутал");
        } else {
            this.children.add(children);
            this.spouse.get(0).children.add(children);
        }
    }

}
