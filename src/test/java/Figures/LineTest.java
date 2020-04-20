package Figures;
import Canvas.Canvas;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class LineTest {

    private Canvas canvas = new Canvas(20,4);

    @Test
    public void createLineHorizontal() {
        Point pointStart = new Point(1,2);
        Point pointEnd = new Point(6,2);
        Line line = new Line(pointStart,pointEnd);

        assertEquals(1,pointStart.getX());
        assertEquals(2,pointStart.getY());
        assertEquals(6,pointEnd.getX());
        assertEquals(2,pointEnd.getY());
        assertTrue("true",line.draw(canvas.getCanvas()));
    }
    @Test
    public void createLineVertical() {
        Point pointStart = new Point(6,3);
        Point pointEnd = new Point(6,4);
        Line line = new Line(pointStart,pointEnd);

        assertEquals(6,pointStart.getX());
        assertEquals(3,pointStart.getY());
        assertEquals(6,pointEnd.getX());
        assertEquals(4,pointEnd.getY());
        assertTrue("true",line.draw(canvas.getCanvas()));
    }

    @Test
    public void insertLinesInCanvas() {
        createLineHorizontal();
        createLineVertical();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        canvas.printCanvas('d');


               assertEquals("----------------------\n" +
                                     "|                    |\n" +
                                     "|xxxxxx              |\n" +
                                     "|     x              |\n" +
                                     "|     x              |\n" +
                                     "----------------------\n" ,outContent.toString());
    }

}