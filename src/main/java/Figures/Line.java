package Figures;
import IDrawable.Drawable;

public class Line implements Drawable {

    private Point pointStart;
    private Point pointEnd;

    public  Line(Point start,Point end) {
        this.pointStart = start;
        this.pointEnd = end;
    }
    /*
    Draw method insert a line in the canvas checking with control structures
    that the line is straight
    */
    public boolean draw(byte[][] Canvas) {

        if (pointStart.getY() == pointEnd.getY()) {
            for ( int i = pointStart.getX(); i <= pointEnd.getX() ; i++) {
                int j = pointStart.getY();
                Canvas[j][i] = 2;
            } return true;
        } else if (pointStart.getX() == pointEnd.getX()) {
            for ( int i = pointStart.getY(); i <= pointEnd.getY() ; i++) {
                int j = pointStart.getX();
                Canvas[i][j] = 2;

            } return true;
        } else
            System.out.println("Only straight lines are allowed");
        return false;

    }
}
