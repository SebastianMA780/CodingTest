package Figures;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void createPoint() {
        Point point = new Point(3, 5);
        assertEquals(3,point.getX());
        assertEquals(5,point.getY());
    }

}