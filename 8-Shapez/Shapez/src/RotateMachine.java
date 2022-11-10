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
        System.out.println("\n\nRotating...\n");
        int count = 0;
        for (int j = 0; j < 4; j++) {
            Segment s = segm.get(j);
            String c = "";

            if (s == null) {
                System.out.print(Color.WHITE);
                c = "";
                for (int k = 0; k < 6; k++) {
                    c += "/";
                }
            }
            else if(s.color.equalsIgnoreCase("RED")){
                System.out.print(Color.RED);
                c = " RED  ";
            }
            else if (s.color.equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
                c = "YELLOW";
            }
            else if (s.color.equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
                c = " BLUE ";
            }
            else if (s.color.equalsIgnoreCase("GREEN")) {
                System.out.print(Color.GREEN);
                c = "GREEN ";
            }
            System.out.print("|" + c + "|");
            count++;

            if (count == 2) {
                System.out.println();
            }
            System.out.print(Color.RESET);
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
        System.out.println("\n\nRotating " + rotation + "...");

        print_work(f);
    }

}
