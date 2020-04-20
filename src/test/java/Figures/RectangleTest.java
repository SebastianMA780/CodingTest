package Figures;
import Canvas.Canvas;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Canvas canvas;

    @Test
    public void createRectangle() {
        Point pointStart = new Point(16,1);
        Point pointEnd = new Point(20,3);
        Rectangle rectangle = new Rectangle(pointStart,pointEnd);
        canvas = new Canvas(20,4);

        assertEquals(16,pointStart.getX());
        assertEquals(1,pointStart.getY());
        assertEquals(20,pointEnd.getX());
        assertEquals(3,pointEnd.getY());
        assertTrue("true",rectangle.draw(canvas.getCanvas()));


    }

    @Test
    public void insertRectangleInCanvas() {
        createRectangle();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        canvas.printCanvas('d');


               assertEquals("----------------------\n" +
                                     "|               xxxxx|\n" +
                                     "|               x   x|\n" +
                                     "|               xxxxx|\n" +
                                     "|                    |\n" +
                                     "----------------------\n" ,outContent.toString());

    }

}