package Canvas;
import org.junit.Assert;
import org.junit.Test;

public class CanvasTest {

    @Test
    public void testCreateCanvas() {
        int increment = 2;
       Canvas canvas = new Canvas(20, 4);
        Assert.assertArrayEquals(new byte[4+increment][20+increment],canvas.getCanvas());
    }

/*    @Test
    public void testPrintCanvas() {
        Canvas canvas = new Canvas(20, 4);
        Assert.assertEquals("----------------------\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "----------------------",canvas.printCanvas('c'));
    }*/
}