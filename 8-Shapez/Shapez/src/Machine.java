import java.util.Queue;

public interface Machine {
    public abstract Figure pull();
    public abstract void print_work(Figure f);
}
