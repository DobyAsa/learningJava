package Gragh;

public class ArrowLine extends Line{
    private boolean startArrow;
    private boolean endArrow;
    public ArrowLine(Point s, Point e, String color,
                     boolean startArrow, boolean endArrow) {
        super(s, e, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }
    @Override
    public void draw(){
        super.draw();
        if(startArrow){
            System.out.println("draw start arrow");
        }
        if(endArrow){
            System.out.println("draw end arrow");
        }
    }
}
