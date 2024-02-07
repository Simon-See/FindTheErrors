import javax.swing.*;
import java.awt.*;

public class CheckSolution {

    public static void main(String[] args) {
        //TODO die einzelnen Buchstaben sind wild im Raum verteilt und wenn man es richtig macht, dann sind sie in der Richtigen position

        // Create a new instance of the SearchForErrors class
        SearchForErrors_WorkHere searchForErrors = new SearchForErrors_WorkHere();
        SearchForErrors_Comparison comparison = new SearchForErrors_Comparison();
        int amount = 10;
        int[][] array2D = new int[3*amount][5];
        for (int i = 0; i < amount; i++) {
            array2D[i*3] = new int[]{ -((int)(Math.random()*1000)),-((int)(Math.random()*1000)),-((int)(Math.random()*1000)),-((int)(Math.random()*1000)),-((int)(Math.random()*1000))};
            array2D[i*3+1] = new int[]{((int)(Math.random()*1000)),((int)(Math.random()*1000)),((int)(Math.random()*1000)),((int)(Math.random()*1000)),((int)(Math.random()*1000))};
            array2D[i*3+2] = new int[]{-((int)(Math.random()*1000)),(-(int)(Math.random()*1000)),((int)(Math.random()*1000)),((int)(Math.random()*1000)),((int)(Math.random()*1000)+1000)};
        }

        for (int i = 0; i < array2D.length; i++) {
            if (searchForErrors.findMax(array2D[i]) != comparison.findMax(array2D[i]) || searchForErrors.findMin(array2D[i]) != comparison.findMin(array2D[i]))
                throw new IllegalStateException("The Minimum or maximum method is not working correctly");
            for (int j = 0; j < array2D[i].length; j++) {
                if(searchForErrors.dividableByTwo(array2D[i][j]) != comparison.dividableByTwo(array2D[i][j]))
                    throw new IllegalStateException("The dividable by 2 method is not working correctly")
            }

        }


    }
}