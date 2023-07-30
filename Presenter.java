public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
    }
    public void start(){
        boolean flag = true;
        while (flag){
            int event = view.event();
            switch (event) {
                case 1:
                    model.familyThree.toString();
                    break;
                case 2:
                    int essenceIndex =  view.essenceParents(model.familyThree.essence);
                    Essence essence = (Essence) model.familyThree.essence.get(essenceIndex);
                    System.out.println(essence.parentsEssence());
                    break;
                case 3:
                    int UIndex = view.essenceChildren(model.familyThree.essence);
                    Essence essence1 = (Essence) model.familyThree.essence.get(UIndex);
                    essence1.childrenEssence();
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
