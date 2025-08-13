
package co.unicauca.figures.domain;

public class Square implements Figure{
    private double Side = 0;

    public Square(double side) {
        this.Side = side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }
    
    @Override
    public double calculatePerimeter() {
        
        return Side * 4;
    }

    @Override
    public double calculateArea() {
        System.out.println("Square");
        
        return Side * Side;
    }
    
    
}
