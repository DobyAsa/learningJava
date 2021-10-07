package Gragh;

public class Point {

    public static void main(String[] args){
        Point a = new Point(3,5);
        System.out.println(a.toString());
    }




    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double distance(Point a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
