
package co.unicauca.figures.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class testTriangle {
    
    public testTriangle() {
    }
    
     @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Triangle triangle = new Triangle(2,3,2,2);
        double expResult = 6;
        double result = triangle.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Triangle triangle = new Triangle(2,3,2,2);
        double expResult = 3;
        double result = triangle.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
