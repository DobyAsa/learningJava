package Gragh;

public class Circle extends Shape {

    public static void main(String[] args){
        Point center = new Point(2, 3);
        Circle circle = new Circle(center, 2);
        circle.draw();
        System.out.println("The Area is : " + circle.area());
    }




    private Point center;
    private double r;
    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println("draw Circle at " + center.toString() + " with r " + r + ",using color : " + getColor());
    }
    public double area(){
        return Math.PI*r*r;
    }
}
