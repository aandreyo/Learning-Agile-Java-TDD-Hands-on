package Exercises.Exercise_1;

import Exercises.Exercise_1.Pawn;

public class PawnTest extends junit.framework.TestCase{


    public void testCreate(){
        Pawn pawn = new Pawn();
        /*
         * First test Color
         *
         * */
        pawn.setColor("White");
        String firstColor = pawn.getColor();
        String testColor = "White";
        assertEquals(testColor,firstColor);

        /*
        * Second test color
        *
        * */
        pawn.setColor("Black");
        String secondColor = pawn.getColor();
        String testColor2 = "Black";
        assertEquals(testColor2,secondColor);
    }

}
