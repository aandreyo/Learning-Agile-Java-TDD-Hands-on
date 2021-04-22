package Exercises.Exercise_1;

public class Pawn {
	private String color;
	private static final String BLCK = "Black";
	private static final String WHTE = "White";
    private static final int TOTAL_PAWNS = 16;
    
	
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
