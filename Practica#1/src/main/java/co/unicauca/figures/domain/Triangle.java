
package co.unicauca.figures.domain;


public class Triangle implements Figure {
    private double base = 0;
    private double height = 0;
    private double FirstSide=0;
    private double SecondSide=0;
    

    public Triangle(double base, double height, double FirstSide, double SecondSide) {
        this.base = base;
        this.height = height;
        this.FirstSide = FirstSide;
        this.SecondSide = SecondSide;
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

    public double getFirstSide() {
        return FirstSide;
    }

    public void setFirstSide(double FirstSide) {
        this.FirstSide = FirstSide;
    }

    public double getSecondSide() {
        return SecondSide;
    }

    public void setSecondSide(double SecondSide) {
        this.SecondSide = SecondSide;
    }
    

    @Override
    public double calculatePerimeter() {
        
        return base + FirstSide + SecondSide;
    }

    @Override
    public double calculateArea() {
        System.out.println("Triangle");
        return (base * height ) / 2;
    }
    
    
    
}
