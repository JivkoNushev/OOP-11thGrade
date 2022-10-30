public class Segment{
    protected String color;

    public Segment(String color) {
        this.color = color;
    }

    protected void setColor(String color) {
        this.color = color;
        if(!color.equalsIgnoreCase("GREEN") && !color.equalsIgnoreCase("RED") && !color.equalsIgnoreCase("YELLOW") && !color.equalsIgnoreCase("BLUE"))
            this.color = null;
    }

    public String getColor() {
        return color;
    }
}
