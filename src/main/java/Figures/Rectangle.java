package Figures;
import IDrawable.Drawable;

public  class Rectangle implements Drawable {

    private Point pointStart;
    private Point pointEnd;

    public  Rectangle(Point start,Point end) {
        this.pointStart = start;
        this.pointEnd = end;
    }
    /*
        Draw method insert a rectangle in the canvas
    */
    public  void draw(byte[][] Canvas) {

        for ( int i = pointStart.getY(); i <= pointEnd.getY(); i++) {
            for (int j = pointStart.getX(); j <= pointEnd.getX(); j++) {
                if (i == pointStart.getY()|| i == pointEnd.getY() || j == pointStart.getX() || j == pointEnd.getX())
                    Canvas[i][j] = 2;
                else
                    Canvas[i][j] = 1;
            }

        }
    }
}
