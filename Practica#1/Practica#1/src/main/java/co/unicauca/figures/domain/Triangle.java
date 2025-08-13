
package co.unicauca.figures.domain;


public class Triangle implements Figure {
    private double base = 0;
    private double height = 0;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        
        return base + (height * 2);
    }

    @Override
    public double calculateArea() {
        System.out.println("Triangle");
        return (base * height ) / 2;
    }
    
    
    
}
