import java.security.spec.ECField;
import java.util.Iterator;
import java.util.List;

public class HumanIterator<E extends Essence> implements Iterator<Essence> {
    private int index;
    private List<E> essence;

    public HumanIterator(List<E> essence) {
        this.essence = essence;
    }

    @Override
    public boolean hasNext() {
        return essence.size() > index;
    }

    @Override
    public Essence next() {
        return essence.get(index++);
    }
}
