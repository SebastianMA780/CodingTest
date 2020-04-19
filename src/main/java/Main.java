import Canvas.Canvas;
import Figures.BucketFill;
import Figures.Line;
import Figures.Point;
import Figures.Rectangle;
import java.util.Scanner;

public class Main {
    /*
    static method that allows to create the canvas
    before starting to insert figures on it
    */
    static Canvas createCanvas() {
        Scanner keyBoard = new Scanner(System.in);
        int width;
        int height;

        System.out.print("enter command:C ");
        width = keyBoard.nextInt();
        height = keyBoard.nextInt();
        Canvas canvas = new Canvas(width, height);
        canvas.printCanvas('d');
        return canvas;
    }

      public static void main(String[] args) {
          Scanner keyBoard = new Scanner(System.in);

            int xStart = 0;
            int xEnd = 0;
            int yStart = 0;
            int yEnd = 0;
            char color;
            char option = 'a';
            Canvas canvas;

             canvas = createCanvas();
            do {
                Point pointStart;
                Point pointEnd;

                System.out.print("enter command:");
                option = keyBoard.next().charAt(0);

                switch (option) {
                    case 'L':
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        xEnd = keyBoard.nextInt();
                        yEnd = keyBoard.nextInt();

                         pointStart = new Point(xStart,yStart);
                         pointEnd = new Point(xEnd,yEnd);
                         Line line = new Line(pointStart,pointEnd);

                         if ( line.draw( canvas.getCanvas()) )
                            canvas.printCanvas('d');
                         else
                             break;
                         break;
                    case 'R':
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        xEnd = keyBoard.nextInt();
                        yEnd = keyBoard.nextInt();

                         pointStart = new Point(xStart,yStart);
                         pointEnd = new Point(xEnd,yEnd);
                         Rectangle rectangle = new Rectangle(pointStart,pointEnd);
                         if ( rectangle.draw( canvas.getCanvas()) )
                            canvas.printCanvas('d');
                         else
                            break;
                         break;
                    case 'B':
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        color = keyBoard.next().charAt(0);

                        pointStart = new Point(xStart,yStart);
                        BucketFill bucketFill = new BucketFill(pointStart);
                        if ( bucketFill.draw( canvas.getCanvas()) )
                            canvas.printCanvas(color);
                        else
                            break;
                        break;
                    default:
                        break;
                }
            } while ( option != 'Q' );
    }
}
