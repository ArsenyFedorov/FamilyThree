package modeel.Essence;

import java.util.Iterator;
import java.util.List;

public class EssenceIterator<E extends Essence> implements Iterator<E> {
    private int index;
    private List<E> essence;

    public EssenceIterator(List<E> essence){
        this.essence = essence;
    }

    @Override
    public boolean hasNext() {
        return essence.size() > index;
    }

    @Override
    public E next() {
        return essence.get(index++);
    }
}
