
package co.unicauca.figures.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class testSquare {
    
    public testSquare() {
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Square square = new Square(2);
        double expResult = 8;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Square square = new Square(2);
        double expResult = 4;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}

