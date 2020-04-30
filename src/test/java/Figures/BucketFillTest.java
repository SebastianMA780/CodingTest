package Figures;
import Canvas.Canvas;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class BucketFillTest {

     Canvas canvas = new Canvas(20,4);

    @Test
    public void createBucketFill() {
        Point pointStart = new Point(10,3);
        BucketFill bucketFill = new BucketFill(pointStart);

        assertEquals(10,pointStart.getX());
        assertEquals(3,pointStart.getY());
        assertTrue("true",bucketFill.draw(canvas.getCanvas()));
    }

    @Test
    public void insertBucketFillInCanvas() {
        forTestBucketFillRectangle();
        forTestBucketFillLineHorizontal();
        forTestBucketFillLineVertical();
        createBucketFill();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        canvas.printCanvas('o');


        assertEquals("----------------------\n" +
                "|oooooooooooooooxxxxx|\n" +
                "|xxxxxxooooooooox   x|\n" +
                "|     xoooooooooxxxxx|\n" +
                "|     xoooooooooooooo|\n" +
                "----------------------\n" ,outContent.toString());

    }

    public void forTestBucketFillRectangle() {
        Point pointStart = new Point(16,1);
        Point pointEnd = new Point(20,3);
        Rectangle rectangle = new Rectangle(pointStart,pointEnd);
        rectangle.draw(canvas.getCanvas());
    }

    public void forTestBucketFillLineHorizontal() {
        Point pointStart = new Point(1,2);
        Point pointEnd = new Point(6,2);
        Line line = new Line(pointStart,pointEnd);
        line.draw(canvas.getCanvas());
    }

    public void forTestBucketFillLineVertical() {
        Point pointStart = new Point(6,3);
        Point pointEnd = new Point(6,4);
        Line line = new Line(pointStart,pointEnd);
        line.draw(canvas.getCanvas());
    }


}