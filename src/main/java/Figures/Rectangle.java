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
        Draw method inserts a rectangle in the canvas checking that (x1,y1) be
        upper left corner and (x2,y2)  be lower right corner
    */
    public boolean draw(int[][] Canvas) {
        if (pointStart.getX() < pointEnd.getX() && pointStart.getY() < pointEnd.getY() ) {
            for ( int i = pointStart.getY(); i <= pointEnd.getY(); i++) {
                for (int j = pointStart.getX(); j <= pointEnd.getX(); j++) {

                    if ( i == pointStart.getY() || i == pointEnd.getY()
                        || j == pointStart.getX() || j == pointEnd.getX() )
                            Canvas[i][j] = 2;
                    else
                             Canvas[i][j] = 0;
                }
            } return true;
        } else
            System.out.println("(x1,y1) should be upper left corner "+
                    "(x2,y2) should be lower right corner");
            return false;

    }
}
