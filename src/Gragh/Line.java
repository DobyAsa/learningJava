package Gragh;

public class Line extends Shape{

    public static void main(String[] args){
        Point a = new Point(1,2);
        Point b = new Point(4,9);
        Line l = new Line(a, b, "black");
        System.out.println(l.getLength());
    }





    private Point start;
    private Point end;

    public Line(Point s, Point e, String color){
        super(color);
        this.start = s;
        this.end = e;

    }
    public double getLength(){
        return start.distance(end);
    }
    @Override
    public void draw(){
        System.out.println("draw line from " + start.toString()
                +" to "+end.toString()
                +",using color "+getColor());
    }
}
