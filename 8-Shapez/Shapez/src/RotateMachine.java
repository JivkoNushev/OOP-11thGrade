import java.util.ArrayList;

public class RotateMachine extends ComplexMachine {

    private boolean isRotationRight = false;

    public RotateMachine(boolean isRotationRight) {
        this.isRotationRight = isRotationRight;
    }

    @Override
    public void print_work(Figure f)
    {
        ArrayList<Segment> segm = f.getSegments();
        int count = 0;
        for(Segment s : segm)
        {
            if(s.getColor().equalsIgnoreCase("RED"))
                System.out.print(Color.RED);
            else if (s.getColor().equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
            }
            else if (s.getColor().equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
            }
            else if (s.getColor().equalsIgnoreCase("GREEN")) {
                System.out.print(Color.GREEN);
            }
            else{
                System.out.print(Color.WHITE);
            }

            System.out.print(s.getColor());

            System.out.print(Color.RESET);
            count++;

            if (count == 2) {
                System.out.println();
            }
        }
    }

    @Override
    public void push(Figure figure) throws Exception {
        rotate(figure);

        if (!figures.add(figure)) {
            throw new Exception("Couldn't add figure to RotateMachine");
        }
    }

    @Override
    public Figure pull() {
        return figures.remove();
    }

    private void rotate(Figure f)
    {
        print_work(f);

        String rotation;
        if (isRotationRight) {
            rotation = "Right";

            f.rotateRight();
        }
        else{
            rotation = "Left";

            f.rotateLeft();
        }
        System.out.println("Rotating " + rotation + "...");

        print_work(f);
    }

}
