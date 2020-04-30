package Canvas;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class CanvasTest {

    @Test
    public void testPrintCanvas() {
        Canvas canvas = new Canvas(20, 4);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        canvas.printCanvas('d');

               assertEquals("----------------------\n" +
                                     "|                    |\n" +
                                     "|                    |\n" +
                                     "|                    |\n" +
                                     "|                    |\n" +
                                     "----------------------\n" ,outContent.toString());
    }
}