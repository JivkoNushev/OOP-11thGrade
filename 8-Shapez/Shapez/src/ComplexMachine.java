import java.util.LinkedList;
import java.util.Queue;

public abstract class ComplexMachine implements Machine{

    protected Queue<Figure> figures = new LinkedList<Figure>();
    public abstract void push(Figure figure) throws Exception;

}
