import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyThree implements Serializable {
    List<Human> humans;
    public FamilyThree(){
        humans = new ArrayList<>();
    }

    public void addHuman(Human human){
        if(humans.contains(human)){
            System.out.println("Этот человек уже существует");
        }else {
            humans.add(human);
        }
    }

    @Override
    public String toString() {
        for(Human human : humans){
            System.out.println(human.toString());
        }
        return null;
    }
}
