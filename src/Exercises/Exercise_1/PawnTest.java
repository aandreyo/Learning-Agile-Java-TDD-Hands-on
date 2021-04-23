package Exercises.Exercise_1;



public class PawnTest extends junit.framework.TestCase{
	private String COLOR_WHITE = Pawn.WHTE;
    private String COLOR_BLACK = Pawn.BLCK;
    private int PAWNS_COUNT = 16;
    Board boards;
    
	Pawn firstPlayerColor, secondPlayerColor;
	
    String white = "White";
    String black = "Black";
    
    
    
	public void setUp(){     
		
		boards = new Board();
		
		firstPlayerColor = new Pawn(COLOR_WHITE,PAWNS_COUNT);
		secondPlayerColor = new Pawn(COLOR_BLACK,PAWNS_COUNT);
		
		
	}
	
	
    public void testPlayerColor(){
    	
       assertEquals(white, firstPlayerColor.getColor());
       assertEquals(black, secondPlayerColor.getColor());
       
    }
    
    public void testBoardIfExist() {
    	/*
    	 * to check if pawn has zero added player
    	 * assertEquals(2,boards.getPawnsTotal());
    	 * 
    	 * 
    	 * */
    	boards.addPawn(firstPlayerColor);
    	boards.addPawn(secondPlayerColor);
    	
    	assertEquals(16,firstPlayerColor.getPawnCount());
    	assertEquals(16,secondPlayerColor.getPawnCount());
    	
    	
    }
    
    
}
