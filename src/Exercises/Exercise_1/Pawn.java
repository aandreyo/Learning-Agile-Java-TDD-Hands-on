package Exercises.Exercise_1;

public class Pawn {
	private String color;
	private int pawnCount;
	static final String BLCK = "Black";
	static final String WHTE = "White";
    static final int TOTAL_PAWNS = 16;
    
	
    public Pawn(){} // default constructor
    
    public Pawn(String color,int pawnCount){
        this.color = color;
        this.pawnCount=pawnCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPawnCount() {
		return pawnCount;
	}

	public void setPawnCount(int pawnCount) {
		this.pawnCount = pawnCount;
	}

	
    
}
