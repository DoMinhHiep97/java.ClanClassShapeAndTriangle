public class Shape {
    private String color="green";
    private boolean filled=true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    private String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override//ghi đè
    public String toString(){
        return "A Shape with color of "+getColor()+" and "+(isFilled()?"filled":"not filled");
    }
}
