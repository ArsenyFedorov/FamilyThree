import java.io.Serializable;

public interface Writable {
    boolean write(Serializable obj);

    Object read();
}
