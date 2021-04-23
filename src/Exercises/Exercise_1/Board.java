/**
 * 
 */
package Exercises.Exercise_1;

import java.util.*;
/**
 * @author ANREW25
 *
 */
public class Board {
	ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	
	
	
	
	public void addPawn(Pawn pawn) {
		pawns.add(pawn);
	}
	
	
	public int getPawnsTotal() {
		return pawns.size();
	}
	
}
