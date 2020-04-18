package Figures;
import IDrawable.Drawable;

public class BucketFill implements Drawable {

    private Point pointStart;

    public BucketFill(Point point) {
        this.pointStart = point;
    }

    static void bucketFillUtil(int[][] Canvas,int x, int y, int prevS,int newS) {
        if (y < 0 || y >  Canvas[0].length - 1 || x < 0 || x >  Canvas.length - 1)
            return;
        if (Canvas[x][y] != prevS)
            return;
        Canvas[x][y] = newS;

        bucketFillUtil(Canvas,x + 1, y,prevS,newS);
        bucketFillUtil(Canvas,x - 1, y,prevS,newS);
        bucketFillUtil(Canvas,x , y + 1,prevS,newS);
        bucketFillUtil(Canvas,x , y -1,prevS,newS);
    }

    static void bucketFill(int[][] Canvas, int x, int y) {
        int previousState = Canvas[x][y];
        int newState = 1;
        System.out.println(previousState);
        bucketFillUtil(Canvas,x,y,previousState,newState);
    }

    public boolean draw(int[][] Canvas) {

        bucketFill( Canvas, pointStart.getY() ,pointStart.getX() );

        return true;
    }
}
