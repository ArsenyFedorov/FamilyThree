package modeel.Essence;

public interface AddEssence<T> {
    public void addSpouse(T spouse);

    public void addParents(T mom, T dad);

    public void addChildren(T children);
}
