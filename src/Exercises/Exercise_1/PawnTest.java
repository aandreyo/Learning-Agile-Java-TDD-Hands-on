package Exercises.Exercise_1;



public class PawnTest extends junit.framework.TestCase{
	Pawn firstPlayer = new Pawn();
	Pawn secondPlayer = new Pawn();
	String black = "Black";
    String white = "White";
    
    private String COLOR_WHITE;
    private String COLOR_BLACK;
    
    
    
	public void setUp(){     
		COLOR_WHITE = Pawn.WHTE;
		COLOR_BLACK = Pawn.BLCK;
		firstPlayer.setColor(COLOR_WHITE);
		secondPlayer.setColor(COLOR_BLACK);
		
	}
	
    public void testPlayerColor(){
           
        assertEquals(white,firstPlayer);
        assertEquals(black,secondPlayer);
       
    }

}
