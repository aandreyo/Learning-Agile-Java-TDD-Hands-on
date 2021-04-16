package Exercises.Exercise_1;

public class Pawn {
    private String color;

    public Pawn(){} // default constructor

    public Pawn(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
