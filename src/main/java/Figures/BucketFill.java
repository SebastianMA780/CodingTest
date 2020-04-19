package Figures;
import IDrawable.Drawable;

public class BucketFill implements Drawable {

    private Point pointStart;

    public BucketFill(Point point) {
        this.pointStart = point;
    }
    /*
    * Recursive function that checks north , south , est , west of the point given
    to verify what points are adjacent to it and which ones no
    * */
    static void bucketFillUtil(byte[][] Canvas,int x, int y, int prevS,int newS) {
        if (y < 0 || y >  Canvas[0].length - 1 || x < 0 || x >  Canvas.length - 1)
            return;
        if (Canvas[x][y] != prevS)
            return;
        Canvas[x][y] = (byte) newS;

        bucketFillUtil(Canvas,x + 1, y,prevS,newS);
        bucketFillUtil(Canvas,x - 1, y,prevS,newS);
        bucketFillUtil(Canvas,x , y + 1,prevS,newS);
        bucketFillUtil(Canvas,x , y -1,prevS,newS);
    }

    static void bucketFill(byte[][] Canvas, int x, int y) {
        int previousState = Canvas[x][y];
        int newState = 1;
        bucketFillUtil(Canvas,x,y,previousState,newState);
    }
    /*
    Fill the entire area of the canvas connected a point given
    calling a recursive function
    */
    public boolean draw(byte[][] Canvas) {

        bucketFill( Canvas, pointStart.getY() ,pointStart.getX() );

        return true;
    }
}
