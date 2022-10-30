import java.util.Queue;

public abstract class ComplexMachine implements Machine{

    protected Queue<Figure> figures;
    public abstract void push(Figure figure) throws Exception;

}
